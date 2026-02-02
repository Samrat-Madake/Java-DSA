import java.util.ArrayList;

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

    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;

    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        boolean left = false;
        boolean right = false;
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    public static void inorder_traversal(Node root) {

        if (root == null) {
            return;
        }
        inorder_traversal(root.left);
        System.out.print(root.data + "  ");
        inorder_traversal(root.right);
    }
    
    public static void preorder_traversal(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + "  ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {

            root.right = delete(root.right, val);
        }
        // WE have found the Node
        else {
            // Case 1 = node is leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2 = Node has one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 = Node has two children
            Node IS = in_order_Successor(root.right);

            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    public static Node in_order_Successor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -->");

        }
        System.out.println("Null");
    }

    public static void root_to_leaf_Path(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(path);
        }
        root_to_leaf_Path(root.left, path);
        root_to_leaf_Path(root.right, path);
        path.remove(path.size() - 1);

    }

    public static boolean is_Valid_Bst(Node root, Node min, Node max) {

        if (root == null) {
            return true;
        }
        // for right subtree 
        if (min != null && root.data <= min.data) {
            return false;
        }
        // for left subtree
        if (max != null && root.data >= max.data) {
            return false;
        }

        boolean left = is_Valid_Bst(root.left, min, root);
        boolean right = is_Valid_Bst(root.right, root, max);

        return left && right;

    }

    public static Node Mirror(Node root) {

        if (root == null) {
            return null;
        }
        Node left_subtree = Mirror(root.left);
        Node right_subtree = Mirror(root.right);

        root.left = right_subtree;
        root.right = left_subtree;
        return root;

    }

    public static Node sorted_arr_to_balenced_BST(int arr[], int st, int end) {

        if (st > end) {
            return null;

        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = sorted_arr_to_balenced_BST(arr, st, mid - 1);
        root.right = sorted_arr_to_balenced_BST(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {

        // int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14, 7 };
        // Node root = null;

        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }

        // inorder_traversal(root);
        // System.out.println(" ");

        // if (search(root, 3)) {
        // System.out.println("Key is present in BST \n");
        // }else{
        // System.out.println("Key is not present in BST \n");
        // }

        // root = delete(root, 6);
        // System.out.println();
        // inorder_traversal(root);

        // Root to leaf Path
        // ArrayList<Integer> path = new ArrayList<>();
        // root_to_leaf_Path(root, path);

        // Valid BST
        // System.out.println("Is VAlid = " + is_Valid_Bst(root, null, null));

        // Mirror A BST
        // Mirror(root);
        // inorder_traversal(root);

        // Sorted Array to Balenced BST
        int arr[] = { 3, 5, 6, 8, 10, 11, 14 };
        Node root = sorted_arr_to_balenced_BST(arr, 0, arr.length-1);
        inorder_traversal(root);
        System.out.println();
        preorder_traversal(root);
    }

}