package TreeTraversal;

public class Node {

    private final String value;
    private Node leftChild;
    private Node rightChild;

    public Node(String value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public String getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
