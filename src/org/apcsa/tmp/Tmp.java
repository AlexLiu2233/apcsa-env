public class Tmp {

    /*
     * We have an array of heights, representing the altitude along a walking trail.
     * Given start/end indexes into the array, return the number of "big" steps
     * for a walk starting at the start index and ending at the end index.
     * We'll say that a step is big if it is 5 or more up or down.
     * The start and end index will both be valid indexes into the array
     * with start <= end.
     */
    public static int bigHeights(int[] heights, int start, int end) {
       
        int bigSteps = 0;
        for (int i = start; i < end; i++){   
            int diff = Math.abs(heights[i] - heights[i+1]);
            if(diff >= 5){
                bigSteps++;
            }
        }
        return bigSteps;
    }

    // Helper to print arrays nicely
    private static String arrayToString(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(a[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] h1 = {5, 3, 6, 7, 2};
        int[] h2 = {5, 0, 6, 1 , 7, 2};

        System.out.println("bigHeights(" + arrayToString(h1) + ", 2, 4) = " + bigHeights(h1, 2, 4)); // 1
        System.out.println("bigHeights(" + arrayToString(h1) + ", 0, 5) = " + bigHeights(h2, 0, 5)); // 2
    }
}