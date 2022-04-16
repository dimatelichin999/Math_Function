import java.util.Scanner;

public class less19 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double a1 = input.nextDouble();
        double a2 = input.nextInt();

        double toRad = (double) Math.toRadians(a2);

        double x = toRad / a1;
        double b = (double) (Math.sqrt(Math.pow(x,2) + Math.pow(a1,2)));
        double cos = a1 / b ;
        double toDegrees = Math.toDegrees(cos);
        double toRaid1 = Math.toRadians(toDegrees);
        double y = b  / toRaid1;
        double a  = Math.sqrt(Math.pow(b,2) + Math.pow(y,2));

        double q = Math.sqrt(Math.pow(b,2) - Math.pow(a1,2));
        double e = Math.sqrt(Math.pow(a,2) - Math.pow(q,2));
        double d = (2 * e) + a1;
        double с = a;

        System.out.println(a1);
        System.out.println(a);
        System.out.println(d);
        System.out.println(с);
        System.out.println(a1+a+d+a);




    }
}
