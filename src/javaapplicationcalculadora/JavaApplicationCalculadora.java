/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcalculadora;

import apresentacao.MinhaMensagem;
import controle.Calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author domiciosilva
 */
public class JavaApplicationCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MinhaMensagem minhaMensagem = new MinhaMensagem("Olá a todos");
        
        minhaMensagem.mostrar();
       /* Calculadora calculadora = new Calculadora();
        
        calculadora.somar(3, 80);
         JOptionPane.showMessageDialog(null, calculadora.resultado);
         
        calculadora.dividir(50, 2);
        calculadora.multiplicar(3, 9);
        calculadora.dividir(4, 1);
               */
    }
    
}
