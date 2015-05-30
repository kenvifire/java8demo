package com.kenvifire;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by hannahzhang on 15/5/30.
 */
public class OptionDemo {

    public static void main(String[] args){
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott") ;
        pickName(friends,"B");
    }

    public static void pickName(final List<String> names,
                                final String startingLetter){

        final Optional<String> foundName =
                names.stream()
                    .filter(name ->
                        name.startsWith(startingLetter))
                    .findFirst();

        System.out.println(String.format("A name string with %s: %s",
                startingLetter, foundName.orElse("No name found")));

        foundName.ifPresent( name ->
            System.out.println(name));

    }
}
