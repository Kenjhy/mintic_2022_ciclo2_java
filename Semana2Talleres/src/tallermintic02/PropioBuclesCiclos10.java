/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermintic02;

/**
 *
 * @author ASUS
 */
public class PropioBuclesCiclos10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        do {
            i++;
            ++j;
            System.out.println(i * j);

        } while ((i < 10) && (j * j != 25));

        i++;
        ++j;
        System.out.println(i * j);
        while ((i < 10) && (j * j != 25)) {
            i++;
            ++j;
            System.out.println(i * j);
        }
    }

}
