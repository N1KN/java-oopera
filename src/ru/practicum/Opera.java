package ru.practicum;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, Director director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText, int choirSize) {
        super(title, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(String title, Director director, String musicAuthor, String librettoText, int choirSize) {
        super(title, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}
