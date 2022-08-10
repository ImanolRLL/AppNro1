package com.acme;

public class HolaApp {
    public static void main(String[] args) {
        System.out.print("Hola Mundo");
        Mensaje msj = new Mensaje();
        String nombre = msj.solicitaDatos("Escribe tu texto");
        msj.saludar(nombre);

    }
}
