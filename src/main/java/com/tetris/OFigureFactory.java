package com.tetris;

public class OFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new OFigure();
    }
}
