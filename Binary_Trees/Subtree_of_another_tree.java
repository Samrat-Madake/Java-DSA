public class Subtree_of_another_tree {

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

    static void preorder_traversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + "  ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }

    public static boolean isIdentical(Node root, Node subroot) {

        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(root.right, subroot.right)) {
            return false;
        }
        return true;

    }

    public static boolean isSubtree(Node root, Node subroot) {

        if (root == null) {
            return false;

        }

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        boolean left_ans = isSubtree(root.left, subroot);
        boolean right_ans = isSubtree(root.right, subroot);
        return left_ans || right_ans;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        preorder_traversal(root);
        System.out.println();
        preorder_traversal(subroot);
        
        System.out.println();
        System.out.println(isSubtree(root, subroot));
    }

}
