package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {

    public static void main(String[] args) {
        testShowTodolist();
    }

    public static void testShowTodolist() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Todolist pertama");
        todolistRepository.data[1] = new Todolist("Todolist kedua");
        todolistRepository.data[2] = new Todolist("Todolist ketiga");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodolist();
    }
}
