package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;
import com.umich.tunisij.environment.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearchAlgorithm implements SearchAlgorithm {

    public Queue<Node> queue = new LinkedList<>();

    @Override
    public void run(MazeContext mazeContext) {
        Node startNode = mazeContext.getNode(Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN));
        queue.add(startNode);
        mazeContext.visit(startNode.getPosition());

        while (!queue.isEmpty() && !mazeContext.isGoalReached()) {
            Node node = queue.remove();
            
            mazeContext.getAdjacentPositions(node.getPosition()).forEach(neighborPosition -> {
                if (!mazeContext.isVisited(neighborPosition)) {
                    Node neighbor = mazeContext.getNode(neighborPosition);
                    neighbor.setPrevious(node);
                    queue.add(neighbor);
                    mazeContext.visit(neighborPosition);
                }
            });
        }
    }

}
