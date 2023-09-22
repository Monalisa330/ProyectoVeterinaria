package com.mycompany.fielamigo;

public class FielAmigo {

    public static void main(String[] args) {
        // Crear gatos con atributos específicos
        Gato gato1 = new Gato(5, 6, 1, "CAT", "Criollo");
        Gato gato2 = new Gato(5, 8, 2, "CAT", "Siamese");
        
        // Establecer el nombre del primer gato
        gato1.setNombre("Frida");
        gato2.setNombre("Principe");
        
        System.out.println("Información del gato #1: " + gato1.getNombre() + ", Edad: " + gato1.getEdad() + " años, Peso: " + gato1.getPeso() + " kg, Raza: " + gato1.getRaza());
        System.out.println("Información del gato #2: " + gato2.getNombre() + ", Edad: " + gato2.getEdad() + " años, Peso: " + gato2.getPeso() + " kg, Raza: " + gato2.getRaza());

        
        // Crear Perros con atributos específicos
        Perro perro1 = new Perro("Azul",5, 6, 3, "DOG", "Criollo");
        Perro perro2 = new Perro("Morado",7,9,4,"DOG","Pastor alemán"); 
        
        perro1.setNombre("Capitan");
        perro2.setNombre("Bola");
        
        System.out.println("Información del perro #1: " + perro1.getNombre() + ", Color: " + perro1.getColor() + ", Edad: " + perro1.getEdad() + " años, Peso: " + perro1.getPeso() + " kg, Raza: " + perro1.getRaza());
        System.out.println("Información del perro #2: " + perro2.getNombre() + ", Color: " + perro2.getColor() + ", Edad: " + perro2.getEdad() + " años, Peso: " + perro2.getPeso() + " kg, Raza: " + perro2.getRaza());
        
        // Crear Pajaros con atributos específicos
        Pajaros pajaro1 = new Pajaros(3,2,5,"Guacamayo rojo","verde","Ave");
        Pajaros pajaro2 = new Pajaros(5,1,6,"Loro","Rojo","Ave");
        
        pajaro1.setNombre("Goloza");
        pajaro2.setNombre("Ola");
        
        System.out.println("Información del pajaro #1: Nombre: " + pajaro1.getNombre() + ", Edad: " + pajaro1.getEdad() + " años, Peso: " + pajaro1.getPeso() + " kg, Color: " + pajaro1.getColor() + ", Raza: " + pajaro1.getRaza());
        System.out.println("Información del pajaro #2: Nombre: " + pajaro2.getNombre() + ", Edad: " + pajaro2.getEdad() + " años, Peso: " + pajaro2.getPeso() + " kg, Color: " + pajaro2.getColor() + ", Raza: " + pajaro2.getRaza());

        
        
    }
}
