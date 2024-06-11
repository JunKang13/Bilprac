package com.kj.test7;

import java.io.*;

public class TestIO {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Java_workspace\\Bili_practice\\Module1\\src\\com\\kj\\test7\\text.txt");
        //read
        FileReader reader = new FileReader(file);
        int n1 = reader.read();
        System.out.println((char)n1);

        //read all
        for (int n2 = reader.read(); n2 != -1; n2 = reader.read()) {
            System.out.print((char)n2);
        }

        //write
        FileWriter writer = new FileWriter(file, true);
        writer.write("Hello World!");

        // c
        writer.close();
    }
}
