package suma.matrices.unicartagena.algebra.lineal;
import java.util.Arrays;

import static suma.matrices.unicartagena.algebra.lineal.MatrizMisc.*;
import static suma.matrices.unicartagena.algebra.lineal.MatrizSum.sumMatriz;
import static suma.matrices.unicartagena.algebra.lineal.MatrizSum.sumMatriz;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean encendido = true;

        while (encendido == true) {

            System.out.println("""
                    Como desea sumar dos matrices:
                        1. ingresando cada matriza manualmente.
                        2. generando las dos matrices aleatoriamente.
                    """);

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese los datos de la primera matriz");
                int[][] matrizA = leerMatriz();

                System.out.println("Ingrese los datos de la segunda matriz");

                int[][] matrizB = leerMatriz();

                System.out.println("""
                        Matriz A:
                        """);
                imprimirMatriz(matrizA);

                System.out.println("""
                        Matriz B:
                        """);
                imprimirMatriz(matrizB);

                System.out.println("""
                        Matriz Resultante:
                        
                        """);

                int[][] MatrizResultante = sumMatriz(matrizA, matrizB);

                imprimirMatriz(MatrizResultante);


            } else if (opcion == 2) {

                System.out.println("Ingrese los datos de la primera matriz");
                int[][] matrizA = crearMatrizAleatoria();

                System.out.println("Ingrese los datos de la segunda matriz");

                int[][] matrizB = crearMatrizAleatoria();

                System.out.println("""
                        Matriz A:
                        """);
                imprimirMatriz(matrizA);

                System.out.println("""
                        Matriz B:
                        """);
                imprimirMatriz(matrizB);

                System.out.println("""
                        Matriz Resultante:
                        
                        """);

                int[][] MatrizResultante = sumMatriz(matrizA, matrizB);

                imprimirMatriz(MatrizResultante);

            }
        }
    }
}