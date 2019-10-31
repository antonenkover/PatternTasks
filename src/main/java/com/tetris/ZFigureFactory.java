package com.tetris;

public class ZFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new ZFigure();
    }
}
