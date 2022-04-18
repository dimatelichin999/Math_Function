import java.util.Scanner;

import static java.lang.Math.sin;

public class less26 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        getResult(a);
    }
    public static void getResult(double a){

        if (a > 0){
            double y = (double) Math.pow(Math.sin(a),2);
            System.out.println(y);
        }
        else {
            double y = (double) 1 - (2 * Math.pow(Math.sin(a),2));
            System.out.println(y);
        }

    }
}
