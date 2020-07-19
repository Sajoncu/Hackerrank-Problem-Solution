
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* The Grading Students program (Hackerrank)
* @author  Saiful Islam Sajon
* @version 1.0
* @since   2020-07-19 
*/

class GradingStudent {


    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> roundedGrade = new ArrayList<Integer>();

        for(int i = 0; i < grades.size(); i++) {
            if(grades.get(i) < 38) {
                roundedGrade.add(grades.get(i));
            } else {
                int rounded = grades.get(i) + ((5-(grades.get(i) % 5)) % 5);
                if((rounded - grades.get(i)) < 3) {
                    roundedGrade.add(rounded);
                } else {
                    roundedGrade.add(grades.get(i));
                }
            }
        }
        return roundedGrade;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> grades = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++) {
            grades.add(in.nextInt());
        }
        List<Integer> result= gradingStudents(grades);
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

}