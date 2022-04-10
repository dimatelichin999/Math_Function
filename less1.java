import java.util.Scanner;

import static java.lang.Math.pow;

public class less1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int v = input.nextInt();
        printThis(a,b,c,v);

    }
    public static void printThis(int a, int b, int c, int v){

        double y1  = (3*pow(Math.sin(a),5)-Math.PI*Math.exp(a))/ (2 + Math.sqrt(Math.abs(a))+ 1);
        System.out.println("y від а =" + y1);

        double y2 = (3*pow(Math.sin(b),5)-Math.PI*Math.exp(b))/ (2 + Math.sqrt(Math.abs(b))+ 1);
        System.out.println("y від b =" + y2);

        double y3 = (3*pow(Math.sin(c),5)-Math.PI*Math.exp(c))/ (2 + Math.sqrt(Math.abs(c))+ 1);
        System.out.println("y від c =" + y3);

        double y4 = (3*pow(Math.sin(v),5)-Math.PI*Math.exp(c))/ (2 + Math.sqrt(Math.abs(c))+ 1);
        System.out.println("y від v =" + y4);


    }
}
