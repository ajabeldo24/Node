//Stack
//Author: Ahmed Jabeldo
//Date: 11/29/23
//Collaborators:

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
    public String toString () {
        String toString = "" + data; //making the toString String just the data
        return "Node Data: " + toString; //returns the node data in string form;
    }

    public boolean equals (Node firstNode, Node secondNode) {
        if (firstNode.getData() == secondNode.getData()) {
            return true;
        } else {
            return false;
            }
        }
    }
