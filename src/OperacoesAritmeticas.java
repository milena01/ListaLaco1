
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
public class OperacoesAritmeticas {
        public static void main(String[] args) {
            
        int uma, dois, resultado, ale=0;
        
        
        ale=Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação: \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-SAIR"));
        while(ale==5){
               
        uma=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        dois=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
       if (ale==1){
           resultado=uma+dois;
                JOptionPane.showMessageDialog(null,"O resultado da Soma é de:  "+resultado);
       }
       if (ale==2){
           resultado=uma-dois;
                JOptionPane.showMessageDialog(null,"O resultado da Subtração é: "+resultado);
       }
       if (ale==3){
           resultado=uma*dois;
                JOptionPane.showMessageDialog(null,"O resultado da Multiplicação é: "+resultado);
       }
       if (ale==4){
           resultado=uma/dois;
                JOptionPane.showMessageDialog(null,"O resultado da Divisão é: "+resultado);
       }
        if (ale==5){
            System.exit(0);
        }
   
        
        
        }
    }
}
