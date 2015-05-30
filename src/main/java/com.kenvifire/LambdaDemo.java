package com.kenvifire;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by hannahzhang on 15/5/30.
 */
public class LambdaDemo {
    public static void main(String[] args){
        final List<String> friends =
                Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scott") ;

        final List<String> editors =
                Arrays.asList("Brian","Jackie","John","Mike");

        final List<String> comrades =
                Arrays.asList("Kate","Ken","Nick","Paula","Zach");

        final Predicate<String> startsWithN = name ->
                name.startsWith("N");

        final long countFriendsStartWithN =
                friends.stream()
                    .filter(startsWithN)
                    .count();

        final long countEditorsStartWithN =
                editors.stream()
                    .filter(startsWithN)
                    .count();

        final long countComradesStartWithN =
                comrades.stream()
                    .filter(startsWithN)
                    .count();

    }
}
