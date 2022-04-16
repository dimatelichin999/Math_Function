import java.util.Scanner;
import java.lang.Math;

public class less10 {

    public static void main(String args []){

        Scanner input = new Scanner(System.in);
        System.out.println("Ваедіть змінні:");
        int x = input.nextInt();
        int y = input.nextInt();
        getFirstEquation(x,y);
        getSecondEquation(x,y);

    }








    public static void getFirstEquation(int x , int y){
        double q = (int) ((2 * Math.pow(x,3)) - (3.44*x*y) + (2.3 * Math.pow(x,2)) - (7.1 * y) + 2);
        System.out.println(q);
    }

    public static void getSecondEquation(int x, int y){
        double q = (int) (3.14 * Math.pow(x+y,3) + (2.75*Math.pow(x,2)) - (2.7 * x) - 4.1);
        System.out.println(q);
    }
}
