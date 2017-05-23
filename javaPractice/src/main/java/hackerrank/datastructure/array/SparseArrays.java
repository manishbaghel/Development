package hackerrank.datastructure.array;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by manish on 5/16/17.
 */

/*
* Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output

2
1
0
*/
public class SparseArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfStrings = scanner.nextInt();
        String[] inputStringArray = new String[noOfStrings];

        for (int i = 0; i < noOfStrings; i++) {
            inputStringArray[i] = scanner.next();
        }

        int noOfQueries = scanner.nextInt();

        int[] finalCountArray = new int[noOfQueries];
        for (int i = 0; i < noOfQueries; i++) {
            int count = 0;
            String query = scanner.next();
            for(int j = 0 ; j < noOfStrings ; j++){
                if(query.equalsIgnoreCase(inputStringArray[j])){
                    count ++;
                }
            }
            finalCountArray[i] = count;
        }

        for (int i = 0; i < noOfQueries; i++) {
            System.out.println(finalCountArray[i]);
        }
    }

}
