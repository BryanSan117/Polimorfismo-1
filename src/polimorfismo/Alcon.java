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
public class Alcon extends Animal {

    public Alcon(String Nombre, String Tipo_de_alimentacion, int Edad) {
        super(Nombre, Tipo_de_alimentacion, Edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de animales mas pequeños que yo ejemplo -Roedores-");
    }

    @Override
    public void correr() {
        System.out.println("No puedo correr pero si planeo a velocidades muy altas");
    }
    
}
