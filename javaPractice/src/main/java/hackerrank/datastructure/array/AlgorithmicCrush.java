package hackerrank.datastructure.array;

import java.util.Scanner;

/**
 *
 5 3
 1 2 100
 2 5 100
 3 4 100
 Sample Output

 10000000 5
 1 2 1000000000
 2 5 1000000000
 3 4 1000000000
 2 5 1000000000
 3 4 1000000000

 200
 Explanation

 3<=N<=10**7
 1<=M<=2*10**5
 1<=a<=b<=N
 0<=k<=10**9

 After first update list will be 100 100 0 0 0.
 After second update list will be 100 200 100 100 100.
 After third update list will be 100 200 200 200 100.
 So the required answer will be 200.
 */
public class AlgorithmicCrush {

    public static void main(String[] args) {

//        System.out.println("1000000 200000");
//        for (int out =0 ; out < 1 ; out ++){
//            System.out.println("2 5 1000000000");
//        }
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int operationCount = scanner.nextInt();

        Operent[] operents = new Operent[operationCount];
        for (int j = 0; j < operationCount; j++) {

            operents[j] = new Operent(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        long max = getMax(operents, arrayLength);
        System.out.println(max);

    }

    private static long getMax(Operent[] operents, int arrayLength) {

        long[] crushArray = new long[arrayLength+1];

        for (int i = 0; i <= arrayLength; i++) {
            crushArray[i] = 0;
        }

        for (int i = 0; i < operents.length; i++) {
            Operent operent = operents[i];

            crushArray[operent.from-1] += operent.operand;
            crushArray[operent.to] -= operent.operand;
        }


        long max = crushArray[0];
        long sum = max;
        for (int i = 1; i < arrayLength; i++) {
            sum += crushArray[i];
            if(sum > max){
                max = sum;
            }
        }
        return  max;
    }
}

class Operent {
    int to ;
    int from ;
    int operand;
    public  Operent(int from, int to,  int operand){
        this.to = to;
        this.from = from;
        this.operand = operand;
    }
}