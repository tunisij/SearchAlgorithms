package com.umich.tunisij;

public class Maze {

    private String[][] maze;

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
        int distance = 0;



        return distance;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < maze.length; row++) {
            for (int column = 0; column < maze[row].length; column++) {
                sb.append(maze[row][column]);
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
        this.maze[row][column] = "00";
    }

    public void setGoalPosition(int row, int column) {
        this.maze[row][column] = "GG";
    }

    public void setWallPosition(int row, int column) {
        this.maze[row][column] = "##";
    }

}
