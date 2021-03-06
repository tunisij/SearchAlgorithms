package com.umich.tunisij.environment;

import com.umich.tunisij.algorithms.*;

import java.util.Date;
import java.util.Map;

public class SearchAlgorithmRunner {

    public static void main(String[] args) {
        SearchAlgorithmRunner sar = new SearchAlgorithmRunner();
        sar.run(new BreadthFirstSearchAlgorithm());
        sar.run(new DepthFirstSearchAlgorithm());
        sar.run(new UniformCostSearchAlgorithm());
        sar.run(new GreedyBestFirstSearchAlgorithm());
        sar.run(new AStarSearchAlgorithm());
        sar.run(new IterativeDeepeningSearchAlgorithm());
    }

    public void run(SearchAlgorithm searchAlgorithm) {
        MazeContext mazeContext = new MazeContext();

        searchAlgorithm.run(mazeContext);
        System.out.println(searchAlgorithm.getClass());
        System.out.println(new Date());
        System.out.println(mazeContext.toString());
        System.out.println("Route taken: " + mazeContext.getNode(Map.entry(mazeContext.GOAL_ROW, mazeContext.GOAL_COLUMN)).toString());
        System.out.println("");
    }
}
