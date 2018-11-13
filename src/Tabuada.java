
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab01_215
 */
public class Tabuada {
                public static void main(String[] args) {
        
                    int contador =0,ni=0, resultado;
                    
                       ni= Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));  
                    while(contador<=10){
                            
                           resultado =ni*contador;
                           JOptionPane.showMessageDialog(null,"O Resultado é :"+ni+"x"+contador+"="+resultado);
                           contador=contador+1;
                                   
                        
                    }
                
    }
}
