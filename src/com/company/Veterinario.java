package com.company;

public class Veterinario {
    AnimalDomestico animal;

    public Veterinario(AnimalDomestico a){
        this.animal=a;
    }

    public void curar(){
        if(this.animal instanceof Gato){
            System.out.println("Estoy curando un gato");
        }else {
            System.out.println("Estoy curando un perro");
        }
        this.animal.saludar();
    }
}
