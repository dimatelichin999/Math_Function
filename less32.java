import java.util.Scanner;

public class less32 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Радіус круга");
        double a = in.nextDouble();
        System.out.println("Сторона квадрата");
        double b = in.nextDouble();

        double sR = Math.PI  * Math.pow(a,2);

        double sS  = Math.pow(b,2);

        if (sR > sS){
            System.out.println("Площа круга більша за пл.квадрата");
        }
        else if (sR > sS){
            System.out.println("Площа квадрата більша за пл.круга");
        }
        else {
            System.out.println("Обидві площі одинакові");
        }
    }
}
