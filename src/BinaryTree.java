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
            System.out.print("The item is exist");
        }
    }
}
