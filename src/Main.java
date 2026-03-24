import bst.BinarySearchTree;
import java.util.Scanner;

/**
 * Clase principal del programa.
 * Permite interactuar con el arbol binario mediante un menú en consola.
 */
public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree(); // Se crea el árbol
        Scanner scanner = new Scanner(System.in);       // Para leer datos del usuario
        int option;

        // Menú interactivo
        do {
            System.out.println("\n--- MENÚ ÁRBOL BINARIO ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar Inorden");
            System.out.println("3. Buscar número");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");

            option = scanner.nextInt();

            switch (option) {

                case 1:
                    // Insertar número en el árbol
                    System.out.print("Ingrese número: ");
                    int value = scanner.nextInt();
                    tree.insert(value);
                    System.out.println("Número insertado correctamente.");
                    break;

                case 2:
                    // Mostrar recorrido inorden (ordenado)
                    System.out.println("Recorrido Inorden: " + tree.inorder());
                    break;

                case 3:
                    // Buscar número en el árbol
                    System.out.print("Número a buscar: ");
                    int search = scanner.nextInt();

                    if (tree.contains(search)) {
                        System.out.println("Número encontrado.");
                    } else {
                        System.out.println("No existe.");
                    }
                    break;
            }

        } while (option != 0); // Se repite hasta que el usuario salga

        scanner.close(); // Se cierra el scanner
    }
}
