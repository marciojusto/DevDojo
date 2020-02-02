package org.example.optional.test;

import org.example.optional.classes.Carro;
import org.example.optional.classes.Pessoa;
import org.example.optional.classes.Seguradora;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("DevDojo Seguros");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa pessoa = new Pessoa(carro, "Carlos");
        //pessoa = null;
        System.out.println(getNomeSeguradora(Optional.ofNullable(pessoa)));
    }

    public static String getNomeSeguradora(Optional<Pessoa> pessoa) {
        return pessoa.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome).orElse("Vazio");
    }

    public static String obterNomeSeguradoraOptional(Seguradora seguradora) {
        System.out.println(Optional.ofNullable(seguradora).map(Seguradora::getNome));
        //System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome));
        return "";
    }

    public static String obterNomeSeguradora(Seguradora seguradora) {
        String nome = "";
        if (seguradora.getNome() != null) {
            //nome = seguradora.getNome();
        }
        return nome;
    }
}
