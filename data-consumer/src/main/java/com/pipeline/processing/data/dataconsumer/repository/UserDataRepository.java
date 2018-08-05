package com.pipeline.processing.data.dataconsumer.repository;

import com.pipeline.processing.data.dataconsumer.domain.UserData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDataRepository extends MongoRepository<UserData, Integer> {
}
