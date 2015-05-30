package com.kenvifire;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hannahzhang on 15/5/30.
 */
public class ReduceDemo {

    public static void main(String [] args){
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott") ;

        System.out.println("Total number of characters in all names: " +
            friends.stream()
                .mapToInt( name -> name.length())
                .sum());

        System.out.println("Max number of characters in all names: " +
                friends.stream()
                        .mapToInt( name -> name.length())
                        .max());

        System.out.println("Min number of characters in all names: " +
                friends.stream()
                        .mapToInt( name -> name.length())
                        .min());
    }
}
