/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author PC18-LB02
 */
public class personaPrueba {
    public static void main(String args []) {
        
        persona p1= new persona();
        p1.desplegarNombre();
        p1.nombre = "armando";
        p1.ApellidoPaterno = "Mamani";
        p1.ApellidoMaterno = "Huamani";
        
        p1.desplegarNombre();
    }
}
