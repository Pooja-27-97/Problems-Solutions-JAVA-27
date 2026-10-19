import java.util.*;
public class day1 {
    public static int reverseNumber(int num) {
        int rev = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }
        return rev;
    }

    public static void checkPalindrome(int num, int rev) {
        if(num == rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    public static int prodMinusSum(int num) {
        int sum = 0;
        int prod = 1;

        while(num > 0) {
            int lastDigit = num % 10;
            prod *= lastDigit;
            sum += lastDigit;
            num /= 10;
        }
        return prod - sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem-1
        // int num = sc.nextInt();
        // int rev = reverseNumber(num);
        // checkPalindrome(num, rev);

        
        //Problem-2
        // int num = sc.nextInt();
        // int diff = prodMinusSum(num);
        // System.out.println(diff);


        //Problem-3
        
    }
}
