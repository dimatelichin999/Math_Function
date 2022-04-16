public class less12 {

    public static void main(String args[] ){

        double c = 3.0;
        double b = 5.0;
        getSide(c,b);
    }

    public static void getSide(double c , double b){

        double a = (double) (Math.sqrt(Math.pow(c,2) + Math.pow(b,2)));

        System.out.println(a);
    }


}
