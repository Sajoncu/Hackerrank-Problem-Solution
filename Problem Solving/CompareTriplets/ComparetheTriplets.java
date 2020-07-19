import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
/**
* The ComparetheTriplets program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/
public class ComparetheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore, bScore;
        List<Integer> totalScore = new ArrayList<Integer>(); 
        aScore = 0;
        bScore = 0;

        if(a.get(0) > b.get(0)) {
            aScore += 1;
        }

        if(a.get(0) < b.get(0)) {
            bScore += 1;
        }

        if(a.get(1) < b.get(1)) {
            bScore += 1;
        }
        if(a.get(1) > b.get(1)) {
            aScore += 1;
        }

        if(a.get(2) < b.get(2)) {
            bScore += 1;
        }
        if(a.get(2) > b.get(2)) {
            aScore += 1;
        } 
        
        totalScore.add(aScore);   
        totalScore.add(bScore);     
        return totalScore;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
