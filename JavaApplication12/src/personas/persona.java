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
public class persona {
    String nombre;
    String ApellidoPaterno;
    String ApellidoMaterno;

    public void desplegarNombre(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido Paterno:" + ApellidoPaterno);
        System.out.println("Apellido Materno:" + ApellidoMaterno);

    }
}
