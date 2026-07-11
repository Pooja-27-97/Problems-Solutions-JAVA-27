import java.util.*;
public class Level2 {
    //Happy Number
    public static int squareSum(int n) {
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            int sq = digit * digit;
            sum += sq;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Power of 2
        // int n = sc.nextInt();

        // if (n <= 0) System.out.println("No");
        // else {
        //     while (n % 2 == 0) {
        //         System.out.println(n);
        //         n /= 2;
        //     }
        //     if (n == 1) System.out.println("Yes");
        //     else System.out.println("No");
        // }
        

        //Happy Number
        // int num = sc.nextInt();
        // int slow = num;
        // int fast = num;

        // do {
        //     slow = squareSum(slow);
        //     fast = squareSum(squareSum(fast));
        // } while(slow != fast);

        // if(slow == 1) System.out.println("Happy");
        // else System.out.println("Not happy");


        //Reverse Integer
        // int num = sc.nextInt();
        // int rev = 0;

        // while(num > 0) {
        //     int lastDigit = num % 10;
        //     rev = rev * 10 + lastDigit;
        //     num /= 10;
        // }
        // System.out.println("Reverse: " + rev);


        //Largest of 3 numbers
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();

        // int result = (num1 > num2 && num1 > num3) ? num1 : ((num2 > num3) ? num2 : num3);
        // System.out.println(result);


        //Roman to Integer
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        String roman = sc.nextLine();
        
    }
}
