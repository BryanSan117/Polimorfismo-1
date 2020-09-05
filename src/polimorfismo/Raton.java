/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Bryan Sandoval
 */
public class Raton extends Animal {

    public Raton(String Nombre, String Tipo_de_alimentacion, int Edad) {
        super(Nombre, Tipo_de_alimentacion, Edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de lo que encuentro en casa de los humanos");
    }

    @Override
    public void correr() {
        System.out.println("Corro cuando me ve un Alcon");
    }
    
    
}
