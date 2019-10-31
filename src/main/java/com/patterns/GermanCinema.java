package com.patterns;

public class GermanCinema implements AbstractCinema {
    @Override
    public Film getFilm() {
        return new GermanFilm();
    }

    @Override
    public Subtitles getSubtitles() {
        return new GermanSubtitles();
    }
}
