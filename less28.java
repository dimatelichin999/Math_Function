import java.util.Scanner;

public class less28 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        getResult(a,b);
    }
    public static void getResult(double a, double b){

        if (a < b ){
            double y = a * b;
            System.out.println(y);
        }
        else if ( a >= b ){
            double y = a + b;
            System.out.println(y);
        }
    }
}
