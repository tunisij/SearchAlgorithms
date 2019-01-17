package com.umich.tunisij.environment;

import com.umich.tunisij.algorithms.SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchAlgorithmRunner {

    private MazeContext mazeContext = new MazeContext();

    public SearchAlgorithmRunner() {
        this.setMazeState();
    }

    public void run(SearchAlgorithm searchAlgorithm) {
        this.mazeContext = new MazeContext();
        this.setMazeState();

//        while (mazeContext.getCurrentPosition().getKey() != mazeContext.GOAL_ROW && mazeContext.getCurrentPosition().getValue() != mazeContext.GOAL_COLUMN) {
            searchAlgorithm.step(mazeContext);
//        }
    }

    private void setMazeState() {
        this.mazeContext.maze.setStartPosition(MazeContext.START_ROW, MazeContext.START_COLUMN);
        this.mazeContext.maze.setGoalPosition(MazeContext.GOAL_ROW, MazeContext.GOAL_COLUMN);

        List<Map.Entry<Integer, Integer>> wallPositions = new ArrayList<>();
        wallPositions.add(Map.entry(2, 4));
        wallPositions.add(Map.entry(2, 4));
        wallPositions.add(Map.entry(2, 5));
        wallPositions.add(Map.entry(2, 6));
        wallPositions.add(Map.entry(2, 7));
        wallPositions.add(Map.entry(3, 4));
        wallPositions.add(Map.entry(3, 7));
        wallPositions.add(Map.entry(4, 3));
        wallPositions.add(Map.entry(4, 4));
        wallPositions.add(Map.entry(4, 7));
        wallPositions.add(Map.entry(5, 6));
        wallPositions.add(Map.entry(5, 7));
        this.mazeContext.maze.setWallPositions(wallPositions);
    }

}
