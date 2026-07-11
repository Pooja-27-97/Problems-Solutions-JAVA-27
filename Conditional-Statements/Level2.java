import java.util.*;
public class Level2 {
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
        int num = sc.nextInt();
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;
            int square = digit * digit;
            sum = sum + square;
            num = num / 10;
            if(sum == 1) break;
            if(num == 0) {
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
        // if(sum == 1) System.out.println("Happy");
        // else System.out.println("Not happy");
    }
}
