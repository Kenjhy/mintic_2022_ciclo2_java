
package petmanager;

import Classes.clsDog;


public class Polymorphism3 {
    public static void main(String[] args) {
        // Instancias de las clases hijas
        clsDog dog = new clsDog("criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        
        dog.WalkAround();
        dog.WalkAround(5);
        dog.WalkAround(true);
    } //fin main
    
} //fin clase
