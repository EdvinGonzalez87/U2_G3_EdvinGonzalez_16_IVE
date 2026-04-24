import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pamela
 */
public class Ejercicio2G3 {
    public static void main(String[] args) {

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

        if (opcion == 0) {
            JOptionPane.showMessageDialog(null, "Seleccionó SI");
        } else if (opcion == 1) {
            JOptionPane.showMessageDialog(null, "Seleccionó NO");
        } else {
            JOptionPane.showMessageDialog(null, "Canceló");
        }
        System.out.println(opcion);
    }
    
}

