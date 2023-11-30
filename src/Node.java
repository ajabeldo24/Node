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

    //Accessors and Mutators
    public T getData () {
        return data;
    }

    public void setData (T data) {
        this.data = data;
    }

    public Node<T> getParent () {
        return parent;
    }

    public void setParent (Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getChild () {
        return child;
    }

    public void setChild (Node<T> child) {
        this.child = child;
    }

    //Other Methods

}
