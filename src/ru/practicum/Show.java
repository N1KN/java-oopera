package ru.practicum;

import java.util.ArrayList;

public class Show {
    private String title;
    private Director director;
    final ArrayList<Actor> listOfActors;

    public Show(String title, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public Show(String title, Director director) {
        this.title = title;
        this.director = director;
        this.listOfActors = new ArrayList<Actor>();
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printListOfActors() {
        for (Actor actor : this.listOfActors) {
            System.out.println(actor);
        }
    }

    private boolean hasActorInList(Actor actor) {
        // Метод проверяет наличие актёра в списке с помощью Actor.equals()
        return this.listOfActors.contains(actor);
    }

    public void addActor(Actor actor) {
        if (this.hasActorInList(actor)) {
            System.out.println("Этот актёр уже добавлен в список этой постановки.");
            return;
        }

        this.listOfActors.add(actor);
    }

    // Setters and getters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

}
