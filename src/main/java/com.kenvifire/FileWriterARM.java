package com.kenvifire;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by hannahzhang on 15/5/31.
 */
public class FileWriterARM implements AutoCloseable{
    private final FileWriter writer;

    public FileWriterARM(final String fileName) throws IOException{
        writer = new FileWriter(fileName);
    }

    public void writeStuff(final String message) throws IOException{
        writer.write(message);
    }

    public void close() throws IOException{
        System.out.println("close called automatically...");
        writer.close();
    }

    public static void main(String[] args) throws IOException{
        try(final FileWriterARM fileWriterARM = new FileWriterARM("test.txt")){
            fileWriterARM.writeStuff("test");
            System.out.println("done with the resource...");
        }

    }
}
