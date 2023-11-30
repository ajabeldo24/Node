public class Node<T> {
    private T data;
    private Node<T> parent;
    private Node<T> child;

    public Node () { //empty constructor

    }

    public Node (T data) { //constructor with just data
        this.data = data;
    }

    public Node (Node<T> parent, Node<T> child, T data) { //constructor with 2 nodes and data
        this.parent = parent;
        this.child = child;
        this.data = data;
    }
    }
