package com.patterns;

public class FrenchCinema implements AbstractCinema {
    @Override
    public Film getFilm() {
        return new FrenchFilm();
    }

    @Override
    public Subtitles getSubtitles() {
        return new FrenchSubtitles();
    }
}
