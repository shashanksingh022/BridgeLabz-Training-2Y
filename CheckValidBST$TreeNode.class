public class BuildBSTfromInput {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] keys = {5, 3, 7, 2, 4, 6, 8};

        for (int key : keys) {
            root = insert(root, key);
        }

        System.out.println("Binary Search Tree created from input:");
        inOrderTraversal(root);
    }

    // In-order Traversal: Left -> Root -> Right
    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }
    
}
