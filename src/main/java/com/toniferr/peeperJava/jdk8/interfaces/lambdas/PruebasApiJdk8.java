package com.toniferr.peeperJava.jdk8.interfaces.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PruebasApiJdk8 {

    public static void main(String[] args) {

        System.out.println("========Interfaces funcionales en el api de Java8========");
        System.out.println("CONSUMER: interfaz funcional con solo metodo - void accept(T)");
        Consumer<String> c = txt -> System.out.println("Consumer:" + txt);
        c.accept("Descanso!");

        System.out.println("PREDICATE: interfaz funcional con solo metodo - boolean test(T)");
        Predicate<String> filtro = txt -> txt.length() > 10;
        boolean rs1 = filtro.test("HOLA");
        boolean rs2 = filtro.test("HOLA RADIOLA");
        System.out.println(rs1 + "," + rs2);

        System.out.println("FUNCTION: interfaz funcional con solo metodo - public Tipo1 apply(Tipo2 t)");
        Function<String, String> transformacion = txt -> txt.toUpperCase();
        String txt = transformacion.apply("abcdefg");
        System.out.println(txt);

        System.out.println("SUPPLIER: interfaz funcional con solo metodo - public T get()");
        Supplier<Double> suplier = () -> {
            System.out.println("Hola caracola");
            return Math.random();
        };
        //tamb Supplier<Double> suplier = () -> Math.random();
        Double n = suplier.get();
        System.out.println(n);
    }
}