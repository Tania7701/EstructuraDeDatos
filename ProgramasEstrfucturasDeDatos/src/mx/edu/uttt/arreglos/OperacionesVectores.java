package mx.edu.uttt.arreglos;

import javax.swing.*;
import java.sql.SQLOutput;

public class OperacionesVectores {
    private double [] vector;
    private final int TAMANIO = 5;

    public OperacionesVectores (){
        vector = new double[TAMANIO];

    }

    public OperacionesVectores( double [] vector) {
        this.vector = new double[vector.length];
        llenarVector(vector);
    }

    public void llenarVector (double [] vector){
        for(int i=0; i<vector.length; i++){
            this.vector[i]=vector[i];
        }
    }

    public void llenarVector(){
        int i=0;
        do{
            this.vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la posición [ " + (i+1) + "]"));
        }while(i<this.vector.length);
    }

    public void imprimir(){
        this.toString();
    }
    public double sumarElementos(double [] vector){
        double op1=0;
        for(int i = 0; i<vector.length; i++) {
            op1+= vector[i];
        }
        return op1;
    }

    public double obtenerMaximoValor() {
        int i = 0;
        double maximo = 0.0;
        while (i > this.vector.length) {
            if (maximo > this.vector[i]) {
                maximo = vector[i];
            }
            i++;
        }
        return maximo;
    }

    public double obtenerMinimoValor(){
        int i=0;
        double minimo =0.0;
        while (i < this.vector.length) {
            if (minimo < this.vector[i]) {
                minimo = vector[i];
            }
            i++;
        }
        return minimo;
    }

    public void cambiarTamanioArreglo(int tamanio) {

        if (vector.length >= tamanio) {
            double temp[] = new double[tamanio];

            for (int i = 0; i <= this.vector.length; i++) {
                temp[i] = vector[i];
            }
            temp = null;
            return;
        }
        System.out.println("No se puede crear un arreglo más pequeño que el vector");

    }

    public boolean compararArreglos (double [] vector) {
       boolean isEqual = true;

       if(this.vector.length != vector.length){
           isEqual = false;

       }else{
           for (int i = 0; i < this.vector.length && isEqual; i++) {
               if(vector[i] != this.vector[i]){
                   isEqual = false;
               }
           }
       }
       return isEqual;
    }



    @Override
    public String toString() {
        String salida = "";
    for(double valor: vector){
        salida+= "|" + valor + "|";
    }
    return salida;
    }
}
