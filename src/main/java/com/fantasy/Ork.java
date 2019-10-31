package com.fantasy;

public class Ork extends GameCharacter {
    public Ork(String characterType) {
        super(characterType, new Walk());
    }
}
