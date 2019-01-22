package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;
import com.umich.tunisij.environment.Node;

import java.util.*;

public class DepthFirstSearchAlgorithm implements SearchAlgorithm {

    Stack<Node> stack = new Stack<>();

    @Override
    public void run(MazeContext mazeContext) {
        Node startNode = mazeContext.getNode(Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN));
        stack.add(startNode);
        mazeContext.visit(startNode.getPosition());

        while(!stack.isEmpty() && !mazeContext.isGoalReached()) {
            Node node = stack.pop();

            List<Node> neighbors = new ArrayList<>();
            mazeContext.getAdjacentPositions(node.getPosition()).forEach(neighborPosition -> {
                if (!mazeContext.isVisited(neighborPosition)) {
                    Node neighbor = mazeContext.getNode(neighborPosition);
                    neighbor.setPrevious(node);
                    mazeContext.visit(neighborPosition);
                    neighbors.add(neighbor);
                }
            });

            Collections.reverse(neighbors);
            neighbors.forEach(neighbor -> stack.add(neighbor));
        }

    }
}
