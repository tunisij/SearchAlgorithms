package com.umich.tunisij.algorithms;

import com.umich.tunisij.environment.MazeContext;
import com.umich.tunisij.environment.Node;

import java.util.*;

public class IterativeDeepeningSearchAlgorithm implements SearchAlgorithm {

    MazeContext mazeContext;
    boolean targetFound = false;

    @Override
    public void run(MazeContext mazeContext) {
        this.mazeContext = mazeContext;
        Node startNode = mazeContext.getNode(Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN));
//        stack.add(startNode);
//        mazeContext.visit(startNode.getPosition());

//        for (int depth = 0; depth < 4; depth++) {
//            System.out.println(mazeContext.toString());
//            mazeContext.setMazeState();
//            depthLimitedSearch(startNode, depth);
//        }

        int depth = 0;
        while (!mazeContext.isGoalReached()) {
//            System.out.println(mazeContext.toString());
            mazeContext.setMazeState();
            depthLimitedSearch(startNode, depth++);
        }
    }

    public void depthLimitedSearch(Node startNode, int depth) {
        Stack<Node> stack = new Stack<>();
        stack.push(startNode);
        mazeContext.visit(startNode.getPosition());

        while (!stack.isEmpty() && !mazeContext.isGoalReached()) {
            Node node = stack.pop();

            if (node.getDepth() >= depth) {
                continue;
            }

            List<Node> neighbors = new ArrayList<>();
            mazeContext.getAdjacentPositions(node.getPosition()).forEach(neighborPosition -> {
                if (!mazeContext.isVisited(neighborPosition)) {
                    Node neighbor = mazeContext.getNode(neighborPosition);
                    neighbor.setPrevious(node);
                    neighbors.add(neighbor);
                    mazeContext.visit(neighborPosition);
                }
            });

            Collections.reverse(neighbors);
            neighbors.forEach(neighbor -> stack.push(neighbor));
        }
    }

}