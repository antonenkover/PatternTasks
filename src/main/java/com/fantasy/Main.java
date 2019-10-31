package com.fantasy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        moveCharacters(addCharacters());
    }

    public static List<GameCharacter> addCharacters() {
        List<GameCharacter> characters = Arrays.asList(
                new Vampire("Vampire"),
                new Troll("Troll"),
                new Pegasus("Pegasus"),
                new Ork("Ork"),
                new Harpia("Harpia"),
                new Elf("Elf")
        );
        return characters;
    }

    public static void moveCharacters(List<GameCharacter> characters) {
        for (GameCharacter character :
                characters) {
            character.move();
        }
    }

}
