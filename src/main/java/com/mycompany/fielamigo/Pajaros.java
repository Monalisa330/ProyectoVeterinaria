package com.mycompany.fielamigo;


public class Pajaros {
    //Atributos
    int peso,edad,id;
    String nombre,color,raza;

    public Pajaros() {
    }

    public Pajaros(int peso, int edad, int id, String nombre, String color, String raza) {
        this.peso = peso;
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
