/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Samuel
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]={3,7,6,1,9,4,2};
        int p = Arrays.binarySearch(vet, 1);
        for ( int v:vet){
        System.out.println(v);
        }
        System.out.println("Encontrei o valor na posicao " +p);
        }
    
}
