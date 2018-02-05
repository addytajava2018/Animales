package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        AnimalDomestico g;/*Tambien se puede instanciar asi, pero no se puede volver a crear animal
        por que es abstract*/
        g = new Gato("tom", "negro");
        //g.saludar();
        //Perro p = new Perro("hulk", "verde", "Chihuahua");
        //p.saludar();
        AnimalDomestico p = new Perro("hulk", "verde", "Chihuahua");

        Veterinario v=new Veterinario(p);
        
        v.curar();

            }
}
