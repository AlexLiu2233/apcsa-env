package org.apcsa;

import org.apcsa.shared.ConsoleUtils;

public class TestRunner {
    public static void main(String[] args) {
        ConsoleUtils.title("Simple Test Runner");
        // Add simple assertions here; no external dependencies.
        ConsoleUtils.assertEquals(4, 2 + 2, "2 + 2 should equal 4");
    }
}
