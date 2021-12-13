import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println ( "input your working hours: " );
        Scanner input = new Scanner ( System.in );
        double hours = input.nextInt ();

        System.out.print ( "your hourly salary: ");
        double salary = input.nextInt ();

        double totalSalary = hours * salary ;
        double taxSalary = totalSalary-(totalSalary*0.2) ;


        System.out.println ( "Total salary: "+ totalSalary  );
        System.out.println ( "Total salary including 20% taxes: "+ taxSalary );
        System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");
    }
}
