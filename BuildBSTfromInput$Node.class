class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
        this.val = 0;
    }
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeTraversals {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode();
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Pre-order Traversal:");
        preOrderTraversal(root);

        System.out.println("\nIn-order Traversal:");
        inOrderTraversal(root);

        System.out.println("\nPost-order Traversal:");
        postOrderTraversal(root);
    }

    // Pre-order Traversal: Root -> Left -> Right
    public static void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // In-order Traversal: Left -> Root -> Right
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }

    // Post-order Traversal: Left -> Right -> Root
    public static void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val + " ");
    }
    
}
