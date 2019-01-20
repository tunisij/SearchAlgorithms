//package com.umich.tunisij.algorithms;
//
//import com.umich.tunisij.environment.MazeContext;
//
//import java.util.Map;
//import java.util.PriorityQueue;
//
//public class UniformCostSearchAlgorithm implements SearchAlgorithm {
//
//    private class Node {
//        Map.Entry<Integer, Integer> node;
//        int distance;
//
//        public Node(Map.Entry<Integer, Integer> node, int distance) {
//            this.node = node;
//            this.distance = distance;
//        }
//    }
//
//    PriorityQueue<Node> priorityQueue;
//
//    //not correct. also check others, not sure if first neighbor always goes next
//
//    @Override
//    public void run(MazeContext mazeContext) {
//        priorityQueue = new PriorityQueue<>((nodeA, nodeB) -> nodeA.distance < nodeB.distance ? 1 : -1);
//
//        Map.Entry<Integer, Integer> startNode = Map.entry(MazeContext.START_ROW, MazeContext.START_COLUMN);
//        priorityQueue.add(new Node(startNode, 0));
//        mazeContext.visit(startNode);
//
//        while (!priorityQueue.isEmpty()) {
//            System.out.println(mazeContext.toString());
//            Node node = priorityQueue.remove();
//
//            mazeContext.getAdjacentPositions(node.node).forEach(neighbor -> {
//                if (!mazeContext.isVisited(neighbor)) {
//                    priorityQueue.add(new Node(neighbor, mazeContext.getManhattanDistance(neighbor, startNode)));
//                    mazeContext.visit(neighbor);
//                }
//            });
//        }
//    }
//
//}
