/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author domiciosilva
 */
public class MinhaMensagem {
    private String mensagem;
    
    public MinhaMensagem(String mensagem){
        this.mensagem = mensagem;
}
    
    public void mostrar(){
        
        JOptionPane.showMessageDialog(null,this.mensagem);
    }
}
