package com.fantasy;

public class GameCharacter {
    String characterType;
    MovementStrategy movementStrategy;

    public GameCharacter(String characterType, MovementStrategy movementStrategy) {
        this.characterType = characterType;
        this.movementStrategy = movementStrategy;
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        System.out.println(String.format("%s: %s", characterType, movementStrategy.move()));
    }
}
