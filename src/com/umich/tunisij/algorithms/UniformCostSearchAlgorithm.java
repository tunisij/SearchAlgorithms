package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.Direction;
import com.umich.tunisij.environment.MazeContext;

public class UniformCostSearchAlgorithm implements SearchAlgorithm {

    @Override
    public Direction step(MazeContext mazeContext) {
        return Direction.NORTH;
    }
}
