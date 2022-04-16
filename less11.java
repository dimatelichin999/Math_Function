
import java.util.Scanner;

public class less11 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть числа");
        int x = input.nextInt();
        int y = input.nextInt();
        getAverageNumber(x,y);
    }

    public static void getAverageNumber(int x , int y){

        int y1 = (x + y) / 2;

        int y2 = (int) Math.pow(x*y, 1/3);

        System.out.println(y1);
        System.out.println(y2);
    }
}
