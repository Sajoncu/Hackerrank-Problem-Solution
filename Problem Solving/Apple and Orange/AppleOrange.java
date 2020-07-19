package sajoncu

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
* The AppleOrange program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/

public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apples = 0;
        int oranges = 0;
        
        
        for(int i = 0; i < m; i++){
            int landingSpot = in.nextInt();
            
            if( a+landingSpot >= s && a+landingSpot <= t ) {
                apples += 1;
            }
        }
        
        System.out.println(apples);
        
        for(int i = 0; i < n; i++){
            int landingSpot = in.nextInt();
            if( b+landingSpot >= s && b+landingSpot <= t ) {
                oranges += 1;
            }
        }
        System.out.println(oranges);
    }
}
