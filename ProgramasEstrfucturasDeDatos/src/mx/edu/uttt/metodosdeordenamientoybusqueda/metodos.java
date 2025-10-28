package mx.edu.uttt.metodosdeordenamientoybusqueda;

public class metodos {
    public int arr[];

    public metodos(int tam) {
        if (validarTamanio(tam)) {
            arr = new int[tam];

        }else{
            arr = new int[2];
        }
    }
    private boolean validarTamanio(int tam){
        return tam > 0;
    }
    
}


