import java.util.Scanner;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println ( "Enter the number of elements you want to store: " );
        Scanner input = new Scanner ( System.in );
        int n = input.nextInt ();

        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.print ( "enter the element: ");
            array[i] = input.nextInt ();
        }

        System.out.println("your input array: " + Arrays.toString(array) );
        System.out.println("Min Value: " + getMinValue(array));
        System.out.println("Max Value: " + getMaxValue(array));
        System.out.println("Average Value: " + getAvrValue(array));
        System.out.println ( "-------------------- github.com/nimadorostkar/JavaPractice -- ");
    }


    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int getAvrValue(int[] array){
        int avrValue = 0;
        for(int i=0;i<array.length;i++){
          avrValue += array[i];
        }
        return avrValue/array.length;
    }




}
