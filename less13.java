public class less13 {

    public static void main(String args[]){

        int r = 2;
        int a  = 3;
        getArea(r,a);

    }

    public static void getArea(int r , int a ){
        double s = (int) (Math.PI * (Math.pow(r,2)-Math.pow(a,2)));
        System.out.println(s);
    }

}
