package org.example.java8.lambda;

import org.example.java8.optional.classes.Seguradora;
import org.example.java8.optional.classes2.Carro;

import java.util.function.Supplier;

public class LambdaSuplier {

    public static void main(String[] args) {
        Supplier<String> supString = () -> "Oi";
        System.out.println(supString.get());

        Supplier<Carro> supCarro = () -> new Carro(new Seguradora("Aliance Seguros"), "Ferrari");
        System.out.println(supCarro.get().getNome());
    }
}
