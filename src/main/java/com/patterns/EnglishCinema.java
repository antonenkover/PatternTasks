package com.patterns;

public class EnglishCinema implements AbstractCinema {
    @Override
    public Film getFilm() {
        return new EnglishFilm();
    }

    @Override
    public Subtitles getSubtitles() {
        return new EnglishSubtitles();
    }
}
