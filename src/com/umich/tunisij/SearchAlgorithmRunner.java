package com.umich.tunisij;

import com.umich.tunisij.algorithms.DepthFirstSearchAlgorithm;
import com.umich.tunisij.algorithms.IterativeDeepeningSearchAlgorithm;
import com.umich.tunisij.algorithms.SearchAlgorithm;
import com.umich.tunisij.environment.MazeContext;

import java.util.Date;

public class SearchAlgorithmRunner {

    //    public static void main(String[] args) {
//        SearchAlgorithmRunner sar = new SearchAlgorithmRunner();
//        sar.run(new BreadthFirstSearchAlgorithm());
//        sar.run(new DepthFirstSearchAlgorithm());
//        sar.run(new UniformCostSearchAlgorithm());
//        sar.run(new GreedyBestFirstSearchAlgorithm());
//        sar.run(new AStarSearchAlgorithm());
//        sar.run(new IterativeDeepeningSearchAlgorithm());
//    }

    public static void main(String[] args) {
        SearchAlgorithmRunner sar = new SearchAlgorithmRunner();
        sar.run(new DepthFirstSearchAlgorithm());
        sar.run(new IterativeDeepeningSearchAlgorithm());
    }

    public void run(SearchAlgorithm searchAlgorithm) {
        MazeContext mazeContext = new MazeContext();

        searchAlgorithm.run(mazeContext);
        System.out.println(searchAlgorithm.getClass());
        System.out.println(new Date());
        System.out.println(mazeContext.toString());
        System.out.println("");
    }
}
