import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.text.DecimalFormat;
/**
* The Plus Minus program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/
public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double nofp = 0;
        double nofn = 0;
        double nofz = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                nofn += 1;
            }
            if(arr[i] > 0) {
                nofp += 1;
            }
            if(arr[i] == 0){
                nofz += 1;
            }
        }
        
        System.out.format("%.6f", nofp/arr.length);
        System.out.println();
        System.out.format("%.6f", nofn/arr.length);
        System.out.println();        
        System.out.format("%.6f", nofz/arr.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);
    }
}
