public class Node<T> {
    private final T value;

    public Node<T> left, right;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
