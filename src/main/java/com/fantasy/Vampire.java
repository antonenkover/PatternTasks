package com.fantasy;

public class Vampire extends GameCharacter {
    public Vampire(String characterType) {
        super(characterType, new FlyWithMagic());
    }
}
