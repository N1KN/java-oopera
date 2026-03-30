package ru.practicum;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, Director director, int duration, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, director, duration, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(String title, Director director, int duration, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, director, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
