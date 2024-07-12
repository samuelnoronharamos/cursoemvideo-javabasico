/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Samuel
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n,s=0,total=0,par=0,impar=0,acima=0,mediaint=0;
        do{ 
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Infome um numero: <br><em>(Valor 0 interrompe)</em></html>"));
            if (n ==0) break;
            total++;
            if (n%2 == 0) par++;
            else impar++;
            if (n>=100) acima++;
            s += n;
       }while(n != 0);
        mediaint = s / total; 
        String escritapares = "<br> Total de pares: ";
        String escritimpares = "<br> Total de impares: ";
        String escritacima100 = "<br> Acima de 100: ";
        String media = "<br> Media dos valores: "; 

        
        String escritatotal = "<br> Total de valores: ";
        JOptionPane.showMessageDialog(null,"<html>Resultado <hr>" +escritatotal +total  +escritapares + par + escritimpares + impar +escritacima100 + acima +media + mediaint +"</html> ");
       }
       
}