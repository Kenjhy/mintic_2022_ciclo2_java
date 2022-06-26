/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic01;

/**
 *
 * @author daniel.vargas
 */
public class AsciaCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Para llamarla
        String asci_convertido_texto = convertTextToAscii("@");
        System.out.println(asci_convertido_texto);
    }

    private static String convertTextToAscii(String text) {
        String resultText = "";
        for (int i = 0; i < text.length(); i++) {
            int ascii = (int) text.charAt(i);
            resultText += ascii;
        }
        return resultText;
    }
}