package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.Direction;
import com.umich.tunisij.environment.MazeContext;

public interface SearchAlgorithm {

    public Direction step(MazeContext mazeContext);
}
