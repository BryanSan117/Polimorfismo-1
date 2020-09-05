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
public abstract class Animal {
    
    private String Nombre;
    private String Tipo_de_alimentacion;
    private int Edad;

    public Animal(String Nombre, String Tipo_de_alimentacion, int Edad) {
        this.Nombre = Nombre;
        this.Tipo_de_alimentacion = Tipo_de_alimentacion;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo_de_alimentacion() {
        return Tipo_de_alimentacion;
    }

    public void setTipo_de_alimentacion(String Tipo_de_alimentacion) {
        this.Tipo_de_alimentacion = Tipo_de_alimentacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public abstract void alimentarse();
    public abstract void correr();
    
    
}
