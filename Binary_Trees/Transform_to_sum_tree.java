public class Transform_to_sum_tree {
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

    public static int transform_to_sum_tree(Node root) {

        if (root == null) {
            return 0;
        }

        int left = transform_to_sum_tree(root.left);
        int right = transform_to_sum_tree(root.right);

        int temp = root.data;
        if (left == 0 && right == 0) {
            root.data = 0;
        } else {
            root.data =  left + right;
        }
        return temp + left + right;

    }

    public static void preorder_traversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);

    }

    public static void main(String args[]) {

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preorder_traversal(root);
        System.out.println();

        transform_to_sum_tree(root);

        preorder_traversal(root);

    }

}
