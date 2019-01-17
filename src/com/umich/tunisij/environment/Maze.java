package com.umich.tunisij.environment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Maze {

    private String[][] maze;

    private int startRow;
    private int startColumn;
    private int goalRow;
    private int goalColumn;
    private List<Map.Entry<Integer, Integer>> wallPositions = new ArrayList<>();

    public Maze(final int lengthRow, final int lengthColumn) {
        this.initializeMaze(lengthRow, lengthColumn);
    }

    public String[][] getMaze() {
        return this.maze;
    }

    public boolean setValueByPosition(String value, int row, int column) {
        if (this.maze[row][column].equals("[]")) {
            this.maze[row][column] = value;
            return true;
        }
        return false;
    }

    public int getManhattanDistance(int fromRow, int fromColumn) {
        int rowDiff = this.goalRow - fromRow;
        int columnDiff = this.goalColumn - fromColumn;

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
        for (int row = 0; row < this.maze.length; row++) {
            for (int column = 0; column < this.maze[0].length; column++) {
                this.maze[row][column] = getManhattanDistance(row, column) + "";
            }
        }
        this.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                sb.append(maze[row][column] + "\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private void initializeMaze(int lengthRow, int lengthColumn) {
        this.maze =  new String[lengthRow][lengthColumn];

        for (int row = 0; row < lengthRow; row++) {
            for (int column = 0; column < lengthColumn; column++) {
                this.maze[row][column] = "[]";
            }
        }
    }

    public void setStartPosition(int row, int column) {
        this.startRow = row;
        this.startColumn = column;
        this.maze[row][column] = "00";
    }

    public void setGoalPosition(int row, int column) {
        this.goalRow = row;
        this.goalColumn = column;
        this.maze[row][column] = "GG";
    }

    public void setWallPositions(List<Map.Entry<Integer, Integer>> wallPositions) {
        this.wallPositions = wallPositions;

        for (Map.Entry<Integer, Integer> wallPosition : wallPositions) {
            this.maze[wallPosition.getKey()][wallPosition.getValue()] = "##";
        }
    }

    public int getLength() {
        return this.maze[0].length;
    }

    public int getHeight() {
        return this.maze.length;
    }

}
