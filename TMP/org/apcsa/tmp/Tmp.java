package org.apcsa.tmp;

public class Tmp {

    /**
     * Recursively return the total number of "ears" in the bunny line 1..n.
     * Odd bunnies (1, 3, 5, ...) have 2 ears.
     * Even bunnies (2, 4, 6, ...) have 3 ears.
     */
    public static int bunnyEars2(int bunnies) {
        // Base case: no bunnies, no ears
        if (bunnies == 0){
            return 0;
        }
    
        // Recursive case:
        // Only handle the current bunny (let recursion calculate n-1)
        if(bunnies % 2 == 1){// if odd
            return 2 + bunnyEars2(bunnies-1);
        } else{
            return 3 + bunnyEars2(bunnies-1);
        }
    }

     
    public static void main(String[] args) {
        // Provided examples
        System.out.println("bunnyEars2(0) -> " + bunnyEars2(0) + " (expected: 0)");
        System.out.println("bunnyEars2(1) -> " + bunnyEars2(1) + " (expected: 2)");
        System.out.println("bunnyEars2(3) -> " + bunnyEars2(3) + " (expected: 7)");
        System.out.println("bunnyEars2(4) -> " + bunnyEars2(4) + " (expected: 10)");
        // 1st  = 2 
        // 2nd = 3
        // 3rd = 2
        System.out.println("bunnyEars2(1000) -> " + bunnyEars2(10000) + " (expected: ??)");
    }
}
