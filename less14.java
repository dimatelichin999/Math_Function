import java.util.Scanner;

public class less14{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double y = input.nextInt();
        getFirst(x,y);
    }

    public static void getFirst(double x , double y){
double a = (int) ((x + ((2+y) / Math.pow(x,2)))/ y + (1 / (Math.sqrt(Math.pow(x,2)+10))));
getSecond( a,y);

    }

    public static void getSecond(double a ,  double y){

        double b = 7.25 * Math.sin(a) - y ;
        System.out.println(b);

    }
}
