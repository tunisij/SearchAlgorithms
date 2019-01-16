package com.umich.tunisij.environment;

public class SearchAlgorithmRunner {

    private static final int START_ROW = 4;
    private static final int START_COLUMN = 5;
    private static final int GOAL_ROW = 0;
    private static final int GOAL_COLUMN = 10;

    private Maze maze = new Maze(8, 11);

    private int stepCounter = 0;

    public SearchAlgorithmRunner() {
        this.setMazeState();
    }

    public void step(Direction direction) {
//        this.maze.setValueByPosition(this.stepCounter);
    }

    public Maze getMaze() {
        return this.maze;
    }

    private void setMazeState() {
        this.maze.setStartPosition(START_ROW, START_COLUMN);
        this.maze.setGoalPosition(GOAL_ROW, GOAL_COLUMN);

        this.maze.setWallPosition(2, 4);
        this.maze.setWallPosition(2, 5);
        this.maze.setWallPosition(2, 6);
        this.maze.setWallPosition(2, 7);
        this.maze.setWallPosition(3, 4);
        this.maze.setWallPosition(3, 7);
        this.maze.setWallPosition(4, 3);
        this.maze.setWallPosition(4, 4);
        this.maze.setWallPosition(4, 7);
        this.maze.setWallPosition(5, 6);
        this.maze.setWallPosition(5, 7);
    }

}
