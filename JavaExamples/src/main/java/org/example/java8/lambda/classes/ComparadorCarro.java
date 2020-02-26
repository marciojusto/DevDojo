package org.example.java8.lambda.classes;

public class ComparadorCarro {

    public static int compareByColor(Carro c1, Carro c2) {
        return c1.getColor().compareTo(c2.getColor());
    }

    public int compareByYear(Carro c1, Carro c2) {
        return c1.getAno().compareTo(c2.getAno());
    }
}
