package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;

import java.util.*;

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

            List<Map.Entry<Integer, Integer>> neighbors = new ArrayList<>();
            mazeContext.getAdjacentPositions(node).forEach(neighbor -> {
                if (!mazeContext.isVisited(neighbor)) {
                    mazeContext.visit(neighbor);
                    neighbors.add(neighbor);
                }
            });

            Collections.reverse(neighbors);
            neighbors.forEach(neighbor -> stack.add(neighbor));
        }

    }
}
