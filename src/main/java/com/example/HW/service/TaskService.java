package com.example.HW.service;

import com.example.HW.Repository.TaskRepository;

import com.example.HW.model.Task;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/*		1. Добавление задачи.
		2. Просмотр всех задач.
3. Просмотр задач по статусу (например, "завершена", "в процессе", "не начата").
		4. Изменение статуса задачи.
5. Удаление задачи.*/

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public List<Task> getAllTasks() {

        return repository.findAll();
    }
    public Task addTask(Task task){
    task.setStatus(Task.Status.NOT_STARTED);
    return repository.save(task);

    }
    public void deleteTask(Long id){
        repository.deleteById(id);
    }
    public Task changeStatus(Long id, Task.Status status){
        Optional<Task> optionalTask =repository.findById(id);
        if (optionalTask.isPresent()){
            Task chandeTask = optionalTask.get();
            chandeTask.setStatus(status);
            return repository.save(chandeTask);

        }
        else {
            throw new IllegalArgumentException("Task not found by Id");
        }


    }
    public List<Task> getTaskByStatus(Task.Status status){

        return repository.findByStatus(status);
    }





}



