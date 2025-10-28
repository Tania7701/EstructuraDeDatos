package mx.edu.uttt.matrices;

public class DeclaracionMatrices {
    public static void main(String[] args) {
        /*
         * Sintaxis
         * tipodedato[][] nombreMatriz;
         * tipodedato nombreMatriz [][];
         **/

        //Declarando matrices
        double [][] calif;
        double promedios [][];
        char[][] califLetras;


        int [][] numAlumnos = new int [3][3];
        calif = new double[4][4];
        promedios = new double[3][2];
        califLetras = new char[5][3];

        //Asignar valores iniciales a una matriz
        String [] nombresVector ={"Juan Moroni", "Pablo Guerrero",
                "Atzin Bravo",
                "Kimberly Perez"} ;
        String nombres [][] = {{"Luis Hernandez", "Jorge Campos", "Luis García"},
                {"Roberto Baggio", "Ronaldo Nazario", "Dr. Chunga"}};
        double [][] alturas={
                            {2.3, 4.5, 5.6},
                            {10.2, 8.5, 4.6}
                             };


        //Acceder a los elementos de la matriz

        int i = 0, j = 0;

        double valor = alturas[0][j];
        valor = alturas[i][j];
        valor = alturas[alturas.length-1][j]; //La ultima fila, columna j
        //Es la ultima fila, ultima columna
        valor = alturas[alturas.length-1][alturas[alturas.length-1].length-1];
        valor = alturas.length; // Numero de filas
        valor = alturas[i].length; //Numero de columnas


        Auto sedan1 = new Auto("BMW", 0,0.0);
        Auto sedan2 = new Auto("BMW", 100, 15.0);
        Auto sedan3 = new Auto("Toyota", 0, 0.0);
        Auto sportCar = new Auto("Ferrari", 0, 0.0);
        Auto rv1 = new Auto("Jeep", 0, 0.0);
        Auto rv2 = new Auto("Ford", 200, 30.0);


        Auto[][] cars = {
                {sedan1, sedan2, sedan3},
                {sportCar, new Auto(), rv1},
                {new Auto("Vocho", 150, 30.5), rv2, new Auto()}
        };
    }
}
