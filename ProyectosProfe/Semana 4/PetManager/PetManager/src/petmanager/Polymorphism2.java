
package petmanager;

import Classes.*;


public class Polymorphism2 {
    public static void main(String[] args) {
        // Instancias de las clases hijas
        clsDog dog = new clsDog("criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Minino", 2013, "Blanco y negro", "Enfermo");
        
        //aplicación de sobreesctirua de métodos
        dog.Sound();
        cat.Sound();
        
    }
}
