package suma.matrices.unicartagena.algebra.lineal;
import java.util.Scanner;
import java.util.Random;
public class MatrizMisc {
    // Esta clase esta destinada a almacenar los metodos auxiliares para el funcionamiento del programa.

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {  // Recorre cada fila de la matriz
            for (int elemento : fila) {  // Recorre cada elemento de la fila
                System.out.print(elemento + " ");  // Imprime el elemento seguido de un espacio
            }
            System.out.println();  // Salto de línea al final de cada fila
        }
    }

    public static int[][] leerMatriz() {
        // Crea un objeto Scanner para leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese el tamaño de la matriz
        System.out.print("Ingresa el número de filas de la matriz: ");
        int filas = scanner.nextInt();  // Lee el número de filas ingresado

        // Pide al usuario que ingrese el tamaño de la matriz
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();  // Lee el número de columnas ingresado

        int[][] matriz = new int[filas][columnas];  // Crea la matriz vacía

        // Pide al usuario que ingrese los valores de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingresa el elemento [" + i + "][" + j + "] de la matriz: ");
                matriz[i][j] = scanner.nextInt();  // Lee el elemento ingresado y lo guarda en la matriz
                imprimirMatriz(matriz);
            }
        }

        return matriz;  // Devuelve la matriz rellena con los valores ingresados por el usuario
    }

    public static int[][] crearMatrizAleatoria() {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();  // Crea un objeto para generar números aleatorios

        // Pide al usuario que ingrese el tamaño de la matriz
        System.out.print("Ingresa el número de filas de la matriz: ");
        int filas = scanner.nextInt();  // Lee el número de filas ingresado

        // Pide al usuario que ingrese el tamaño de la matriz
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();  // Lee el número de columnas ingresado

        int[][] matriz = new int[filas][columnas];  // Crea la matriz vacía

        // Rellena la matriz con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(100) + 1;  // Genera un número aleatorio y lo guarda en la matriz
            }
        }

        return matriz;  // Devuelve la matriz rellena con números aleatorios
    }

}
