import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {

        System.out.println ( "Enter number: " );
        Scanner input = new Scanner ( System.in );
        int number = input.nextInt ();


        int reverse = 0;

        while(number != 0){
          int remainder = number % 10;
          reverse = reverse * 10 + remainder;
          number = number/10;
        }

        System.out.println ( "reverse number is: "+ reverse );



        System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");

    }
}
