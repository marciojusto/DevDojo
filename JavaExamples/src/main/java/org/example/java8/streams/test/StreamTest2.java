package org.example.java8.streams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamTest2 {

    public static void main(String[] args) {

        List<List<String>> nomes = new ArrayList<>();

        nomes.add(asList("DevDojo", "William"));
        nomes.add(asList("Marcio", "Justo"));

        System.out.println(nomes);

        List<String> strings = nomes.stream()
                                    .flatMap(List::stream)
                                    .collect(Collectors.toList());

        System.out.println(strings);
    }
}
