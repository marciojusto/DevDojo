package org.example.optional.test;

import java.util.Optional;

public class OptionalTest1 {

    private String nome;

    public static void main(String[] args) {
        OptionalTest1 ot = new OptionalTest1();

        Optional<String> optional1 = Optional.of("Teste");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(ot.nome);

        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);

        if(optional3.isPresent()) {
            System.out.println(optional3.get());
        }

        System.out.println(optional1.orElse(new String()));
        System.out.println(optional2.orElse("Vazio"));
        System.out.println(optional3.orElse("Vazio"));
    }
}
