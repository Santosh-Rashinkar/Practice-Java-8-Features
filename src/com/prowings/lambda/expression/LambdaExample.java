package com.prowings.lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Santosh", 22),
            new Person("Sanjay", 21),
            new Person("Canduu", 23),
            new Person("Shubham", 21),
            new Person("Ganesh", 20),
            new Person("Raju", 18),
            new Person("Ganesh", 25),
            new Person("Ram", 15)
        );

        // Filter and sort using lambda expressions
        List<Person> filteredAndSorted = people.stream()
            .filter(person -> person.getAge() > 21)
            .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
            .collect(Collectors.toList());

        filteredAndSorted.forEach(System.out::println);
    }
}
