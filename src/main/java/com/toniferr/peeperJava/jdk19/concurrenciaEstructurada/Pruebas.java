package com.toniferr.peeperJava.jdk19.concurrenciaEstructurada;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pruebas {

    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.println("Tarea 1"));
            executor.submit(() -> System.out.println("Tarea 2"));
        }

    }
}
