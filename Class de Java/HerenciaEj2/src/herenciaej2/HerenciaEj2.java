/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej2;

import servicios.ServicioLavadora;

/**
 *
 * @author Oficina
 */
public class HerenciaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioLavadora lavadora = new ServicioLavadora();
       lavadora.crearLavadora();
       lavadora.precioFinal();
    }
    
}
