package com.umich.tunisij;

import com.umich.tunisij.algorithms.BreadthFirstSearchAlgorithm;
import com.umich.tunisij.environment.SearchAlgorithmRunner;

public class SearchAlgorithmMain {

    public static void main(String[] args) {
        SearchAlgorithmRunner sar = new SearchAlgorithmRunner();
        sar.run(new BreadthFirstSearchAlgorithm());
//        System.out.println(sar.getMaze().toString());
    }
}
