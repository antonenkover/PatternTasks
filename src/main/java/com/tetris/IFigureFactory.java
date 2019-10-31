package com.tetris;

public class IFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new IFigure();
    }
}
