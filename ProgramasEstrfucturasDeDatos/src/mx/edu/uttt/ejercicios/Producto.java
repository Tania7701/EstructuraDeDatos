package mx.edu.uttt.ejercicios;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    //Constructor


    public Producto(){
        this.nombre ="sin nombre";

    }
    public Producto(String nombre, int precio, int stock) {
        this.setNombre(nombre);
        this.setStock(stock);
        this.setPrecio(precio);

    }

    //metodo accesor
public String getNombre (){
        return this.nombre;
}
//metodo mutador
    public void setNombre(String nombre){
        this.nombre= nombre.toUpperCase();
    }

    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        if(stock>=0)
            this.stock=
                    stock;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        if(precio>=0.0)
            this.precio=precio;
    }
@Override
    public String toString(){
        return "Nombre del producto: "+ getNombre() +
                "\nStock: " + getStock() +
                "\nPrecio: " + getPrecio();
}
}
