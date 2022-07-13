import java.util.Stack;

public class BinaryTree {
    private BinaryNode root;

    private static class BinaryNode {
        private BinaryNode left = null;
        private BinaryNode right = null;
        private final int data;

        private BinaryNode(int data) {
            this.data = data;
        }
    }


    public void addNode(int data) {
        BinaryNode newNode = new BinaryNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        addNodee(this.root, newNode);
    }

    private void addNodee(BinaryNode currentNode, BinaryNode newNode) {
        if (newNode.data < currentNode.data) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                addNodee(currentNode.left, newNode);
            }
        }
        if (newNode.data > currentNode.data) {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                addNodee(currentNode.right, newNode);
            }
        }
        if (newNode.data == currentNode.data) {
            System.out.println("The item is exist: " + newNode.data);
        }
    }
    public void prOrder() {
        if (root == null) {
            return;
        }
        Stack<BinaryNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryNode temp = stack.pop();
            System.out.println(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
}
