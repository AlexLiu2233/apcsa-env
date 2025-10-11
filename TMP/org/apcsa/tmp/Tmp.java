package org.apcsa.tmp;

import org.apcsa.shared.ConsoleUtils;

public class Tmp {
    public static void main(String[] args) {
        ConsoleUtils.title("TMP sandbox");

        // Demo calls (expected outputs in comments):
        System.out.println(stringMatch("xxcaazz", "xxbaaz")); // 3
        System.out.println(stringMatch("abc", "abc"));        // 2
        System.out.println(stringMatch("abc", "axc"));        // 0

        // Try your own:
        // System.out.println(stringMatch("hello", "heLLo"));
    }

    /**
     * Given 2 strings, a and b, return the number of positions where they contain
     * the same length-2 substring at the same index.
     * e.g. "xxcaazz" and "xxbaaz" -> 3 ("xx", "aa", "az")
     */
    public static int stringMatch(String a, String b) {
        // Compare up to the last index where a 2-char window fits in both
        int limit = Math.min(a.length(), b.length()) - 2;
        int count = 0;

        for (int i = 0; i <= limit; i++) {
            String a2 = a.substring(i, i + 2);
            String b2 = b.substring(i, i + 2);
            if (a2.equals(b2)) {
                count++;
            }
        }

        return count;
    }
}
