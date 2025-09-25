/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_semana_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Clase_semana_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        if (edad >= 18){
        JOptionPane.showMessageDialog(null, "Usted puede votar ya es igual o mayor a: " + edad + " años");
        }else{
            JOptionPane.showMessageDialog(null, "Usted no puede votar ya que no es mayor a: " + edad);
        }
        
        
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite su nota"));
        if (nota >= 70){
        JOptionPane.showMessageDialog(null, "Usted pasó el curso ya que su no es mayor o igual a: " + nota );
        }else{
            JOptionPane.showMessageDialog(null, "Usted no pasó el curso, su no es : " + nota);
        }
            
                
    }

}
