package com.tetris;

public class TFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new TFigure();
    }
}
