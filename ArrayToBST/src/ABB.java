public class ABB {
    private Node root;

    // Construcción del árbol
    public void buildABB(String[] array) {
        root = buildSubTree(array, 0, array.length - 1);
    }
    private Node buildSubTree(String[] array, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;
        Node node = new Node(array[mid]);
        node.setLeft(buildSubTree(array, left, mid - 1));
        node.setRight(buildSubTree(array, mid + 1, right));

        return node;
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