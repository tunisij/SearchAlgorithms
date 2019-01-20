package com.umich.tunisij;

import com.umich.tunisij.algorithms.GreedyBestFirstSearchAlgorithm;
import com.umich.tunisij.environment.SearchAlgorithmRunner;

public class SearchAlgorithmMain {

    public static void main(String[] args) {
        SearchAlgorithmRunner sar = new SearchAlgorithmRunner();
//        sar.run(new BreadthFirstSearchAlgorithm());
//        sar.run(new DepthFirstSearchAlgorithm());
//        sar.run(new UniformCostSearchAlgorithm());
        sar.run(new GreedyBestFirstSearchAlgorithm());
    }
}
