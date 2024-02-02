package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepo extends MongoRepository<Task, String> {

}
