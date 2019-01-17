package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.Direction;
import com.umich.tunisij.environment.MazeContext;

public class BreadthFirstSearchAlgorithm implements SearchAlgorithm {

    @Override
    public Direction step(MazeContext mazeContext) {
//        boolean[][] visited = new boolean[][];
        System.out.println(mazeContext.getAdjacentPositions());

        return Direction.NORTH;
    }

}
