package com.kenvifire;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by hannahzhang on 15/5/30.
 */
public class ClosureDemo {

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }


    public static void main(String[] args){
        final List<String> friends =
                Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scott") ;

        final long countFriendsStartWithN =
                friends.stream()
                        .filter(checkIfStartsWith("N"))
                        .count();

        final long countEditorsStartWithB =
                friends.stream()
                        .filter(checkIfStartsWith("B"))
                        .count();


    }
}
