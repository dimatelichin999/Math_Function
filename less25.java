import java.util.Scanner;

public class less25 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b ){
            System.out.println("Число " + a + "є більшим " );
        }
        else if (a < b){
            System.out.println("Число " + b + "є більшим " );
        }
        else {
            System.out.println("Два числоє одинаковими " );
        }
    }
}
