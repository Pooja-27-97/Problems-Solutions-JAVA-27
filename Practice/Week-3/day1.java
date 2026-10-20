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

    public static int countToZero(int num) {
        int count = 0;
        while(num > 0) {
            if(num % 2 ==  0) {
                num /= 2;
                count++;
            } else {
                num-=1;
                count++;
            }
        }
        return count;
    }

    public static int findSixPlace(int num) {
        int sixPlace = 0;
        int isPlace = 1;
        while(num > 0) {
            int lastDigit = num % 10;
            if(lastDigit == 6) sixPlace = isPlace;
            num /= 10;
            isPlace *= 10;
        }
        return sixPlace;
    }

    public static void maxSixNine(int num) {
        int sixPlace = findSixPlace(num);
        System.out.println(num + (3 * sixPlace));
    }

    public static void nextFiveMultiple(int num) {
        int diff = 5 - (num % 5);
        if(diff < 3) System.out.println(num + diff);
        else System.out.println(num);
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
        // int num = sc.nextInt();
        // System.out.println(countToZero(num));


        //Problem-4
        // int num = sc.nextInt();
        // maxSixNine(num);


        //Problem-5
        // int grade = sc.nextInt();

        // if(grade < 38) System.out.println(grade);
        // else if(grade >= 38 && grade <= 100) nextFiveMultiple(grade);
        // else System.out.println("Invalid");


        //Problem-6
        int[] arr = new int[4];
        for(int i=0; i < arr.length; i++) arr[i] = sc.nextInt();
        
        for(int i=1; i < arr.length; i++) arr[i] = arr[i] + arr[i-1];
        for(int i=0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
