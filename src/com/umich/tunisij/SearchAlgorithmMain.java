package com.umich.tunisij;

import com.umich.tunisij.environment.SearchAlgorithmRunner;

public class SearchAlgorithmMain {

    public static void main(String[] args) {
        SearchAlgorithmRunner sar = new SearchAlgorithmRunner();
        System.out.println(sar.getMaze().toString());
    }
}
