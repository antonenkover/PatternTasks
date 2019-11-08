package com.bacteria;

import java.util.HashMap;
import java.util.Map;

public class BacteriaFactory {

    private Map<String, Bacteria> bacteriaMap = new HashMap<>();

    public Bacteria getBacteriaByType(String bacteriaType) {
        Bacteria bacteria = bacteriaMap.get(bacteriaType);
        if (bacteria == null) {
            switch (bacteriaType) {
                case "A":
                    System.out.println("Bacteria A has appeared!");
                    bacteria = new BacteriaA();
                    break;
                case "B":
                    System.out.println("Bacteria B has appeared!");
                    bacteria = new BacteriaB();
                    break;
                case "C":
                    System.out.println("Bacteria C has appeared!");
                    bacteria = new BacteriaC();
                    break;
            }
            bacteriaMap.put(bacteriaType, bacteria);
        }
        return bacteria;
    }
}
