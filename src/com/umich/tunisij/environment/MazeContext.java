package com.umich.tunisij.environment;

import java.util.*;
import java.util.stream.Collectors;

public class MazeContext {

    protected Maze maze = new Maze(8, 11);

    public static final int START_ROW = 4;
    public static final int START_COLUMN = 5;
    protected static final int GOAL_ROW = 0;
    protected static final int GOAL_COLUMN = 10;

    private int stepCounter = 0;
    private List<Map.Entry<Integer, Integer>> visited;

    public MazeContext() {
        visited = new LinkedList<>();
    }

    public List<Map.Entry<Integer, Integer>> getAdjacentPositions(Map.Entry<Integer, Integer> node) {
        List<Map.Entry<Integer, Integer>> adjacentPositions = new ArrayList<>();
        adjacentPositions.add(Map.entry(node.getKey() + 1, node.getValue()));
        adjacentPositions.add(Map.entry(node.getKey(), node.getValue() + 1));
        adjacentPositions.add(Map.entry(node.getKey() - 1, node.getValue()));
        adjacentPositions.add(Map.entry(node.getKey(), node.getValue() - 1));

        return adjacentPositions.stream().filter(position -> {
            if (position.getKey() < 0 || position.getValue() < 0 || position.getKey() >= maze.getHeight() || position.getValue() >= maze.getLength()) {
                return false;
            }
            String value = maze.getMaze()[position.getKey()][position.getValue()];
            if (value.equals("[]") || value.equals("GG")) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public boolean isVisited(Map.Entry<Integer, Integer> node) {
        return visited.contains(node);
    }

    public void visit(Map.Entry<Integer, Integer> node) {
        visited.add(node);
        maze.getMaze()[node.getKey()][node.getValue()] = "" + stepCounter++;
    }

    public String toString() {
        return maze.toString();
    }

}
