public class less21 {

    public static void main(String args[]){

        double mon = 599.99;
        double sys = 3000.00;
        double key = 1009.59;
        double mouse = 100;

        getPriceComputer(mon,sys,key,mouse);


    }


    public static void getPriceComputer( double mon, double sys, double key, double mouse){

        double price = mon + sys + key + mouse;

        double priceOfThree = price * 3;

        System.out.println(priceOfThree);
    }



}
