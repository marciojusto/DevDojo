package org.example.java8.streams.test;

import org.example.java8.streams.classes.Pessoa;

import java.util.Comparator;
import java.util.List;

public class StreamTest3FindMatch {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().anyMatch(pessoa -> pessoa.getSalario() > 4000));
        System.out.println(pessoas.stream().allMatch(pessoa -> pessoa.getIdade() > 18));
        System.out.println(pessoas.stream().noneMatch(pessoa -> pessoa.getIdade() < 18));

        pessoas.stream()
               .filter(pessoa -> pessoa.getIdade() < 25)
               .findAny()
               .ifPresent(System.out::println);

        pessoas.stream()
               .filter(pessoa -> pessoa.getIdade() > 25)
               .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
               .findFirst()
               .ifPresent(System.out::println);
    }
}
