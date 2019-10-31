package com.patterns;

public class UkrainianCinema implements AbstractCinema {
    @Override
    public Film getFilm() {
        return new UkrainianFilm();
    }

    @Override
    public Subtitles getSubtitles() {
        return new UkrainianSubtitles();
    }
}
