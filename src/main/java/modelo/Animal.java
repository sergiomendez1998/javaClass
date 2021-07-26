/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import lombok.Data;

/**
 *
 * @author Sergio_Mendez_G
 */
@Data
public class Animal {

    private String nombre;
    private String especie;
    private int edad;
    private String color;
    private String paisOrigen;
    private String peso;
    private int numeroPatas;

    public Animal() {
    }
    
    

}
