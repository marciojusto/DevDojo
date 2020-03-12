package org.example.java8.lambda.predicate;

import java.util.function.Predicate;

public class LambdaPredicateTest {

    public static void main(String[] args) {

        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equalsIgnoreCase("verde");
            }
        };

        System.out.println(carroPredicate.test(new Carro("verde", 2000)));

        Predicate<Carro> carroPredicateLambda = (Carro carro) -> carro.getCor().equalsIgnoreCase("azul");
        System.out.println(carroPredicateLambda.test(new Carro("Azul", 2000)));
    }
}
