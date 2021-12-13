import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {


      Scanner input = new Scanner ( System.in );
      String students[][] = new String[10][4];
      int gpa = 0;


      for(int i=0;i<10;i++){
        System.out.println ( "----student"+(i+1)+"-----------------------------" );

        System.out.println ( "Enter student name: " );
        students[i][0] = input.nextLine ();
        students[i][0] = input.nextLine ();

        System.out.println ( "Enter student ID: " );
        students[i][1] = input.nextLine ();

        System.out.println ( "Enter numbers of student scores: " );
        students[i][2] = input.nextLine ();


        for(int k=1;k<= Integer.parseInt(students[i][2]);k++){
          System.out.println ( "Enter score ("+k+") : " );
          int score = input.nextInt ();
          gpa += score;
        }

        students[i][3] = Integer.toString( gpa/Integer.parseInt(students[i][2]) ) ;
      }


      System.out.println ( "------results------------------------------" );
      System.out.println("Min GPD: ");
      getMinValue(students);
      System.out.println("Max GPD: ");
      getMaxValue(students);

      System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");

    }

    public static void getMaxValue(String[][] students){
        int count = 0;
        int maxValue = Integer.parseInt(students[0][3]);
        for(int i=1;i<10;i++){
            if(Integer.parseInt(students[i][3]) > maxValue){
                maxValue = Integer.parseInt(students[i][3]);
                count = i;
            }
        }
        System.out.println(" name: " + students[count][0] + " ID: " +  students[count][1] + " GPD: " +  students[count][3] );
    }

    public static void getMinValue(String[][] students){
        int count = 0;
        int MinValue = Integer.parseInt(students[0][3]);
        for(int i=1;i<10;i++){
            if(Integer.parseInt(students[i][3]) < MinValue){
                MinValue = Integer.parseInt(students[i][3]);
                count = i;
            }
        }
        System.out.println(" name: " + students[count][0] + " ID: " +  students[count][1] + " GPD: " +  students[count][3] );
    }



}
