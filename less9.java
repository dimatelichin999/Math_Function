import java.util.Scanner;

public class less9 {
    public static void main(String args[]){

        Scanner input =  new Scanner(System.in);
        System.out.println("Введіть довжину сторони:");
        int a = input.nextInt();
        getArea(a);
        getVolume(a);
    }

    public static void getVolume(int a){
        int y = (int) (Math.pow(a,3));
        System.out.println("Обєм куба дорівнює" + y);
    }
    public static void getArea(int a){
        int y = (int) (6 * (Math.pow(a,2)));
        System.out.println("Площа бічної поверхні дорівнює" + y);
    }
}
