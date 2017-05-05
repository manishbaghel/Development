package hackerrank.thirtydays;
import java.util.*;


public class Arithmetic {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0 ;i<=10 ; i++){

            System.out.println(n +" * " + i +" = "+ n*i);
        }
    }

/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double dinnerCost = mealCost + ((mealCost * tipPercent)/100) + ((mealCost * taxPercent)/100);
        int totalCost = (int) (Math.round(dinnerCost));
        System.out.println("The total meal cost is "+ totalCost + " dollars.");
        // Print your result
    }*/

/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n>=2 &&  n<=5){
                ans = "Not Weird" ;
            }
            if(n>=6 &&  n<=20){
                ans = "Weird" ;
            }else{
                ans = "Not Weird";
            }
            // Complete the code
        }
        System.out.println(ans);
    }*/
}