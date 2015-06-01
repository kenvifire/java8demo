package com.kenvifire;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hannahzhang on 15/5/31.
 */
public class LazyStreams {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Brad","Kate",
                "Kim","Jack","Joe","Mike","Susan","George",
                "Robert","Julia","Parker","Benson");

        final String firstNameWith3Letters =
            names.stream()
                .filter( name -> length(name) == 3)
                .map(name -> toUpper(name))
                .findFirst()
                .get();
    }

    private static int length(final String name){
        System.out.println("getting length for " + name);
        return name.length();
    }

    private static String toUpper(final String name){
        System.out.println("converting to uppercase" + name);
        return name.toUpperCase();
    }
}
