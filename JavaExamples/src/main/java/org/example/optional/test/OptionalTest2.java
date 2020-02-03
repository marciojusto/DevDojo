package org.example.optional.test;

import org.example.optional.classes.Carro;
import org.example.optional.classes.Pessoa;
import org.example.optional.classes.Seguradora;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("DevDojo Seguros");
        Carro carro = new Carro(seguradora, "Audi");
        Pessoa pessoa = new Pessoa(carro, "Carlos", 20);
        //pessoa = null;
        System.out.println(getNomeSeguradora(Optional.ofNullable(pessoa)));
        checarNomeSeguradoraOptional(seguradora);
        System.out.println(obterNomeSeguradoraComIdade(pessoa, 20));
    }

    private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
        return Optional.ofNullable(p)
                .filter(pessoa -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe seguradora ou idade mínima não foi atendida");
    }

    private static void checarNomeSeguradora(Seguradora seguradora) {
        if(seguradora != null && seguradora.getNome().equalsIgnoreCase("DevDojo Seguros")) {
            System.out.println("É o DevDojo!");
        }
    }

    private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
        Optional.ofNullable(seguradora)
                .filter(s -> s.getNome().equalsIgnoreCase("DevDojo Seguros"))
                .ifPresent(x -> System.out.println("É o DevDojo!"));
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
