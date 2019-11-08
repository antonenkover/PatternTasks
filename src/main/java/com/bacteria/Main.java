package com.bacteria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BacteriaFactory bacteriaFactory = new BacteriaFactory();
        List<Bacteria> bacteriaList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bacteriaList.add(bacteriaFactory.getBacteriaByType("A"));
            bacteriaList.add(bacteriaFactory.getBacteriaByType("B"));
            bacteriaList.add(bacteriaFactory.getBacteriaByType("C"));
        }
        bacteriaList.forEach(Bacteria::reproduce);
    }

}
