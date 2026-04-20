public class ExpressionTreeEvaluation {
    static class Node {
        String value;
        Node left, right;

        Node(String value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        // Constructing the expression tree for the expression: (3 + 5) * (2 - 4)
        Node root = new Node("*");
        root.left = new Node("+");
        root.right = new Node("-");
        
        root.left.left = new Node("3");
        root.left.right = new Node("5");
        
        root.right.left = new Node("2");
        root.right.right = new Node("4");

        double result = evaluateExpressionTree(root);
        System.out.println("The result of the expression is: " + result);
    }

    public static double evaluateExpressionTree(Node node) {
        if (node == null) {
            return 0;
        }

        // If it's a leaf node, return its value as a number
        if (node.left == null && node.right == null) {
            return Double.parseDouble(node.value);
        }

        // Recursively evaluate left and right subtrees
        double leftValue = evaluateExpressionTree(node.left);
        double rightValue = evaluateExpressionTree(node.right);

        // Apply the operator at the current node to the values from left and right subtrees
        switch (node.value) {
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                if (rightValue != 0) {
                    return leftValue / rightValue;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + node.value);
        }
    }
    
}
