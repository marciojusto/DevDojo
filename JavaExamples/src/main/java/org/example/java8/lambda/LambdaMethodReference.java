package org.example.java8.lambda;

import org.example.java8.lambda.classes.Carro;
import org.example.java8.lambda.classes.ComparadorCarro;

import java.util.Collections;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;

public class LambdaMethodReference {

    public static void main(String[] args) {
        List<String> strings = asList("Marcio", "Justo", "Spring");
        forEach(strings, System.out::println);

        List<Carro> carros = asList(new Carro("Vermelho", 1999),
                new Carro("Azul", 2005), new Carro("Preto", 1985));
        //Collections.sort(carros, (o1, o2) -> o1.getColor().compareTo(o2.getColor()));

        //By Static Method Reference
        Collections.sort(carros, ComparadorCarro::compareByColor);
        System.out.println(carros);

        //BY Instance Method of a Particular Object Reference
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros, comparadorCarro::compareByYear);
        System.out.println(carros);

        //By Instance Method of an Arbitrary Object of a Particular Type Reference
        //strings.sort((s1, s2) -> s1.compareTo(s2));
        strings.sort(String::compareTo); //Para comportamento padrão, para ordem inversa seria Lambda mesmo.
        System.out.println(strings);

        Function<String, Integer> stringToIntegerLambda = (String s) -> Integer.parseInt(s);
        //System.out.println(stringToIntegerLambda.apply("10"));
        Function<String, Integer> stringToIntegerReference = Integer::parseInt;
        System.out.println(stringToIntegerReference.apply("10"));

        BiPredicate<List<String>, String> containsLambda = (list, s) -> list.contains(s);
        //System.out.println(containsLambda.test(strings, "Marcio"));
        BiPredicate<List<String>, String> containsReference = List::contains;
        System.out.println(containsReference.test(strings, "Marcio"));

        //By Constructor Reference
        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        Collections.sort(carros, comparadorCarroSupplier.get()::compareByYear);
        System.out.println(carros);

        BiFunction<String, Integer, Carro> biFunctionLambda = (s, i) -> new Carro(s, i);
        //System.out.println(biFunctionLambda.apply("Rosa", 1994));
        BiFunction<String, Integer, Carro> biFunctionReference = Carro::new;
        System.out.println(biFunctionReference.apply("Rosa", 1994));
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

}
