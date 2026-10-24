package com.example.micomedor10.util;

public class Validadores {

    public static boolean textoValido(String t) {
        return t != null && !t.trim().isEmpty();
    }

    public static boolean documentoValido(String d) {
        return d != null && d.matches("\\d{5,12}");
    }

    public static boolean edadValida(int edad) {
        return edad > 0 && edad < 120;
    }
}

