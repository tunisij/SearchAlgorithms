package com.umich.tunisij.environment;

import java.util.List;
import java.util.Map;

public class Maze {

    private Node[][] maze;

    private int startRow;
    private int startColumn;
    private int goalRow;
    private int goalColumn;

    public Maze(final int lengthRow, final int lengthColumn) {
        initializeMaze(lengthRow, lengthColumn);
    }

    public Node[][] getMaze() {
        return maze;
    }

    public boolean setValueByPosition(String value, int row, int column) {
        if (maze[row][column].getValue().equals("[]")) {
            maze[row][column].setValue(value);
            return true;
        }
        return false;
    }

    public int getManhattanDistance(int fromRow, int fromColumn, int toRow, int toColumn) {
        int rowDiff = toRow - fromRow;
        int columnDiff = toColumn - fromColumn;

        if (rowDiff < 0) {
            rowDiff *= Direction.NORTH.getCost();
        } else if (rowDiff > 0) {
            rowDiff *= Direction.SOUTH.getCost();
        }

        if (columnDiff < 0) {
            columnDiff *= Direction.EAST.getCost();
        } else if (columnDiff > 0) {
            columnDiff *= Direction.WEST.getCost();
        }

        return Math.abs(rowDiff) + Math.abs(columnDiff);
    }

    public void displayManhattanDistance() {
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < this.maze[0].length; column++) {
                maze[row][column].setValue(getManhattanDistance(row, column, goalRow, goalColumn) + "");
            }
        }
        this.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                sb.append(maze[row][column].getValue() + "\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private void initializeMaze(int lengthRow, int lengthColumn) {
        maze = new Node[lengthRow][lengthColumn];

        for (int row = 0; row < lengthRow; row++) {
            for (int column = 0; column < lengthColumn; column++) {
                maze[row][column] = new Node(Map.entry(row, column), getManhattanDistance(row, column, startRow, startColumn), null);
                maze[row][column].setValue("[]");
            }
        }
    }

    public void setStartPosition(int row, int column) {
        startRow = row;
        startColumn = column;
        maze[row][column].setValue("0");
    }

    public void setGoalPosition(int row, int column) {
        goalRow = row;
        goalColumn = column;
        maze[row][column].setValue("GG");
    }

    public void setWallPositions(List<Map.Entry<Integer, Integer>> wallPositions) {
        for (Map.Entry<Integer, Integer> wallPosition : wallPositions) {
            maze[wallPosition.getKey()][wallPosition.getValue()].setValue("##");
        }
    }

    public int getLength() {
        return this.maze[0].length;
    }

    public int getHeight() {
        return this.maze.length;
    }

    public Node getNode(Map.Entry<Integer, Integer> position) {
        return maze[position.getKey()][position.getValue()];
    }

}
