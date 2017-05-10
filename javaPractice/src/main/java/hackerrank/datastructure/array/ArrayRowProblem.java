package hackerrank.datastructure.array;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by manish on 5/8/17.
 */
public class ArrayRowProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numberOfElements = scan.nextInt();
        int[] intArray = new int[numberOfElements];
        for(int i=0; i< numberOfElements; i++){
            intArray[i] = scan.nextInt();
        }
        scan.close();

        for (int i = numberOfElements-1; i>=0  ; i--){
            System.out.print(intArray[i]);
            System.out.print(" ");
        }
    }
}
