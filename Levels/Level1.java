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
        // int n = sc.nextInt();
        // int temp = n;
        // int place = 1;
        // int sixPlace = 0;

        // while (temp > 0) {
        //     int digit = temp % 10;
        //     if (digit == 6) {
        //         sixPlace = place;
        //     }
        //     place *= 10;
        //     temp /= 10;
        // }

        // if (sixPlace != 0) {
        //     n = n + 3 * sixPlace;
        // }
        // System.out.println(n);


        //Minimum 27 number
        // int n = sc.nextInt();
        // int temp = n;
        // int ninePlace = 0;
        // int place = 1;

        // while(temp > 0) {
        //     int digit = temp % 10;
        //     if(digit == 7) ninePlace = place;
        //     place *= 10;
        //     temp /= 10;
        // }
        // if(ninePlace != 0) n = n - (5 * ninePlace);
        // System.out.println(n);


        //Print 2 integers sum
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int sum = num1 + num2;
        // System.out.println("Sum: " + sum);


        //Compare triplets
        // int a1 = sc.nextInt();
        // int a2 = sc.nextInt();
        // int a3 = sc.nextInt();
        // int anya = 0;

        // int b1 = sc.nextInt();
        // int b2 = sc.nextInt();
        // int b3 = sc.nextInt();
        // int bond = 0;

        // if(a1 > b1) anya++;
        // else if(b1 > a1) bond++;

        // if(a2 > b2) anya++;
        // else if(b2 > a2) bond++;

        // if(a3 > b3) anya++;
        // else if(b3 > a3) bond++;

        // System.out.println("Anya: " + anya);
        // System.out.println("Bond: " + bond);


        //Odd or Even
        // int n = sc.nextInt();

        // if(n % 2 == 0) System.out.println("Even");
        // else System.out.println("Odd");


        //Positive or Negative or Zero
        // int n = sc.nextInt();

        // if(n == 0) System.out.println("Zero");
        // else if(n > 0) System.out.println("Positive");
        // else System.out.println("Negative");


        //Swap 2 integers
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        //case-1 with temp
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a + " , " + b);

        //case-2 without temp
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println(a + " , " + b);


        //Area of a circle
        // double radius = sc.nextDouble();
        // double pi = 3.142;
        // double area = pi * radius * radius;
        // System.out.println("Area: " + area);


        //Leap year
        // int year = sc.nextInt();

        // if(year % 4 == 0) {
        //     if(year % 100 == 0) {
        //         if(year % 400 == 0) System.out.println("Leap Year"); 
        //         else System.out.println("Not a leap year");    
        //     } else System.out.println("Leap year");
        // } else System.out.println("Not a leap year");
    }
}