package com.kenvifire;

/**
 * Created by hannahzhang on 15/5/31.
 */
public class IterateString {
    public static void main(String[] args){
        final String str = "w00t";

        str.chars()
                .forEach( ch -> System.out.println(ch));

        str.chars()
                .forEach(System.out::println);

        str.chars()
                .forEach(IterateString::printChar);

        str.chars()
                .filter(Character::isDigit)
                .forEach(IterateString::printChar);

    }

    public static void printChar(int aChar){
        System.out.println((char)(aChar));
    }
}
