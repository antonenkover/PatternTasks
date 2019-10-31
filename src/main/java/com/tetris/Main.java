package com.tetris;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<FigureFactory> figures;
        Random random;
        figures = Arrays.asList(
                new JFigureFactory(),
                new IFigureFactory(),
                new TFigureFactory(),
                new OFigureFactory(),
                new ZFigureFactory(),
                new LFigureFactory());
        random = new Random();
        FigureFactory figureFactory = figures.get(random.nextInt(figures.size()));
        for (int i = 0; i < 10; ++i) {
            System.out.println(figureFactory.createFigure());
            figureFactory = figures.get(random.nextInt(figures.size()));
        }
    }
}
