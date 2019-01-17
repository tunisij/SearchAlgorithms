package com.umich.tunisij.environment;

public enum Direction {
    NORTH(1),
    EAST(2),
    WEST(2),
    SOUTH(3);

    private int cost;

    Direction(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }
}
