public class ABB {
    private Node root;

    // Construcción del árbol
    public void buildABB(Node node) {
        root = node;
    }

    private Node buildSubTree(Node node, String[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node newNode = new Node(array[mid]);
        newNode.setLeft(buildSubTree(newNode, array, start, mid - 1));
        newNode.setRight(buildSubTree(newNode, array, mid + 1, end));
        return newNode;
    }

    public void buildABB(String[] array) {
        root = buildSubTree(null, array, 0, array.length - 1);
    }


    //InOrder
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node != null) {
            inOrder(node.getRight());
            System.out.print(node.getData() + " ");
            inOrder(node.getLeft());
        }
    }

    // Profundidad máxima
    public int maxDepth() {
        return maxDepth(root);
    }

    private int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = maxDepth(node.getLeft());
        int rightDepth = maxDepth(node.getRight());
        return Math.max(leftDepth, rightDepth) + 1;
    }
}