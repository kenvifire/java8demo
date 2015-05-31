package com.kenvifire;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Created by hannahzhang on 15/5/31.
 */
public class HandleException {
    public static void main (String[] args)
        throws IOException{

        Stream.of("/user", "/tmp","xxx1")
                .map(path -> {
                    try {
                        return new File(path)
                                .getCanonicalFile();
                    } catch (IOException ex) {
                        return ex.getMessage();
                    }
                })
                .forEach(System.out::println);




    }
}
