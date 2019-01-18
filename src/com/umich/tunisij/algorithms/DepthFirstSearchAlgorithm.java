package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;

import java.util.Map;
import java.util.Stack;

public class DepthFirstSearchAlgorithm implements SearchAlgorithm {

    Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();

    @Override
    public void run(MazeContext mazeContext) {
        Map.Entry<Integer, Integer> startNode = Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN);
        stack.add(startNode);
        mazeContext.visit(startNode);

        while(!stack.isEmpty()) {
            System.out.println(mazeContext.toString());
            Map.Entry<Integer, Integer> node = stack.pop();

            mazeContext.getAdjacentPositions(node).forEach(neighbor -> {
                if (!mazeContext.isVisited(neighbor)) {
                    stack.add(neighbor);
                    mazeContext.visit(neighbor);
                }
            });
        }

    }
}
