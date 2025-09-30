package mx.edu.uttt.ejercicios;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;

public class TestProductosVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de productos"));
        ProductoVector pv = new ProductoVector(tamanio);

        String opcion = "";
        boolean sentinel = true;
        do {
            opcion = JOptionPane.showInputDialog(menu());
            switch(opcion){
                case "1":
                    if(!pv.estaLleno())

                    pv.llenarArreglo(llenarProducto());
                    else
                        JOptionPane.showMessageDialog(null, "El vector está lleno");
                    break;
                case"2":
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null ,pv.imprimir());
                    String nombreEliminar = JOptionPane.showInputDialog("Introduce el nombre del producto a eliminar:");
                    if (pv.eliminarProducto(nombreEliminar)) {
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado");
                    }
                    break;
                case"4":



                case"5":



                case"6":
                    sentinel=false;
                    JOptionPane.showMessageDialog(null, "Gracias por todo");
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            }
        }while(sentinel);
    }
    public static String menu (){
        return "Menu Principal\n1)Agregar Producto\n" +
                "2)Imprimir Productos\n" +
                "3)Eliminar Producto\n" +
                "4)Modificar Producto\n" +
                "5)Buscar Producto\n" +
                "6)Salir\n" +
                "7)Elegir opción";
    }

    public static Producto llenarProducto (){
        //Crea el objeto de producto
        Producto producto = new Producto();

        //Solicitar los valores de las variables de instancia
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto");
        int stock =Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));
        //Asignan los valores a las variables de instancia del objeto producto
        producto.setNombre(nombre);
        producto.setStock(stock);
        producto.setPrecio(precio);
        return producto;
    }


}
