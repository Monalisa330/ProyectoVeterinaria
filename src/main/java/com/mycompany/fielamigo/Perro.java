
package com.mycompany.fielamigo;


public class Perro extends Mascotas {
    String Color;

    public Perro() {
    }

    public Perro(String Color, int edad, int peso, int id, String nombre, String raza) {
        super(edad, peso, id, nombre, raza);
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
}