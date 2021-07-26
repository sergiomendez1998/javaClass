/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Sergio_Mendez_G
 */
public class Pato {

    Scanner read = new Scanner(System.in);

    public void setPato() {

        Animal pato1 = new Animal();

        System.out.println("ingrese nombre pato");
        pato1.setNombre(read.nextLine());

        System.out.println("ingrese especie");
        pato1.setEspecie(read.nextLine());

        System.out.println("ingrese edad");
        pato1.setEdad(read.nextInt());

        mostrarDatos(pato1);

    }

    private void mostrarDatos(Animal animal) {

        System.out.println("nombre: " + animal.getNombre());
        System.out.println("Especie: " + animal.getEspecie());
        System.out.println("Edad: " + animal.getEdad());
        System.out.println("Color: " + animal.getColor());
        System.out.println("Pais Origen: " + animal.getPaisOrigen());

    }

}
