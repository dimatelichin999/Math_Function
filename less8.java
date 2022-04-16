import java.util.Scanner;

public class less8 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Сторони квадрата дорівнють:");
        int a = input.nextInt();
        getSqrt(a);
    }

    public static void getSqrt(int a){
        int s = (int) Math.pow(a,3);
        System.out.println("Площа квадрата :" + s);

    }
}
