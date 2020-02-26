package org.example.java8.lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class LambdaPredicateTiposPrimitivos {

    public static void main(String[] args) {
        Predicate<Integer> ehPar = (Integer i) -> i % 2 == 0; //Consome mais memória
        System.out.println(ehPar.test(10000));
        IntPredicate ehImpar = (int i) -> i % 2 == 1;
        System.out.println(ehImpar.test(10001));
    }
}
