package bst;

/**
 * Clase que representa un nodo del árbol binario.
 * Cada nodo contiene un valor y referencias a sus hijos izquierdo y derecho.
 */
public class Node {

    int value;     // Valor almacenado en el nodo
    Node left;     // Referencia al hijo izquierdo
    Node right;    // Referencia al hijo derecho

    /**
     * Constructor del nodo
     * @param value valor que se almacenará en el nodo
     */
    public Node(int value) {
        this.value = value;
        this.left = null;   // Inicialmente no tiene hijo izquierdo
        this.right = null;  // Inicialmente no tiene hijo derecho
    }
}