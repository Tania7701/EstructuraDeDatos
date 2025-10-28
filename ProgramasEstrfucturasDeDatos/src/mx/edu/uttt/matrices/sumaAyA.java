package mx.edu.uttt.matrices;

import javax.swing.*;
import java.util.Random;

public class sumaAyA{

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de filas "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de columnas "));

        // matriz cuadrada
        while (!esCuadrada(filas, columnas)) {
            JOptionPane.showMessageDialog(null, "La matriz debe ser cuadrada");
            filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de filas"));
            columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de columnas"));
        }


        int[][] matrix = new int[filas][columnas];


        llenarMatrix(matrix);


        int sumaArriba = sumaArriba(matrix);
        int sumaAbajo = sumaAbajo(matrix);


        imprimir(matrix);



        JOptionPane.showMessageDialog(null,  mostrar(matrix)
                + "\nSuma encima de la diagonal  " + sumaArriba
                + "\nSuma debajo de la diagonal  " + sumaAbajo);
    }


    public static boolean esCuadrada(int filas, int columnas) {
        return filas == columnas;
    }

    public static void llenarMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }
    }

    // Suma arriba de la diagonal
    public static int sumaArriba(int[][] matrix) {
        int suma = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    suma += matrix[i][j];
                }
            }
        }
        return suma;
    }

    // Suma debajo de la diagonal
    public static int sumaAbajo(int[][] matrix) {
        int suma = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j) { // debajo de la diagonal
                    suma += matrix[i][j];
                }
            }
        }
        return suma;
    }


    public static void imprimir(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static String mostrar(int[][] matrix) {
        String texto = "Matriz generada \n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                texto += matrix[i][j] + "  ";
            }
            texto += "\n";
        }
        return texto;
    }
}