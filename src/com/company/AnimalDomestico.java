package com.company;

abstract public class AnimalDomestico {

    private String nombre;
    private String color;

    public AnimalDomestico(String nombre,String color){
        this.color=color;
        this.nombre=nombre;

    }

    abstract public void saludar();
}
