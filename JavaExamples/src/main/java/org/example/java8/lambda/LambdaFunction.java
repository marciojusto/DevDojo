package org.example.java8.lambda;

import org.example.java8.optional.classes2.Carro;
import org.example.java8.optional.classes2.Seguradora;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class LambdaFunction {

    public static void main(String[] args) {
        List<Integer> integerList = map(asList("Marcio", "Justo", "Spring"), (String s) -> s.length());
        System.out.println(integerList);
        List<Carro> carros = asList(new Carro(new Seguradora("Pedra Seguros"), "Monza"),
                new Carro(new Seguradora("Pedra Seguros"), "Fiat"));
        List<String> nomes = map(carros, (Carro c) -> c.getNome());
        System.out.println(nomes);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
