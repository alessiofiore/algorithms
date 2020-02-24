package graph.visit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Pre-order visit [a,b,d,e,c,f,g,h]
 *
 *              a
 *             / \
 *            b   c
 *           /\  / \
 *          d e f  g
 *                 \
 *                 h
 */
public class DeepFirstSearch {
    public static void main(String[] main) {
        Node h = new Node("h", null, null);
        Node g = new Node("g", null, h);
        Node f = new Node("f", null, null);
        Node c = new Node("c", f, g);
        Node d = new Node("d", null, null);
        Node e = new Node("e", null, null);
        Node b = new Node("b", d, e);
        Node a = new Node("a", b, c);

        System.out.println(search(a));
    }

    public static List<String> search(Node n) {
        Stack<Node> stack = new Stack<>();
        List<String> visited = new ArrayList<>();
        stack.push(n);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            visited.add(current.getValue());
            if(current.getRightChild() != null) {
                stack.push(current.getRightChild());
            }
            if(current.getLeftChild() != null) {
                stack.push(current.getLeftChild());
            }
        }
        return visited;
    }
}
