package com.fantasy;

public class Pegasus extends GameCharacter {
    public Pegasus(String characterType) {
        super(characterType, new FlyWithMagic());
    }
}
