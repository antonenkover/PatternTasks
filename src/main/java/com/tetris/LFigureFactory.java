package com.tetris;

public class LFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new LFigure();
    }
}
