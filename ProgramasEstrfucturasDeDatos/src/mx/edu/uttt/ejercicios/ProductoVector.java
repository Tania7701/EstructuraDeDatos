package mx.edu.uttt.ejercicios;

import javax.swing.*;

public class ProductoVector {
    private Producto[] Productos;
    private final int TAMANIO = 2;

    public ProductoVector() {
        this.Productos = new Producto[this.TAMANIO];
    }

    public ProductoVector(int tamanio) {
        if (tamanio <= 0)
            this.Productos = new Producto[this.TAMANIO];
        else
            this.Productos = new Producto[tamanio];
    }

    public void llenarArreglo(Producto producto) {
        if (estaLleno()) {
            JOptionPane.showMessageDialog(null, "El vector está lleno");
        } else {
            this.Productos[buscarPosicion()] = producto;
        }
    }

    private int buscarPosicion() {
        int posicion = 0;
        for (int i = 0; i < this.Productos.length; i++) {
            if (this.Productos[i] == null) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public boolean estaLleno() {
        boolean lleno = true;
        for (Producto valor : this.Productos) {
            if (valor == null) {
                lleno = false;
                break;
            }

        }
        return lleno;
    }
    public boolean eliminarProducto(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < this.Productos.length; i++) {
            if (this.Productos[i] != null && this.Productos[i].getNombre().equalsIgnoreCase(nombre)) {
                this.Productos[i] = null;
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }


    public String imprimir() {
        String salida = "";
//        for(Producto productos: this.Productos){
//            salida += productos.toString() + "\n";
//        }
        for (int i = 0; i < this.Productos.length; i++) {
            if (this.Productos[i] != null) {
                salida += this.Productos[i].toString() + "\nImporte: "
                        + Productos[i].getPrecio() * Productos[i].getStock()
                        + "\n";
            }
            }
            return salida;
        }
    }

