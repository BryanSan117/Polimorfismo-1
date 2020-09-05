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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alcon al = new Alcon ("Rapdin","Roedores",4);
        
        Raton rt = new Raton ("Stuart Litle","Semillas",6);
        
        al.alimentarse();
        al.correr();
        rt.alimentarse();
        rt.correr();
    }
    
}
