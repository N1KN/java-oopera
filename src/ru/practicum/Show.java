package ru.practicum;

import java.util.ArrayList;

public class Show {
    private String title;
    private Director director;
    // Длительность в минутах
    private int duration;
    final ArrayList<Actor> listOfActors;

    public Show(String title, Director director, int duration, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
    }

    public Show(String title, Director director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
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

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден в списке этой постановки.");
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
