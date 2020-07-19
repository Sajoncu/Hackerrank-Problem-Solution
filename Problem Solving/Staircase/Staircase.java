import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
* The Staircase program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/
public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        int k = 1;
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int p = 1; p <= k; p++) {
                System.out.print("#");
            }
            k++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        staircase(n);
    }
}
