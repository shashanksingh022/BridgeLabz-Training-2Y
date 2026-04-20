import java.util.LinkedList;
import java.util.Queue;

public class Insert {   
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inserting a new node with value 6:");
        insert(root, 6);
        levelOrderTraversal(root); // To verify the insertion
    }

    // Insert a new node in the binary tree (for simplicity, we insert at the first available position)
    public static void insert(TreeNode root, int value) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (currentNode.left == null) {
                currentNode.left = new TreeNode(value);
                return;
            } else {
                queue.add(currentNode.left);
            }

            if (currentNode.right == null) {
                currentNode.right = new TreeNode(value);
                return;
            } else {
                queue.add(currentNode.right);
            }
        }
    }

    // Level-order Traversal: Traverse the tree level by level
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.val + " ");

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
    
}
