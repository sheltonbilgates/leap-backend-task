package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Task;
import com.example.SpringMongoProject.Repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServices {

    @Autowired
    private TaskRepo repo;


    public void saveorUpdate(Task tasks) {

        repo.save(tasks);

    }

    public Iterable<Task> listAll() {
        return this.repo.findAll();
    }

    public void deleteTask(String id) {
        repo.deleteById(id);
    }

}
