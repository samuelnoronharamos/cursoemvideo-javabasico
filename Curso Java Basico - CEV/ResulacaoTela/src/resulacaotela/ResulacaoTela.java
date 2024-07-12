/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resulacaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Samuel
 */
public class ResulacaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit dim = Toolkit.getDefaultToolkit();
        Dimension d =  dim.getScreenSize();
        System.out.println("A resolucao do seu sistema eh:" + d.width + "X" + d.height);
    }
    
}
