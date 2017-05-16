package hackerrank.datastructure.array;

import java.util.Scanner;

/**
 * Created by mb00549 on 5/11/2017.
 */
public class GlassHourArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] glasshourArray = new int[6][6];
        int highTotal = 0;
        for(int i=0; i<6; i++){
            for(int j = 0 ; j<6; j++){
                glasshourArray[i][j] = scanner.nextInt();
            }

        }

        for(int i =0 ; i<=3; i++){
            for(int j = 0; j<=3; j++){
                System.out.println(glasshourArray[i][j]+","+glasshourArray[i][j+1]+","+glasshourArray[i][j+2] +","+glasshourArray[i+1][j+1] +","+glasshourArray[i+2][j]+","+glasshourArray[i+2][j+1] +","+glasshourArray[i+2][j+2]);
                int glassHourTotal = glasshourArray[i][j]+glasshourArray[i][j+1]+glasshourArray[i][j+2] + glasshourArray[i+1][j+1] +glasshourArray[i+2][j]+glasshourArray[i+2][j+1]+glasshourArray[i+2][j+2];
                System.out.println(glassHourTotal);
                if(highTotal < glassHourTotal){
                    highTotal = glassHourTotal;
                }
            }
        }
        System.out.println("highTotal - " + highTotal);
    }

}