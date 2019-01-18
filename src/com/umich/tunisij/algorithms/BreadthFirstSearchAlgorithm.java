package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearchAlgorithm implements SearchAlgorithm {

    public Queue<Map.Entry<Integer, Integer>> queue = new LinkedList<>();

    @Override
    public void run(MazeContext mazeContext) {
        Map.Entry<Integer, Integer> startNode = Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN);
        queue.add(startNode);
        mazeContext.visit(startNode);

        while (!queue.isEmpty()) {
            System.out.println(mazeContext.toString());
            Map.Entry<Integer, Integer> node = queue.remove();
            
            mazeContext.getAdjacentPositions(node).forEach(neighbor -> {
                if (!mazeContext.isVisited(neighbor)) {
                    queue.add(neighbor);
                    mazeContext.visit(neighbor);
                }
            });
        }
    }

}
