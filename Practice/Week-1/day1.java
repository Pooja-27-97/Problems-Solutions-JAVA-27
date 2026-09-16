import java.util.*;
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem-1
        // int n = sc.nextInt();

        // for(int i=1; i <= n; i++) {
        //     if(i % 3 == 0 && i % 5 == 0) System.out.println("Fizz-Buzz");
        //     else if(i % 3 == 0) System.out.println("Fizz");
        //     else if(i % 5 == 0 ) System.out.println("Buzz");
        //     else System.out.println(i);
        // }


        //Problem-2
        // int num = sc.nextInt();
        // int rev = 0;
        // int temp = num;

        // while (temp > 0) {
        //     int lastDigit = temp % 10;
        //     rev = rev * 10 + lastDigit;
        //     temp /= 10;
        // }

        // if(num == rev) System.out.println("Palindrome");
        // else System.out.println("Not Palindrome");


        //Problem-3
        // int num = sc.nextInt();
        // int product = 1;
        // int sum = 0;

        // while (num > 0) {
        //     int lastDigit = num % 10;
        //     product *= lastDigit;
        //     sum += lastDigit;
        //     num /= 10;
        // }
        // System.out.println("Sum: " + sum + "\tProduct: " + product + "\tDifference: " + (product - sum));


        //Problem-4
        // int num = sc.nextInt();
        // int count = 0;

        // while (num > 0) {
        //     if(num % 2 == 0) num /= 2;
        //     else num -= 1;
        //     count++;
        // }
        // System.out.println("Count: " + count);


        //Problem-5
        int num = sc.nextInt();
        int sixPlace = 0;
        int place = 1;
        int temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;
            if(lastDigit == 6) {
                sixPlace = place;
            }
            place *= 10;
            temp /= 10;
        }
        System.out.println("Max: " + (num + 3 * sixPlace));
    }
}
