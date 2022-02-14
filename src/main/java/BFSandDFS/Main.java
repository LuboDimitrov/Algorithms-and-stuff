package BFSandDFS;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Node root = new Node(1);
        Node Level1left = new Node(2);
        Node Level1right = new Node(3);
        Node Level2left = new Node(4);
        Node Level2mid = new Node(5);
        Node Level2right = new Node(6);

        root.setChildren(List.of(Level1left,Level1right));
        Level1left.setChildren(List.of(Level2left,Level2mid,Level2right));

        /*          1
        *          / \
        *         2   3
        *        /|\
        *       4 5 6
        */

        BFS(root, 6);
        System.out.println("--------------------------");
        DFS(root, 6);

    }

    //BFS (amplitud)
    /*PROPERTIES
    * Time complexity: O(|V|+|E|) in the worst case we end up visiting every single vertex and edge
    * Space complexity: O(|V|)
    * Finds shortest path from one node to another if edges are unweighted*/
    public static Node BFS (Node root, int valueToFind){
        Node current;
        Queue<Node> toBeVisited = new ArrayDeque<>();
        //add the root node to the q
        toBeVisited.add(root);

        while(!toBeVisited.isEmpty()){
            //Print current status before extracting the head
            System.out.print("Remaining nodes: ");
            toBeVisited.forEach(node -> System.out.print(node.getValue() + " "));
            System.out.println("");
            //extract the head
            current = toBeVisited.poll();
            assert current != null;
            if(current.getValue() == valueToFind){
                System.out.println("Node found ");
                return current;
            } else {
                toBeVisited.addAll(current.getChildren());
            }

        }

        return null;

    }


    public static Node DFS (Node root, int valueToFind){
        Node current;
        Stack<Node> stack = new Stack<>();
        //add the root node to the stack
        stack.push(root);

        while(!stack.isEmpty()){
            //Print current status before extracting the head
            System.out.print("Remaining nodes: ");
            stack.forEach(node -> System.out.print(node.getValue() + " "));
            System.out.println("");
            current = stack.pop();
            assert current != null;
            if(current.getValue() == valueToFind){
                System.out.println("Node found ");
                return current;
            } else {
                stack.addAll(current.getChildren());
            }

        }

        return null;

    }
}
