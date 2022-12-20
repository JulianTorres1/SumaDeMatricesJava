package suma.matrices.unicartagena.algebra.lineal;
import java.util.Arrays;

public class MatrizSum {
    public static int[][] sumMatriz(int[][] a, int[][] b) {
        // Verificamos que las matrices tengan el mismo tamaño
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño para poder ser sumadas");
        }

        // Creamos la matriz resultado con las mismas dimensiones que las matrices de entrada
        int[][] result = new int[a.length][a[0].length];

        // Realizamos la suma elemento a elemento y guardamos el resultado en la matriz resultado
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
}
