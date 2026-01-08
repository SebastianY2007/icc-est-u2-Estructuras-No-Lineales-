package structures.graphs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import structures.nodes.Node;

public class Graph<T> {
    // 1ra forma
    // TRABAJA CON LISTADO DE ADYACIENCIA
    // private List<Node<T>> nodes;

    // 2da forma
    private Map<Node<T>, List<Node<T>>> mapa;


    public Graph() {
        // this.nodes = new ArrayList<Node<T>>();
        this.mapa = new LinkedHashMap   <Node<T>, List<Node<T>>>();
    }

    // Inserta un vértice o nodo
    public void insertNode(T value) {
        Node<T> newNode = new Node<>(value);
        // this.nodes.add(newNode);
        mapa.putIfAbsent(newNode, new ArrayList<>());
    }

    public void addNode(Node<T> node) {
        mapa.putIfAbsent(node, new ArrayList<>());
    }

    public Node<T>[] getNeighbors(Node<T> node) {
        List<Node<T>> neighbors = mapa.get(node);

        if (neighbors == null) {
            return new Node[0];
        }

        return neighbors.toArray(new Node[0]);
    }



    // Grafo no dirigido
    public void addEdge(Node<T> n1, Node<T> n2) {
        addNode(n1);
        addNode(n2);
        mapa.get(n1).add(n2);
        mapa.get(n2).add(n1);
    }

    public void printGraph() {
        for (Map.Entry<Node<T>, List<Node<T>>> entry : mapa.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Node<T> neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

}
