import java.util.ArrayList;

public class LCA {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int dist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;

        }

        int left_dist = dist(root.left, n);
        int right_dist = dist(root.right, n);

        if (left_dist == -1 && right_dist == -1) {
            return -1;

        } else if (left_dist == -1) {
            return right_dist+1;
        }else{
            return left_dist+1;
        }

    }

    public static int min_dist_between_2_nodes(Node root, int n1, int n2) {

        Node lc = lca(root, n1, n2);
        int dist1 = dist(lc, n1);
        int dist2 = dist(lc, n2);
        return dist1 + dist2;

    }

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }
        boolean left = getpath(root.left, n, path);
        boolean right = getpath(root.right, n, path);

        if (left == false && right == false) {

            // path.remove(path.size() - 1);
            path.remove(root);
            return false;
        }
        return true;

    }

    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        int i = 0;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);

        return lca;

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node ans = lca(root, 4, 6);
        System.out.println("Common Ancestor = " + ans.data);

        System.out.println(" Minimum dist bet 4 and 6 = "+min_dist_between_2_nodes(root, 4, 6));

    }
}
