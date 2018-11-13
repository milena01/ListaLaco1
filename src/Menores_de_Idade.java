
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
public class Menores_de_Idade {
                public static void main(String[] args) {
                int contador=0,idade,menores=0;
                
                while(contador <= 10){
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade das Pessoas : \n Obs : O projeto só parará depois de 10 idades informadas !!."));
                    
                    contador=contador+1;
                    
                    if (idade < 18){
                        menores= menores+1;
                    }
               
                   if(contador == 10){
                       JOptionPane.showMessageDialog(null,"O Numero de Pessoas Menores de Idade é de: "+menores);
                   }
                } 
    }
}
