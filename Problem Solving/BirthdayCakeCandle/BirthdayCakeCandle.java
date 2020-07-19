import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
* The BirthdayCakeCandle program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/
public class BirthdayCakeCandle {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        // 3 2 1 3
        int maxHeight=0, numMaxHeight=1;
        for(int i=0; i<ar.length; i++) {
            if(maxHeight<ar[i]) {
                maxHeight=ar[i];
                numMaxHeight=1;
            }else if(maxHeight==ar[i]) {
                numMaxHeight++;
            }
        }
        return numMaxHeight;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int arCount = scanner.nextInt();
        int[] candles = new int[arCount];
        
        for(int i=0; i < n; i++){
            candles[i] = in.nextInt();
        }

        int result = birthdayCakeCandles(candles);

        System.out.println(result);
    }
}
