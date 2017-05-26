package hackerrank.datastructure.array;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

//    5 4
//1 2 3 4 5
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int rotation = scanner.nextInt();

        int[] rotatingArray = new int[arraySize] ;

        for(int i=0; i< arraySize ; i++){
            rotatingArray[i] = scanner.nextInt();
        }

        for(int i=0 ; i < rotation; i++) {
            rotateArray(rotatingArray);
        }

        for(int i=0 ; i < rotatingArray.length ; i++){
            System.out.print(rotatingArray[i] + " ");
        }
    }

    private static void rotateArray(int[] rotatingArray) {
        int arrayLength = rotatingArray.length;
        int temp = rotatingArray[0];
        for (int i=0 ; i<arrayLength-1 ; i ++) {
            rotatingArray[i] = rotatingArray[i+1];
        }
        rotatingArray[arrayLength-1] = temp;
    }
}