/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota:");    
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s eh: %.1f \n ",nome,nota);
        //System.out.format("A nota de %s eh: %.2f \n ",nome,nota);

    }
    
}
