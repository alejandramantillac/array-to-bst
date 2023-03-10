public class Node {

    private String data;

    private Node right;

    private Node left;

    public Node(String data) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
