package observerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* The Diagonal Difference program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/

public class GradingStudents {
    
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int pDiagonals = 0;
        int sDiagonals = 0;
        int j = arr.size()-1;

        for(int i = 0; i < arr.size(); i++) {
            pDiagonals += arr.get(i).get(i);
        }

        for(int i = 0; i < arr.size(); i++) {
            sDiagonals += arr.get(i).get(j);
            j--;
        }
        
        return Math.abs(pDiagonals-sDiagonals);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0 ; i < n; i++) {
            List<Integer> row = new ArrayList<Integer>(); 
            for(int j = 0; j < n; j++) {
                row.add(in.nextInt());
            }
            arr.add(row);
        }

        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}