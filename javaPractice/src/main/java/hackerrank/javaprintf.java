package hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by manish on 4/17/17.
 */
public class javaprintf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            DecimalFormat myFormatter = new DecimalFormat("###");
//            System.out.format("%s15   %d", s1,x);

            System.out.printf("%-15s%03d%n",s1,x);

//            System.out.format("%03d", x);
        }
        System.out.println("================================");

    }
}
