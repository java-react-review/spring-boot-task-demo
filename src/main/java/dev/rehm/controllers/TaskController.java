package dev.rehm.controllers;

import dev.rehm.models.Task;
import dev.rehm.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getTasks(){
        return taskService.getAllTaskRecords();
    }

    @PostMapping
    public ResponseEntity<Task> postTask(@RequestBody Task task){
        Task addedTask = taskService.addNewTaskRecord(task);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }
}
