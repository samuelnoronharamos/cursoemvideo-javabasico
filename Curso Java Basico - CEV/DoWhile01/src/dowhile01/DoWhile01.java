/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile01;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class DoWhile01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do{
              System.out.println("Digite um numero: ");
              n = teclado.nextInt();
              s += n;
              System.out.println("Quer Continuar? [s/n]");
              resp = teclado.next();
        }
        while(resp.equals("s"));
        System.out.println("A soma dos vcalores eh:" +s);
    }
    
}
