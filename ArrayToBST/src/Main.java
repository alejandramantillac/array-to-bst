import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el arreglo de los Strings (nombres):");
        String names = scanner.nextLine();
        String[] array = names.split(" ");
        ABB tree = new ABB();

        // Construcción del árbol
        tree.buildABB(array);

        // InOrder Reverso
        System.out.println("");
        System.out.println("Recorrido inOrder Reverso: ");
        tree.inOrder();
        System.out.println("\n");

        // Bonus - Profundidad máxima
        System.out.println("Profundidad máxima: \n" + tree.maxDepth());
    }
}
