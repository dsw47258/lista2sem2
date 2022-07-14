public class BinaryTree {
    private BinaryNode root;

    private static class BinaryNode {
        private BinaryNode left = null;
        private BinaryNode right = null;
        private final int value;

        private BinaryNode(int value) {
            this.value = value;
        }
    }


    public void addNode(int value) {
        BinaryNode newNode = new BinaryNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        addNodeeInternal(this.root, newNode);
    }

    private void addNodeeInternal(BinaryNode currentNode, BinaryNode newNode) {
        if (newNode.value < currentNode.value) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                addNodeeInternal(currentNode.left, newNode);
            }
        }
        if (newNode.value > currentNode.value) {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                addNodeeInternal(currentNode.right, newNode);
            }
        }
        if (newNode.value == currentNode.value) {
            System.out.println("The item exists: " + newNode.value);
        }
    }

    public void preOrder() {
        this.preOrderInternal(this.root);
    }

    private void preOrderInternal(BinaryNode currentNode) {
        if (currentNode == null) return;
        System.out.println(currentNode.value);
        this.preOrderInternal(currentNode.left);
        this.preOrderInternal(currentNode.right);
    }

    int numberOfVertices = 0;

    public void calculateNumberOfVertices() {
        this.numberOfVerticesInternal(this.root);
        System.out.print("Number of vertices: " + numberOfVertices);
    }

    private void numberOfVerticesInternal(BinaryNode currentNode) {
        if (currentNode == null) return;
        if (currentNode.right != null || currentNode.left != null) {
            numberOfVertices++;
            this.numberOfVerticesInternal(currentNode.left);
            this.numberOfVerticesInternal(currentNode.right);
        }
    }
}
