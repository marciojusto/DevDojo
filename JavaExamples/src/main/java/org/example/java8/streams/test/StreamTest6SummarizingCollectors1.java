package org.example.java8.streams.test;

import org.example.java8.streams.classes.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;
import static org.example.java8.streams.classes.Pessoa.bancoDePessoas;

public class StreamTest6SummarizingCollectors1 {

    public static void main(String[] args) {

        List<Pessoa> pessoas = bancoDePessoas();
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(counting()));

        Optional<Pessoa> maxSalario = pessoas.stream().max(comparing(Pessoa::getSalario));
        System.out.println(maxSalario.get().getSalario());
        Optional<Pessoa> maxSalarioCollect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
        System.out.println(maxSalarioCollect.get().getSalario());

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(summingDouble(Pessoa::getSalario)));

        System.out.println(pessoas.stream().collect(summarizingDouble(Pessoa::getSalario)));

        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));
    }
}
