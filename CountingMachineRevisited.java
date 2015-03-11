package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/10/15.
 * /* Accesscode 2.1
 March 10th 2015
 J,Vidals
 *Task Write a program that gets three integers from the user,Count from the first number to the second number in
 * increments of the third number. Use a for loop to do it.
 */

import java.util.Scanner;
public class CountingMachineRevisited {

    public static void main (String[] args){

        int start;
        int max;
        int increment;


        Scanner input= new Scanner(System.in);

        System.out.println("Count from: ");
        start=input.nextInt();
        System.out.println("Count to: " );
        max=input.nextInt();
        System.out.println("Count by:  ");
        increment=input.nextInt();



        for (int i= start; i <= max; i += increment) {
            System.out.println( i + " ");
        }

    }
}
