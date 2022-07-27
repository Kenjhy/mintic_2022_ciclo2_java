/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author USUARIO
 */
public class clsDog extends clsPet {
    private String breed;
    private boolean pedigree;

    public clsDog(String breed, boolean pedigree, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
        this.pedigree = pedigree;
    }    
    
    //NO recibe parametros
    public void WalkAround(){
        System.out.println("El perro " + super.getName() + " está caminando.");
    }   
    
    //recibe parametro intero la cantidad de kilometros a pasear
    public void WalkAround(int km){
        System.out.println("El perro " + super.getName() + " está caminando." + km + "km");
    }   
    
    //recibe parametro booleano, para pasear con correa o sin correa
    public void WalkAround(boolean dogLeash){
        String hasLeash = dogLeash ? "Con correa ": "Sin correa";
        System.out.println("El perro " + super.getName() + " está caminando." + hasLeash);
    }   

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    //Override permite redefinir un método que ya está en la clase padre
    @Override
     public void Sound(){
        System.out.println("El perro " + super.getName() + " hace Guauuuuu");
    }
    
    
}
