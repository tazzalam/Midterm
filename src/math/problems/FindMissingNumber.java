package math.problems;
import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("Missing number is: " + helper(array));
    }
    public static int helper(int array[]){
        int n = 10;
        int total= n*(n+1)/2;
        int total1=0;
        for (int t=0;t<array.length;t++) {
            total1 += array[t];
        }
        int helper = total -total1;
        return helper;

            }

        }



