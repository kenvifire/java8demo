package com.kenvifire;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by hannahzhang on 15/5/31.
 */
public class Compare {

    public static void main(String[] args){
        final List<Person> people = Arrays.asList(
                new Person("John",20),
                new Person("Sara",21),
                new Person("Jane",21),
                new Person("Greg",35)
        );

        List<Person> ascendingAge =
                people.stream()
                    .sorted( (person1, person2) ->
                        person1.ageDifferent(person2))
                    .collect(toList());
        printPeople("Sorted in ascending age",ascendingAge);


        List<Person> descendingAge =
                people.stream()
                        .sorted( (person1, person2) ->
                                person2.ageDifferent(person1))
                        .collect(toList());
        printPeople("Sorted in descending age",descendingAge);


        Comparator<Person> compareAscending =
                (person1, person2) ->
                        person1.ageDifferent(person2);
        Comparator<Person> compareDescending =
                compareAscending.reversed();

        printPeople("Sorted in ascending order by age:",
                people.stream()
                    .sorted(compareAscending)
                    .collect(toList()));

        printPeople("Sorted in descending order by age",
                people.stream()
                    .sorted(compareDescending)
                    .collect(toList()));
    }

    public static void printPeople(final String message, final List<Person> persons){
        System.out.println(message);
        persons.forEach(System.out::println);
    }


}
