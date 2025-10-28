package mx.edu.uttt.Recursividad;

public class MetodosRecursivos {
    public static void main(String[] args) {

    }

    public static long fact(int n){
        if(n < 0)
            throw new IllegalArgumentException("El valor no puede ser negativo");
        //Caso base
        if(n == 1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        //Caso general
        return n * fact(n-1);
    }
}
