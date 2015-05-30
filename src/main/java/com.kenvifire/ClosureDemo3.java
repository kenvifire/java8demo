package com.kenvifire;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by hannahzhang on 15/5/30.
 */
public class ClosureDemo3 {



    public static void main(String[] args){

        final Function<String,Predicate<String>> startWithLetter =
                (String letter) ->
                        (String name) -> name.startsWith(letter);



        final List<String> friends =
                Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scott") ;

        final long countFriendsStartWithN =
                friends.stream()
                        .filter(startWithLetter.apply("N"))
                        .count();

        final long countEditorsStartWithB =
                friends.stream()
                        .filter(startWithLetter.apply("B"))
                        .count();


    }
}
