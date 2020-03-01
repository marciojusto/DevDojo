package org.example.java8.streams.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest5GerandoStream {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));

        System.out.println();
        Stream.of("Spring", "Spring Boot", "Spring Reactive")
              .forEach(s -> System.out.print(s + " "));

        Stream<String> empty = Stream.empty();

        int nums[] = {1,2,3,4,5};
        Arrays.stream(nums).average().ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("Teste.txt"), Charset.defaultCharset())) {
            lines.flatMap(line -> Arrays.stream(line.split("\n")))
                 .filter(p -> p.contains("File"))
                 .forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Stream.iterate(1, n -> n+2).limit(10).forEach(System.out::println);

        Stream.iterate(new int[]{0,1}, a -> new int[]{a[1], a[0] + a[1]})
              .limit(5)
              .forEach(t -> System.out.println(Arrays.toString(t)));

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
