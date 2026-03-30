package ru.practicum;

import java.util.ArrayList;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, Director director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, Director director, String musicAuthor, String librettoText) {
        super(title, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibretto() {
        System.out.println(librettoText);
    }
}
