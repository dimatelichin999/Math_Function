import java.util.Scanner;

class less6 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int a = input.nextInt();

        printForm(x);
        printForms(a);
    }

    public static void printForm(int x) {
        double y = 17 * Math.pow(x,2) - 6 * x + 13;
System.out.println("y від x = " + y);
    }
    public static void printForms(int a) {
        double y = 3 * Math.pow(a,2) + 5 * a - 21;
        System.out.println("y від a = " + a);
    }
}
