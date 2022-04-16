import java.util.Scanner;

class less7 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int x = input.nextInt();
        getResult(a,x);

        }
        public static void getResult(int a , int x){

       double  y1 = (Math.sqrt(2 * a + Math.sin(a) + Math.sin(Math.abs(3 * a)))) / 3.56;

       double y2 = (3.2 + Math.sqrt(1 + x )) / Math.abs(5 * x);

       System.out.println(y1);
            System.out.println(y2);
        }
    }

