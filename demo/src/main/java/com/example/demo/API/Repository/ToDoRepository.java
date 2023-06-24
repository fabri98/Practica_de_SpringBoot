package com.example.demo.API.Repository;

import com.example.demo.API.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<Task, Long> {
}
