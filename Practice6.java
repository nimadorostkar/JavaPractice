import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in );


        int a[][] = new int[2][5];
        for(int i=0;i<2;i++){
          for(int j=0;j<5;j++){
            System.out.println ( "(first matrice) Enter ["+(i+1)+"]["+(j+1)+"] : " );
            a[i][j] = input.nextInt ();
          }
        }



        int b[][] = new int[2][5];
        for(int i=0;i<2;i++){
          for(int j=0;j<5;j++){
            System.out.println ( "(second matrice) Enter ["+(i+1)+"]["+(j+1)+"] : " );
            b[i][j] = input.nextInt ();
          }
        }



        int c[][]=new int[2][5];


        System.out.println ( "sum of matrices: ");
        for(int i=0;i<2;i++){
          for(int j=0;j<5;j++){
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
          }
          System.out.println();
        }


        System.out.println ( "subtraction of matrices: ");
        for(int i=0;i<2;i++){
          for(int j=0;j<5;j++){
            c[i][j]=a[i][j]-b[i][j];
            System.out.print(c[i][j]+" ");
          }
          System.out.println();
        }

        System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");

    }
}
