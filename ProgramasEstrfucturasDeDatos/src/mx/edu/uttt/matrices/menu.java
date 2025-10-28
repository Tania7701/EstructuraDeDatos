package mx.edu.uttt.matrices;

import javax.swing.JOptionPane;

public class menu {

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            String opcionStr = JOptionPane.showInputDialog(
                    "MENÚ\n" +
                            "1) Calcular suma debajo y encima de la diagonal\n" +
                            "2) Cambiar valores de la frontera a 1\n" +
                            "3) Salir\n" +
                            "Elige una opción:");

            if (opcionStr == null) {
                JOptionPane.showMessageDialog(null, "Has cancelado el programa.");
                salir = true;
                continue;
            }

            int opcion = 0;
            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    sumaAyA suma = new sumaAyA();
                    suma.iniciar();
                    break;

                case 2:
                    convertir convertir = new convertir();
                    convertir.iniciar();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intenta de nuevo.");
            }
        }
    }
}