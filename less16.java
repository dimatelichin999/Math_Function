public class less16 {

    public static void main(String args[]){

        double e = 1;
        double h = 2;
        getNumber(e,h);

    }

    public static void getNumber(double e, double h){

        double b = (int) (Math.sin(e) + Math.pow(Math.cos(h),2));
        System.out.println(b);
    }
}

