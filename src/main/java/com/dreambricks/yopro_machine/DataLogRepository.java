package com.dreambricks.yopro_machine;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public interface DataLogRepository extends MongoRepository<DataLog, String> {
    Page<DataLog> findByTimePlayedBetween(@DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate, Pageable pageable);
    Page<DataLog> findByStatusAndTimePlayedBetween(String status, @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate, Pageable pageable);
    Page<DataLog> findByStatus(String status, Pageable pageable);


    @Aggregation(pipeline = {
            "{$group: {_id: '$status', count: {$sum: 1}}}",
            "{$sort: {_id: 1}}",
            "{$project: {status: '$_id', _id: 0, count: 1}}"
    })
    List<StatusCount> countStatusOccurrences();


    @Query(value = "{'uploadedData': {$ne: null}}", sort = "{'uploadedData': -1}")
    List<DataLog> findLatestUploadedData();

    List<DataLog> findAllByOrderByTimePlayedDesc();

}
