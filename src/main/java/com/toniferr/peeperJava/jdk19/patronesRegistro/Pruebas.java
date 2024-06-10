package com.toniferr.peeperJava.jdk19.patronesRegistro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pruebas {

    public record Position(int x, int y) {}

    public static void main(String[] args) {
        Object object = new Position(10, 20);
        if (object instanceof Position p) {
            System.out.println("Objeto es una posición, x = " + p.x() + ", y = " + p.y());
        }
    }
}
