package BFSandDFS;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Integer value;
    private List<Node> children;

    public Node(Integer value) {
        this.value = value;
        this.children = new ArrayList<Node>();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

}
