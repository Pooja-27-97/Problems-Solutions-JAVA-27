import java.util.*;
public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Fizz-Buzz
        // int n = sc.nextInt();
        // for(int i=1; i <= n; i++) {
        //     if(i % 3 == 0 && i % 5 == 0) System.out.println("Fizz-Buzz");
        //     else if(i % 3 == 0) System.out.println("Fizz");
        //     else if(i % 5 == 0) System.out.println("Buzz");
        //     else System.out.println(i);
        // }


        //Check Palindrome
        // int og = sc.nextInt();
        // int original = og;
        // int rev = 0;

        // while (og > 0) {
        //     int lastDigit = og % 10;
        //     rev = rev * 10 + lastDigit;
        //     og /= 10;
        // }
        // if(original == rev) System.out.println("Palindrome");
        // else System.out.println("Not Palindrome");


        //Product and sum of digits
        // int n = sc.nextInt();
        // int prod = 1, sum = 0;

        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     prod *= lastDigit;
        //     sum += lastDigit;
        //     n /= 10;
        // }
        // System.out.println("Product: " + prod);
        // System.out.println("Sum: " + sum);
        // System.out.println("Difference: " + (prod - sum));


        //No. of steps n -> 0
        // int n = sc.nextInt();
        // int count = 0;

        // while(n > 0) {
        //     if(n % 2 == 0) {
        //         n /= 2;
        //         count++;
        //     } else {
        //         n -= 1;
        //         count++;
        //     }
        // }
        // System.out.println("Counts: " + count);


        //Maximum 69 number
        int n = sc.nextInt();

        int temp = n;
        int place = 1;
        int sixPlace = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 6) {
                sixPlace = place;
            }

            place *= 10;
            temp /= 10;
        }

        if (sixPlace != 0) {
            n = n + 3 * sixPlace;
        }

        System.out.println(n);
    }
}