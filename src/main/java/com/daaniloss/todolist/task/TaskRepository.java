package com.daaniloss.todolist.task;


import java.util.List;
import java.util.UUID;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findByIdUser(UUID idUser);
}
