package ru.practicum;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, Director director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText, String choreographer) {
        super(title, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(String title, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}
