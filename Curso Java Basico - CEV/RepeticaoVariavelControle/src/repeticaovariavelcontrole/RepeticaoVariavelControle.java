/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaovariavelcontrole;

/**
 *
 * @author Samuel
 */
public class RepeticaoVariavelControle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cambalhota=0;
        
        for (int cc=0; cc<=100; cc+=10){
            System.out.println("Cambalhota");
            cambalhota++;
        }
        System.out.printf("Foram dadas %d cambalhotas \n",cambalhota);
    }
    
}
