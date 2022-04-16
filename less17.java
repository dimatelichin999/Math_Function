import java.util.Scanner;

public class less17 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        getAverage(a,b);
    }

    public static void getAverage(int a, int b){

        double a1 = Math.abs((a + b) / 2);

        double a2 = Math.abs(Math.pow(a * b , 1/3));

        System.out.println(a1);
        System.out.println(a2);
    }
}

