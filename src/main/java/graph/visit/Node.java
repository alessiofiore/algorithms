package graph.visit;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String value;
    private Node leftChild;
    private Node rightChild;

    public Node(String value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
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

    public List<Node> getChildren() {
        List<Node> children = new ArrayList<>();
        if(leftChild != null) {
            children.add(leftChild);
        }
        if(rightChild != null) {
            children.add(rightChild);
        }
        return children;
    }
}
