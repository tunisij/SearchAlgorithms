package com.umich.tunisij.environment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MazeContext {

    protected Maze maze = new Maze(8, 11);

    protected static final int START_ROW = 4;
    protected static final int START_COLUMN = 5;
    protected static final int GOAL_ROW = 0;
    protected static final int GOAL_COLUMN = 10;

    private int stepCounter = 0;
    private Map.Entry<Integer, Integer> currentPosition;

    public MazeContext() {
        currentPosition = Map.entry(START_ROW, START_COLUMN);
    }

    public Map.Entry<Integer, Integer> getCurrentPosition() {
        return this.currentPosition;
    }

    public List<Map.Entry<Integer, Integer>> getAdjacentPositions() {
        List<Map.Entry<Integer, Integer>> adjacentPositions = new ArrayList<>();
        adjacentPositions.add(Map.entry(currentPosition.getKey() + 1, currentPosition.getValue()));
        adjacentPositions.add(Map.entry(currentPosition.getKey(), currentPosition.getValue() + 1));
        adjacentPositions.add(Map.entry(currentPosition.getKey() - 1, currentPosition.getValue()));
        adjacentPositions.add(Map.entry(currentPosition.getKey(), currentPosition.getValue() - 1));

        return adjacentPositions.stream().filter(position -> {
            if (position.getKey() < 0 || position.getValue() < 0 || position.getKey() >= maze.getLength() || position.getValue() >= maze.getHeight()) {
                return false;
            }
            String value = maze.getMaze()[position.getKey()][position.getValue()];
            if (value.equals("[]") || value.equals("GG")) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    protected void setCurrentPosition(Direction direction) {
//        this.currentPosition = ;
    }

}
