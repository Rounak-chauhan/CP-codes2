import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

class Node {
    Node left;
    Node right;
    int data;

    Node() {
        left = null;
        right = null;
    }
}

public class Main {
    static Node form(int idx, Vector<Integer> v) {
        Node root = null;

        if (idx < v.size() && v.get(idx) != -1) {
            root = new Node();
            root.data = v.get(idx);
            root.left = form(2 * idx + 1, v);
            root.right = form(2 * idx + 2, v);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < n; i++)
            v.add(scanner.nextInt());

        Node root = form(0, v);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (i == 0) {
                    System.out.print(node.data + " ");
                }
                if (node.right != null)
                    q.add(node.right);
                if (node.left != null)
                    q.add(node.left);
            }
        }

        scanner.close();
    }
}
