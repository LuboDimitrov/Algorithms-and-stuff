package TreeTraversal;

import java.util.ArrayDeque;
import java.util.Queue;

import static TreeTraversal.Main.PostorderBinaryTreeTraversal;

public class Main {

    static int iterationsPreorder = 1;

    public static void main(String[] args) {
    /*Note that pre-order and other forms of tree traversal are a form of DFS.
    * The key difference is that when implementing this algorithm for a graph,
    * we must check if the node has been visited. If we don't, we risk
      getting stuck in an infinite loop*/
        
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");

        A.setLeftChild(B);
        A.setRightChild(F);

        B.setLeftChild(C);
        B.setRightChild(D);

        D.setRightChild(E);

        F.setLeftChild(G);
        /*
        *                   A
        *                 /   \
        *                B     F
        *               / \   /
        *              C   D G
        *                   \
        *                    E
        * */
        System.out.println("****Preorder****");
        PreorderBinaryTreeTraversal(A);
        System.out.println("-------------------");
        System.out.println("****Inorder****");
        InorderBinaryTreeTraversal(A);
        System.out.println("-------------------");
        System.out.println("****Postorder****");
        PostorderBinaryTreeTraversal(A);
        System.out.println("-------------------");

    }
    /*procedure preorden(x: in nodo) is
    begin
        visitar(x);
        if ex_izq(x) then preorden(izq(x)); end if;
        if ex_der(x) then preorden(der(x)); end if;
    end preorden;

    O(n)*/
    //Root,L,R
    public static void PreorderBinaryTreeTraversal(Node root){
        System.out.println("Current node: "+root.getValue() +" "+iterationsPreorder);
        if(root.getLeftChild() != null){
            iterationsPreorder++;
            PreorderBinaryTreeTraversal(root.getLeftChild());
        }
        if(root.getRightChild() != null) {
            iterationsPreorder++;
            PreorderBinaryTreeTraversal(root.getRightChild());
        }

    }
    /*
    * procedure inorden(x: in nodo) is
      begin
        if ex_izq(x) then inorden(izq(x)); end if;
        visitar(x);
        if ex_der(x) then inorden(der(x)); end if;
      end inorden;*/

    //L,Root,R
    public static void InorderBinaryTreeTraversal(Node root){

        if(root.getLeftChild() != null){
            InorderBinaryTreeTraversal(root.getLeftChild());
        }

        System.out.println("Current node: "+root.getValue());

        if(root.getRightChild() != null) {
            InorderBinaryTreeTraversal(root.getRightChild());
        }

    }

    //L,R,Root
    public static void PostorderBinaryTreeTraversal(Node root){
        if(root.getLeftChild() != null){
            PostorderBinaryTreeTraversal(root.getLeftChild());
        }
        if(root.getRightChild() != null){
            PostorderBinaryTreeTraversal(root.getRightChild());
        }
        System.out.println("Current node: "+root.getValue());
    }
}
