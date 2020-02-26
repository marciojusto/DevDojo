package org.example.java8.lambda;

import java.util.List;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class LambdaConsumer {

    public static void main(String[] args) {
        forEach(asList("Marcio", "Justo", "Spring"), (String s) -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }
}
