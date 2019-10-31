package com.tetris;

public class Figure {
    Integer[][] figureShape;

    public Figure(Integer[][] shape) {
        this.figureShape = shape;
    }

    @Override
    public String toString() {
        StringBuilder resB = new StringBuilder();
        for (int i = 0; i < figureShape.length; ++i) {
            for (int j = 0; j < figureShape[i].length; ++j) {
                if (figureShape[i][j] == 1)
                    resB.append("*");
                if (figureShape[i][j] == 0)
                    resB.append(" ");
            }
            resB.append("\n");
        }

        return resB.toString();
    }
}
