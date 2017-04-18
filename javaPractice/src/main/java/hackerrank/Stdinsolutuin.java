package hackerrank;

import java.util.Scanner;

/**
 * Created by manish on 4/17/17.
 */
public class Stdinsolutuin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        System.out.println(scan.skip("\n"));
        scan.useDelimiter("\n");
        String s = scan.next();
//        s = s + scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

     }
}
