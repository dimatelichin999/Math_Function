import java.util.Scanner;

public class less31 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double m = in.nextDouble();
        getFoot(a,m);

    }
    public static void getFoot(double a, double m){

        double m2 = a * 0.3048;
        if (m > m2){
            System.out.println("Більше значення в метрах");
        }
        else if (m < m2){
            System.out.println("Більше значення в футах");
        }
        else {
            System.out.println("Обидва значення одинакові");
        }
    }
}
