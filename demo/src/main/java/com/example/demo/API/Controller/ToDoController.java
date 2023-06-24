package com.example.demo.API.Controller;

import com.example.demo.API.Model.Task;
import com.example.demo.API.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    private ToDoRepository toDoRepository;
    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return toDoRepository.findAll();
    }
    @PostMapping("/saveTask")
    public String saveTask(@RequestBody Task task){
        toDoRepository.save(task);
        return "Saved Task";
    }
    @PutMapping("/update/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody Task task){
        Task updateTask = toDoRepository.findById(id).get();
        updateTask.setTitle(task.getTitle());
        updateTask.setDescription(task.getDescription());
        toDoRepository.save(updateTask);
        return "Update Task";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id){
        Task deleteTask = toDoRepository.findById(id).get();
        toDoRepository.delete(deleteTask);
        return "Deleted Task";
    }
}
