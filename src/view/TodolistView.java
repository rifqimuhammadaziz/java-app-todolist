package view;

import entity.Todolist;
import service.TodolistService;
import util.InputUtil;

public class TodolistView {

    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    // Main Menu
    public void showTodolist() {
        while (true) {
            todolistService.showTodolist();

            System.out.println("Menu");
            System.out.println("1. Add Todo");
            System.out.println("1. Remove Todo");
            System.out.println("(x) to exit application.");

            var input = InputUtil.input("Choose Menu");

            if (input.equals("1")) {
                addTodolist();
            } else if (input.equals("2")) {
                removeTodolist();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Unknown Input!");
            }
        }
    }

    // View to add Todolist
    public void addTodolist() {

    }

    // View to remove Todolist
    public void removeTodolist() {

    }

}
