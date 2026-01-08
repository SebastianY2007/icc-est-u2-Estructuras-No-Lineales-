package structures.nodes;

import java.util.*;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    // Listado de los nodos conocidos
    private List<Node<T>> conocidos;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.conocidos = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public List<Node<T>> getConocidos() {
        return conocidos;
    }

    public void setConocidos(List<Node<T>> conocidos) {
        this.conocidos = conocidos;
    }

    @Override
    public String toString() {
        return "N [" + value + "]";
    }
}