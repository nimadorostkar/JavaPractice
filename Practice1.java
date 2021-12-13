import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println ( "input numbers quantity: " );
        Scanner input = new Scanner ( System.in );
        double n = input.nextInt ();

        double total = 0, inputUser = 0, average = 0, max = 0, min = 999;

        for (int i = 0; i < n ; i++) {
            System.out.print ( "enter number: ");
            inputUser = input.nextDouble ();
            total = inputUser + total;
            max = Math.max(max, inputUser);
            min = Math.min(min, inputUser);
        }
        average = total / n;
        System.out.println ( "Results: ");
        System.out.println ( " average: "+ average + " max: "+ max + " min: "+ min );
        System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");
    }
}
