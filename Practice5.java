import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        System.out.println ( "refrigerator price: " );
        Scanner input = new Scanner ( System.in );
        double price = input.nextInt ();

        System.out.print ( "discount percentage: ");
        double discount = input.nextInt ();

        System.out.println("The final price by applying a discount: " + getDiscountPrice(price , discount));
        System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");
    }


    public static double getDiscountPrice(double price, double discount){
        return price - (price*discount/100);
    }


}
