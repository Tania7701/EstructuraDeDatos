package mx.edu.uttt.ejercicios;

public class EjemploRecursividad {
    // Función recursiva para calcular el factorial
    static int factorial(int n) {
        // Caso base
        if (n == 1) {
            return 1;
        }
        // Caso general
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("El factorial de 5 es: " + factorial(5));
    }
}
