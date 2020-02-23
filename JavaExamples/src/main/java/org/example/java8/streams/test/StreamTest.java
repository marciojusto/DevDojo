package org.example.java8.streams.test;

import org.example.java8.streams.classes.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Pessoa.bancoDePessoas();

        List<String> nomes = pessoas.stream()
                                    .filter(pessoa -> pessoa.getIdade() < 25)
                                    .limit(2)
                                    .map(Pessoa::getNome)
                                    .sorted()
                                    .collect(Collectors.toList());

        System.out.println(nomes);
    }
}
