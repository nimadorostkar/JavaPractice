import java.util.Scanner;


public class Practice3 {
    public static void main(String[] args) {
        System.out.println ( "Enter the number: " );
        Scanner input = new Scanner ( System.in );
        int n = input.nextInt ();

        System.out.println("1/(n^3+n): " + 1/(Math.pow(n,3)+n) );
        System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");
    }

}
