import java.util.Scanner;
import static java.lang.Math.*;

public class less2 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double x = input.nextInt();

        double y1 = (3*pow(Math.sin(x),5)-Math.PI*Math.exp(x))/ (2 + Math.sqrt(Math.abs(x))+ 1);


        System.out.println("y від а =" + y1);
    }
}
