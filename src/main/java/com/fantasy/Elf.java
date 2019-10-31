package com.fantasy;

public class Elf extends GameCharacter {
    public Elf(String characterType) {
        super(characterType, new WalkAndFly());
    }
}
