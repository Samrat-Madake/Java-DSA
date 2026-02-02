import java.util.*;
import java.util.Arrays;

// class Treenode
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// class NodeState
class NodeState {
    int state;
    TreeNode node;

    NodeState(TreeNode node, int state) {
        this.state = state;
        this.node = node;
    }
}

// class solution
class Solution {
    public List<List<Integer>> treeTraversal(TreeNode root) {

        // Create 3 list for in pre post order
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        // root == null : base case
        if (root == null) {
            return Arrays.asList(pre, in, post);
        }

        // stack<NodeState>
        Stack<NodeState> st = new Stack<>();

        // start by pushing root with state 1
        st.push(new NodeState(root, 1));

        // while stack is not empty
        while (!st.isEmpty()) {
            // get top element
            NodeState top = st.pop();
            TreeNode node = top.node;
            int currState = top.state;

            if (currState == 1) {
                pre.add(node.data);

                st.push(new NodeState(node, 2));

                if (node.left != null) {
                    st.push(new NodeState(node.left, 1));
                }
            } else if (currState == 2) {
                in.add(node.data);

                st.push(new NodeState(node, 3));

                if (node.right != null) {
                    st.push(new NodeState(node.right, 1));
                }
            } else {
                post.add(node.data);
            }
        }
        return Arrays.asList(pre, in, post);
    }

}

public class AllTraversal {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        List<List<Integer>> traversals = sol.treeTraversal(root);
        // Print Preorder traversal
        System.out.print("Preorder traversal: ");
        for (int val : traversals.get(0))
            System.out.print(val + " ");
        System.out.println();

        // Print Inorder traversal
        System.out.print("Inorder traversal: ");
        for (int val : traversals.get(1))
            System.out.print(val + " ");
        System.out.println();

        // Print Postorder traversal
        System.out.print("Postorder traversal: ");
        for (int val : traversals.get(2))
            System.out.print(val + " ");
        System.out.println();
    }
}



/// // Output:
// Preorder traversal: 1 2 4 5 3 6
// Inorder traversal: 4 2 5 1 3 6
// Postorder traversal: 4 5 2 6 3 1