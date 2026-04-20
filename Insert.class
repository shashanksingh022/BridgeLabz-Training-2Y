public class HeightofTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int height = heightOfTree(root);
        System.out.println("Height of the tree: " + height);
    }

    // Function to calculate the height of the tree
    public static int heightOfTree(TreeNode node) {
        if (node == null) {
            return -1; // Return -1 for null nodes to count edges
        }
        int leftHeight = heightOfTree(node.left);
        int rightHeight = heightOfTree(node.right);
        return Math.max(leftHeight, rightHeight) + 1; // Add 1 for the current node
    }
    
}
