package ru.practicum;

import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, Director director, int duration, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, director, duration, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, Director director, int duration, Person musicAuthor, String librettoText) {
        super(title, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibretto() {
        System.out.println(librettoText);
    }
}
