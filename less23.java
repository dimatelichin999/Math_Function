import java.util.Scanner;

public class less23 {

    public static void main(String args []){

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть відстань між двома машинами");
        double l = in.nextInt();
        System.out.println("Введіть швидкість машини A");
        double c1 = in.nextInt();
        System.out.println("Введіть швидкість машини B");
        double c2 = in.nextInt();
        System.out.println("Час");
        double time = in.nextInt();

        double l1 = c1 * time / 60;
        double l2 = c2 * time / 60;
        double l3 = l - (l1 + l2);
        System.out.println("За "+ time + "хвилин поївзки . Міє автомобілями буде така відмтань:  " + l3  );
    }
}
