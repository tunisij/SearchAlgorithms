package com.umich.tunisij;

public enum Direction {
    NORTH(1),
    EAST(2),
    WEST(3),
    SOUTH(4);

    private int cost;

    Direction(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }
}
