package com.dreambricks.yopro_machine;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {

    boolean existsByTelHash(String telHash);
}
