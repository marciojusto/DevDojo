package org.example.java8.streams.test;

import org.example.java8.streams.classes.Genero;
import org.example.java8.streams.classes.Maioridade;
import org.example.java8.streams.classes.Pessoa;

import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest6GroupingByCollectors2 {

    public static void main(String[] args) {
        Map<Genero, List<Pessoa>> collect = Pessoa.bancoDePessoas().stream().collect(groupingBy(Pessoa::getGenero));
        System.out.println(collect);

        Map<Maioridade, List<Pessoa>> collect1 = Pessoa.bancoDePessoas().stream().collect(groupingBy(pessoa -> {
            if (pessoa.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.MAIOR;
        }));
        System.out.println(collect1);

        // Agrupando por Gênero e Maioridade
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = Pessoa.bancoDePessoas()
                                                                    .stream()
                                                                    .collect(
                                                                            groupingBy(Pessoa::getGenero,
                                                                                    groupingBy(pessoa -> {
            if (pessoa.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.MAIOR;
        })));
        System.out.println(collect2);

        // Agrupando por Gênero e Quantidade
        Map<Genero, Long> collect3 = Pessoa.bancoDePessoas().stream().collect(groupingBy(Pessoa::getGenero, counting()));
        System.out.println(collect3);

        // Agrupando por Gênero e Maior Salário sem optional
        Map<Genero, Pessoa> collect4 = Pessoa.bancoDePessoas()
                                             .stream()
                                             .collect(groupingBy(Pessoa::getGenero,
                                                     collectingAndThen(
                                                             maxBy(Comparator.comparing(Pessoa::getSalario)),
                                                             Optional::get)));
        System.out.println(collect4);

        Map<Genero, DoubleSummaryStatistics> collect5 = Pessoa.bancoDePessoas()
                                                              .stream()
                                                              .collect(
                                                                      groupingBy(Pessoa::getGenero,
                                                                              summarizingDouble(Pessoa::getSalario)));
        System.out.println(collect5);

        // Agrupando por Gênero e Maioridade mapping to Set
        Map<Genero, Set<Maioridade>> collect6 = Pessoa.bancoDePessoas().stream().collect(groupingBy(Pessoa::getGenero, mapping(pessoa -> {
            if (pessoa.getIdade() > 18) return Maioridade.MAIOR;
            else return Maioridade.MENOR;
        }, toSet())));
        System.out.println(collect6);

        // Agrupando por Gênero e Maioridade mapping to Set
        Map<Genero, Set<Maioridade>> collect7 = Pessoa.bancoDePessoas().stream().collect(groupingBy(Pessoa::getGenero, mapping(pessoa -> {
            if (pessoa.getIdade() > 18) return Maioridade.MAIOR;
            else return Maioridade.MENOR;
        }, toCollection(LinkedHashSet::new))));
        System.out.println(collect7);
    }
}
