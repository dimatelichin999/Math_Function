import java.util.Scanner;

public class less29 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double x = in.nextInt();

        getResult(x);
    }
    public static void getResult(double x) {


        if (x >= 0) {
            double k = Math.pow(x, 2);
            if (  x < k){
               double y = Math.abs(x);
                System.out.println(y);
            }
            else if (x >= k){
                double y = x * k;
                System.out.println(y);
            }

        } else if (x < 0) {
            double k = Math.abs(x);
            if (  x < k){
                double y = Math.abs(x);
                System.out.println(y);
            }
            else if (x >= k){
                double y = x * k;
                System.out.println(y);
            }
        }


    }}
