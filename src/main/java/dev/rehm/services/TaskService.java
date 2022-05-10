package dev.rehm.services;

import dev.rehm.models.Task;
import dev.rehm.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTaskRecords(){
        return taskRepository.findAll();
    }

    public Task addNewTaskRecord(Task task){
        return taskRepository.save(task);
    }


}
