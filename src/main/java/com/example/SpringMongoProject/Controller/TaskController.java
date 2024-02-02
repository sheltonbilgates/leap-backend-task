package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Task;
import com.example.SpringMongoProject.Service.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin( orgins = "*")
@RequestMapping("api/v1/task")
public class TaskController {


    @Autowired
    private TaskServices taskServices;

    @PostMapping(value = "/save")
    private String saveTask(@RequestBody Task tasks){

        taskServices.saveorUpdate(tasks);
        return tasks.getId();
    }

    @GetMapping(value = "/getAll")
    private Iterable<Task>getTasks(){


        return taskServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private  Task update(@RequestBody Task task,@PathVariable(name="id")String _id) {

        task.setId(_id);
        taskServices.saveorUpdate(task);
        return task;
    }

    @DeleteMapping("delete/{id}")
    private  void deleteTask(@PathVariable("id") String _id ) {


        taskServices.deleteTask(_id);

    }
}
