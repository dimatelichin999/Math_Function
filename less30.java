import java.util.Scanner;

public class less30 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Перший катет");
        double a = in.nextInt();
        System.out.println("Другий катет");
        double b = in.nextInt();
        System.out.println("Гіпотинуза");
        double c = in.nextInt();

        getResult(a,b,c);
    }
    public static void getResult(double a , double b, double c){

        if (c <=1 ){
            double c1 = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
            System.out.println(c1);
        }
        else {
            if ( a <= 1){
                double a1 = Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
                System.out.println(a1);
            }
            else {
                if (b <= 1){
                    double b1 = Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
                    System.out.println(b1);
                }
            }
        }
    }
}
