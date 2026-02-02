import java.util.*;

public class basics {

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

    static class BinaryTree {
        static int idx = -1;

        public Node buildtree(int nodes[]) {
            idx++;
            // first element is only empty root node empty
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;

        }

    }

    // Traversal
    // Pre Order Traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);

    }

    // In Order Traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);

    }

    // Post Order Traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "  ");

    }

    // Level Order Traversal By Iterative method using Array
    public static void level_order_traversal(Node root) {
        if (root == null) {
            System.out.println("\nNigga tree is Empty ");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // Level Order Traversal Print Kth Level Rescursive
    public static void Kth_level_recursive(Node root, int level, int k) {

        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        Kth_level_recursive(root.left, level + 1, k);
        Kth_level_recursive(root.right, level + 1, k);

    }

    // Level Order Traversal Print Kth Level Iterative
    public static void Kth_level_level_order_traversal(Node root, int k) {
        if (root == null) {
            System.out.println("\nNigga tree is Empty ");
            return;
        }
        int count = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                count++;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (count == k - 1) {
                    System.out.print(currNode.data + " ");
                }

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // Height of Tree
    public static int Height_of_tree(Node root) {
        if (root == null) {
            return 0;
        }

        int left_height = Height_of_tree(root.left);
        int left_right = Height_of_tree(root.right);
        return Math.max(left_height, left_right) + 1;
    }

    // Count of Nodes(Data) of Tree
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int left_count = count(root.left);
        int right_count = count(root.right);
        return left_count + right_count + root.data;
    }

    // Diamter of Tree Aproach 1 O(n2)
    public static int diam1(Node root) {
        if (root == null) {
            return 0;
        }
        int left_diam = diam1(root.left);
        int right_diam = diam1(root.right);

        int left_height = Height_of_tree(root.left);
        int right_height = Height_of_tree(root.right);

        int self_diam = (left_height + right_height + 1);

        return Math.max(self_diam, Math.max(right_diam, left_diam));

    }

    // Diameter of Tree Aproach 2 O(n)
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diam2(Node root) {
        if (root == null) {
            return new Info(0, 0);

        }

        Info linfo = diam2(root.left);
        Info rinfo = diam2(root.right);

        int Self_diam = Math.max(Math.max(linfo.diam, rinfo.diam), linfo.ht + rinfo.ht + 1);

        int ht = Math.max(linfo.ht, rinfo.ht) + 1;

        return new Info(Self_diam, ht);
    }

    public static void main(String[] args) {

        /* 
                   1
                 /   \ 
                2     3
              /   \ /   \
             4    5 6    7   
                          \
                           8 


*/
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, 8, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);

        System.out.println("Preorder");
        preorder(root);
        System.err.println();

        System.out.println("Inorder");
        inorder(root);
        System.err.println();

        System.out.println("Postorder");
        postorder(root);

        System.err.println();
        System.out.println("Level Order Traversal");
        level_order_traversal(root);

        System.err.println();
        System.out.println("Height_of_tree = " + Height_of_tree(root));

        System.out.println("Count = " + count(root));

        System.out.println("Diameter of Tree Aproach 1 O(n2) = " + diam1(root));

        System.out.println("Diameter of Tree Aproach 2 O(n2) = " + diam2(root).diam);

        int k = 3;
        System.out.print("\nElement on " + k + " level = ");
        Kth_level_level_order_traversal(root, k);
        Kth_level_recursive(root, 1, k);
    }

}