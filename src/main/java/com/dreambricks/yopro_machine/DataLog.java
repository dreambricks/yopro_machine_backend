package com.dreambricks.yopro_machine;

import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "datalogs")
public class DataLog {

    @Id
    String id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date uploadedData;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date timePlayed;
    String status;

    public DataLog() {
    }

    public DataLog(String id, Date uploadedData, Date timePlayed, String status) {
        this.id = id;
        this.uploadedData = uploadedData;
        this.timePlayed = timePlayed;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUploadedData() {
        return uploadedData;
    }

    public void setUploadedData(Date uploadedData) {
        this.uploadedData = uploadedData;
    }

    public Date getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Date timePlayed) {
        this.timePlayed = timePlayed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
