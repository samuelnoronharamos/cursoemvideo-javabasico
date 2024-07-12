/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplaescolhaa;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class MultiplaEscolhaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantas pernas?");
    String tipo;
    int qtdepernas = teclado.nextInt();
    
    switch (qtdepernas) {
        case 1: 
            tipo = "SACI";
            break;
        case 2:
            tipo = "Bípede";
            break;
        case 4:
            tipo = "Qadrupede";
            break;
         case 6,8:
            tipo = "Aranha";
            break;   
         default:
             tipo = "ET";
             break;
    }
    System.out.println(tipo);
    }   
}
