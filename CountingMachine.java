package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/10/15.
 * /* Accesscode 2.1
 March 10th 2015
 J,Vidals
 Task: Write a program that gets an integer from the user. Count from 0 to that number. User a for loops to do it.
 */

import java.util.Scanner;
public class CountingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Count to: ");
        int max =input.nextInt();

        for (int i=0; i <=max; i++) {
            System.out.println(i + " ");
        }


    }
}