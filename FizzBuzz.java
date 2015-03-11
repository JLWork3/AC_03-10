package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/10/15
 * Acesscode2.1
 * J.Vidals
 * FizzBuzz
 * Task: Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz instead of the number
 * and for the multiples of five print "Buzz". For the numbers which are multiples of both three and five print"Fizzbuzz".
 */
public class FizzBuzz {

    public static void main(String[] args) {

        String fizz;
        String buzz;


        for (int i = 1; i <= 100; i++) {

            if ( i % 5==0 && i % 3==0) {     //this line gets executed first this is the exception
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {        // this line gets executed second
                System.out.println("Buzz");
            } else if (i % 3 == 0)         // this line gets executed third
                System.out.println("Fizz");
            else {
                System.out.println(i); // this line prints when it does not meet the exception
            }

        }
    }

}


