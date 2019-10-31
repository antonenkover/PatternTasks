package com.fantasy;

public class Troll extends GameCharacter {
    public Troll(String characterType) {
        super(characterType, new Walk());
    }
}
