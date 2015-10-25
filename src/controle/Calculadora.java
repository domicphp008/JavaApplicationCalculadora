/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.swing.JOptionPane;

/**
 *
 * @author domiciosilva
 */
public class Calculadora {
  public int resultado;
    
    public void somar(int numero1, int numero2){
        
        int resultado;
       resultado =  numero1 + numero2;
        JOptionPane.showMessageDialog(null,"A soma é " +(numero1 + numero2));
    }
    
    public void subtrair(int numero1, int numero2){
          this.resultado =  numero1 - numero2;
        JOptionPane.showMessageDialog(null,"A subtração é " +(numero1- numero2));
    }
    
    public void multiplicar(int numero1, int numero2){
          this.resultado =  numero1 * numero2;
        JOptionPane.showMessageDialog(null,"A multiplicação é " +(numero1 * numero2));
    }
    
    public void dividir(int numero1, int numero2){
          this.resultado =  numero1 / numero2;
        JOptionPane.showMessageDialog(null,"A divisão é " +(numero1 / numero2));
    }
}
