import java.util.Scanner;

public class less35 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        double ab = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) );
        double bc = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2) );
        double ac = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2) );

        double bd = ac;
        System.out.println("Сторона BD:" + bd);
        double xf = bd;
        System.out.println("Сторона XF:" + xf);
        double yb = ab / (Math.sqrt(3) / 2);
        System.out.println("Сторона YB:" + yb);
        double yx = yb;
        System.out.println("Сторона YX:" + yx);
        double de = yb;
        System.out.println("Сторона DE:" + de);
        double ef = yb;
        System.out.println("Сторона : EF" + ef);


    }
}
