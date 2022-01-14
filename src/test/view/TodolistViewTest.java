package test.view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class TodolistViewTest {

    public static void main(String[] args) {
        testAddTodolist();
    }

    public static void testShowTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Todolist pertama");
        todolistService.addTodolist("Todolist kedua");
        todolistService.addTodolist("Todolist ketiga");
        todolistService.addTodolist("Todolist keempat");
        todolistService.addTodolist("Todolist kelimat");

        todolistView.showTodolist();
    }

    public static void testAddTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.addTodolist();
        todolistView.showTodolist();
        todolistView.addTodolist();
        todolistView.showTodolist();
    }
}
