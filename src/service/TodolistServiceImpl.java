package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {
        System.out.println("---------------");
        System.out.println("TODOLIST MENU");
        System.out.println("---------------");

        Todolist[] model = todolistRepository.getAll();
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var number = i + 1;

            if (todo != null) {
                System.out.println(number + ". " + todo);
            }
        }
    }

    @Override
    public void addTodolist(String todo) {

    }

    @Override
    public void removeTodolist(Integer number) {

    }
}
