import java.util.Scanner;

public class less15 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double y = input.nextInt();
        getFirst( x,y);
    }

    public static void getFirst(double x , double y){

        double a = (int) (((2 / (Math.pow(x,2)+25))+y))/(Math.sqrt(y) + (x + y ) / 2);
        double b = (int) ((Math.abs(x)+ 2 * Math.sin(y))  /  (5.5 * x));
        System.out.println(a);
        System.out.println(b);

    }


}
