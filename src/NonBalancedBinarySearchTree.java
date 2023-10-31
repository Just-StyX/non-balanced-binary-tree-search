public class NonBalancedBinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public NonBalancedBinarySearchTree() {}

    public NonBalancedBinarySearchTree(Node<T> root) {
        this.root = root;
    }

    public void add(T value) {this.root = add(root, value);}

    public Node<T> add(Node<T> current, T value) {
        if (current == null) return new Node<>(value);
        if (value.compareTo(current.getValue()) < 0) {
            current.left = add(current.left, value);
        } else if (value.compareTo(current.getValue()) > 0) {
            current.right = add(current.right, value);
        }
        return current;
    }

    void parse() {parse(root);}
    void parse(Node<T> current) {
        if (current == null) return;
        parse(current.left);
        System.out.println(current.getValue());
        parse(current.right);
    }
}
