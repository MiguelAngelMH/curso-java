/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author PC18-LB02
 */
public class Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        caja1 v =new caja1(3,4,5);
        int resultado=v.volumen();
        System.out.println("el volumen de la caja es " + resultado);
    }
    
}
