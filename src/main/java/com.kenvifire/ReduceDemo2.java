package com.kenvifire;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by hannahzhang on 15/5/30.
 */
public class ReduceDemo2 {

    public static void main(String [] args){
        final List<String> friends = Arrays.asList("test");
                //Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott") ;

        final Optional<String> aLongName =
                friends.stream()
                .reduce((name1, name2) ->
                        name1.length() >= name2.length() ?
                                name1 : name2);

        aLongName.ifPresent(name ->
            System.out.println(String.format("A longest name : %s", name)));

    }
}
