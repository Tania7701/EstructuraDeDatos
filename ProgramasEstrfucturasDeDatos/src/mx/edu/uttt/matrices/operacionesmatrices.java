package mx.edu.uttt.matrices;

import javax.swing.*;

public class operacionesmatrices {
    private double [][]m;

    public operacionesmatrices(int numFilas, int numColumnas){
        if(validarTamanio(numFilas) && validarTamanio(numColumnas)){
            m = new double[numFilas][numColumnas];

        }else{
            m = new double[2][2];
        }

    }
    private boolean validarTamanio(int tamanio){
        return tamanio > 0;
    }

    public double [][] getM(){
        return this.m;
    }

    public void setM(double [][]m){
        if(!(m.length == this.m.length && m[0].length == this.m[0].length))
            return;
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                this.m[i][j] = m[i][j];
            }
        }
    }

    private boolean validarCuadrada(){
        return this.m.length==this.m[m.length-1].length;
    }
    public double sumarDiagonal() throws Exception{
        if(!(validarCuadrada()))
            throw new Exception("La matriz no es cuadrada");

        int i = 0;
        double suma = 0.0;
        while (i<m.length){
            for (int j = 0; j < m[i].length; j++){
                if(i==j)
                    suma+=m[i][j];
            }
            i++;
        }

    return suma;
    }

    public double sumarDiagonalInversa() throws Exception{
        if(!(validarCuadrada()))
            throw new Exception("La matriz no es cuadrada");

        double suma=0.0;
        int j = 0;
        for(int i = m.length-1; i>=0; i--){
            suma+=m[i][j];
            j++;
        }
        return suma;
    }


    public double sumarDiagonalInversa2() throws Exception{
        if(!(validarCuadrada()))
            throw new Exception("La matriz no es cuadrada");

        double suma=0.0;
        int j=m.length-1;
        for(int i = 0; i<m.length; i++){
            suma+=m[i][j];
            j--;
        }
        return suma;
    }

    public double sumarDiagonalInversa3() throws Exception{
        if(!(validarCuadrada()))
            throw new Exception("La matriz no es cuadrada");

        int i = 0;
        double suma = 0.0;
        while (i<m.length){
            for (int j = 0; j < m[i].length; j++){
                if(i==j)
                    suma+=m[j][i];
            }
            i++;
        }

        return suma;
    }


    public double sumarDiagonalInversa4() throws Exception{
        if(!(validarCuadrada()))
            throw new Exception("La matriz no es cuadrada");


        double suma = 0.0;

            for (int i =m.length-1; i>=0; i--){

                    suma+=m[i][m.length-1-i];
            }

        return suma;
    }







    public void imprimir(){
        String salida="";
        for(double [] fila: this.m){
            for(double valor: fila){
                salida+=valor +"|";


            }

            salida+="\n";
        }

        JOptionPane.showMessageDialog(null, salida);
    }

    //Metodo que sume las filas

        public double[][] sumarFilas() {
            double[][] resultado = new double[this.m.length][1];
            for (int i = 0; i < this.m.length; i++) {
                double suma = 0;
                for (int j = 0; j < this.m[i].length; j++) {
                    suma += this.m[i][j];
                }
                resultado[i][0] = suma;
            }
            return resultado;
        }

        public double[][] sumarColumnas() {
            double[][] resultado = new double[1][this.m[0].length];
            for (int j = 0; j < this.m[0].length; j++) {
                double suma = 0;
                for (int i = 0; i < this.m.length; i++) {
                    suma += this.m[i][j];
                }
                resultado[0][j] = suma;
            }
            return resultado;
        }

        public String imprimirSumaColumnasFilas() {
            double[][] sumaFilas = sumarFilas();
            double[][] sumaColumnas = sumarColumnas();

            String salida = "Suma de Filas:\n";
            for (int i = 0; i < sumaFilas.length; i++) {
                salida += "Fila " + (i + 1) + ": " + sumaFilas[i][0] + "\n";
            }

            salida += "\nSuma de Columnas:\n";
            for (int j = 0; j < sumaColumnas[0].length; j++) {
                salida += "Columna " + (j + 1) + ": " + sumaColumnas[0][j] + "\n";
            }

            JOptionPane.showMessageDialog(null, salida);
            return salida;
        }

        public void sumarMatrices(double[][] m1, double[][] m2) {
            if (m1.length != m2.length || m1[0].length != m2[0].length) {
                JOptionPane.showMessageDialog(null, "Las matrices deben tener el mismo tamaño");
                return;
            }

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    this.m[i][j] = m1[i][j] + m2[i][j];
                }
            }
        }

        public void restarMatrices(double[][] m1, double[][] m2) {
            if (m1.length != m2.length || m1[0].length != m2[0].length) {
                JOptionPane.showMessageDialog(null, "Las matrices deben tener el mismo tamaño");
                return;
            }

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    this.m[i][j] = m1[i][j] - m2[i][j];
                }
            }
        }

        public void multiplicarMatrices(double[][] m1, double[][] m2) {
            if (m1[0].length != m2.length) {
                JOptionPane.showMessageDialog(null, "No se pueden multiplicar: columnas de A = filas de B");
                return;
            }

            double[][] resultado = new double[m1.length][m2[0].length];

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int k = 0; k < m1[0].length; k++) {
                        resultado[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }

            this.m = resultado;
        }

        public void calcularTranspuesta() {
            double[][] transpuesta = new double[m[0].length][m.length];

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    transpuesta[j][i] = m[i][j];
                }
            }

            this.m = transpuesta;
        }

    }



