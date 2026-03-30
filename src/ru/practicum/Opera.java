package ru.practicum;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, Director director, int duration, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, int choirSize) {
        super(title, director, duration, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(String title, Director director, int duration, Person musicAuthor, String librettoText, int choirSize) {
        super(title, director, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}
