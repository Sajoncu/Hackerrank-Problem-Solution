import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/**
* The Sample-Array-Sum program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/

public class SampleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum  = 0;
        for(int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arCount = scanner.nextInt();

        int[] ar = new int[arCount];

        for (int arItr = 0; arItr < arCount; arItr++) {
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);
        System.out.println(result);
    }
}