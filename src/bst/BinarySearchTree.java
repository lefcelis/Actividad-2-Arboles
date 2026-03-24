package bst;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de un Árbol Binario de Búsqueda (BST).
 * Permite insertar elementos, recorrerlos en inorden y buscar valores.
 */
public class BinarySearchTree {

    private Node root; // Nodo raíz del árbol

    /**
     * Inserta un valor en el árbol
     */
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    /**
     * Busca si un valor existe en el árbol
     * @param value número a buscar
     * @return true si existe, false si no
     */
    public boolean contains(int value) {
        Node current = root;

        // Se recorre el árbol comparando valores
        while (current != null) {
            if (value == current.value) {
                return true; // Valor encontrado
            }
            // Se decide si ir a la izquierda o derecha
            current = value < current.value ? current.left : current.right;
        }

        return false; // No se encontró
    }

    /**
     * Devuelve el recorrido inorden del árbol
     * @return lista de valores ordenados
     */
    public List<Integer> inorder() {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    /**
     * Inserción recursiva en el árbol
     */
    private Node insertRecursive(Node current, int value) {

        // Caso base: se crea un nuevo nodo
        if (current == null) {
            return new Node(value);
        }

        // Si el valor es menor, va a la izquierda
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        }
        // Si es mayor, va a la derecha
        else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        // Retorna el nodo actual
        return current;
    }

    /**
     * Recorrido inorden: devuelve los valores ordenados
     */
    private void inorderRecursive(Node current, List<Integer> result) {

        // Caso base: nodo nulo
        if (current == null) return;

        inorderRecursive(current.left, result); // Subárbol izquierdo
        result.add(current.value);              // Nodo actual
        inorderRecursive(current.right, result); // Subárbol derecho
    }
}






















