
package com.mycompany.fielamigo;


public class Gato {
    //Atributos
    int edad, peso, id;
    String nombre,raza;

    public Gato() {
    }

    public Gato(int edad, int peso, int id, String nombre, String raza) {
        this.edad = edad;
        this.peso = peso;
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
