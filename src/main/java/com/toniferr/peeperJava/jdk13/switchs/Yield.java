package com.toniferr.peeperJava.jdk13.switchs;

public class Yield {

	public static void main(String[] args) {
        System.out.println(getValueViaYield("f"));
        System.out.println(getValueViaYield("z"));
    }

    /** Java 13, switch expression returns a value via yield **/
    private static int getValueViaYield(String mode) {
        int result = switch (mode) {
            case "a", "b":
                yield 1;
            case "c":
                yield 2;
            case "d", "e", "f":
                // do something here...
                System.out.println("Supports multi line block!");
                yield 3;
            default:
                yield -1;
        };
        return result;
    }
}
