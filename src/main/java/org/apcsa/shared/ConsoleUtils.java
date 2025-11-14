package org.apcsa.shared;

public class ConsoleUtils {
    public static void title(String text) {
        String line = "=".repeat(Math.max(3, text.length() + 4));
        System.out.println(line);
        System.out.println("  " + text);
        System.out.println(line);
    }

    public static void assertEquals(Object expected, Object actual, String msg) {
        if ((expected == null && actual == null) || (expected != null && expected.equals(actual))) {
            System.out.println("[PASS] " + msg);
        } else {
            System.out.println("[FAIL] " + msg + " (expected: " + expected + ", actual: " + actual + ")");
        }
    }
}
