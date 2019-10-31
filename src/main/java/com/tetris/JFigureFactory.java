package com.tetris;

public class JFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new JFigure();
    }
}
