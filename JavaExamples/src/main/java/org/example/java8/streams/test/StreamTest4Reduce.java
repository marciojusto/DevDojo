package org.example.java8.streams.test;

import org.example.java8.streams.classes.Pessoa;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest4Reduce {

    public static void main(String[] args) {

        Stream<Integer> streamA = asList(1, 2, 3, 4, 5, 6).stream();
        Optional<Integer> optionalSoma = streamA.reduce((x, y) -> x + y);
        System.out.println(optionalSoma.get());

        Stream<Integer> streamB = asList(1, 2, 3, 4, 5, 6).stream();
        final Integer soma = streamB.reduce(0, (x, y) -> x + y);
        System.out.println(soma);

        Stream<Integer> streamC = asList(1, 2, 3, 4, 5, 6).stream();
        Integer somaReference = streamC.reduce(0, Integer::sum);
        System.out.println(somaReference);

        Stream<Pessoa> pessoaStreamA = Pessoa.bancoDePessoas().stream();
        Double somaSalarioA = pessoaStreamA.filter(pessoa -> pessoa.getSalario() > 4000)
                                         .map(Pessoa::getSalario)
                                         .reduce(0.0, Double::sum); // Unwrapping automático (custoso)
        System.out.println(somaSalarioA);

        Stream<Pessoa> pessoaStreamB = Pessoa.bancoDePessoas().stream();
        double somaSalarioB = pessoaStreamB.filter(pessoa -> pessoa.getSalario() > 4000)
                                         .mapToDouble(Pessoa::getSalario) // Obtem como primitivo mesmo
                                         .sum();
        System.out.println(somaSalarioB);
    }
}
