package graph.visit;

import java.util.*;

public class BreadthFirstSearch {
    public static void main(String[] main) {
        Node d = new Node("d", null, null);
        Node e = new Node("e", null, null);
        Node c = new Node("c", d, e);
        Node b = new Node("b", null, null);
        Node a = new Node("a", b, c);

        System.out.println(search(a));
    }

    public static List<String> search(Node n) {
        Queue<Node> queue = new ArrayDeque<>();
        List<String> visited = new ArrayList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            visited.add(current.getValue());
            List<Node> children = current.getChildren();
            if (!children.isEmpty()) {
                queue.addAll(children);
            }
        }
        return visited;
    }
}
