package com.toniferr.peeperJava.jdk18.utf8Default;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pruebas {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("happy-coding.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("ハッピーコーディング!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
