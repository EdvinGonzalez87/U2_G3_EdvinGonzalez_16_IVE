/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author agonz
 */

 import javax.swing.JOptionPane;

public class cajasdedialogo {
    public static void main(String[]args){
        String usuarioCorrecto="lapiz";
        String claveCorrecta="1987";
        
        String usuario= JOptionPane.showInputDialog("Ingrese usuario: ");
        String clave= JOptionPane.showInputDialog("Ingrese clave: ");
        
        if (usuario.equals(usuarioCorrecto)&& clave.equals(claveCorrecta)){
            JOptionPane.showMessageDialog(null,"Bienvenido "+usuario);
        } else{
            JOptionPane.showMessageDialog(null,"palabra de paso no es correcta");
        }
    }
} 

