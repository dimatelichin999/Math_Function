import java.util.Scanner;

public class less22 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть відстань між двома машинами");
        double l = in.nextInt();
        System.out.println("Введіть швидкість машини A");
        double c1 = in.nextInt();
        System.out.println("Введіть швидкість машини B");
        double c2 = in.nextInt();

        double al = l / 2 ;
        double tA = al * 60 / c1;
        double tB = al * 60 / c2;

        double lA = (tA + tB) / 2;
        System.out.println("Два авто зустрінуться через " + (lA / 60) + "годин");

        double l1 = (lA * c1 / 60) ;
        double l2 = lA * c2 / 60 ;





    }

}
