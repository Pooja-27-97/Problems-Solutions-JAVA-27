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

    //Roman to Integer
    public static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    //Apple and oranges
    public static int fallCount(int s, int t, int friut, int values, Scanner sc) {
        int count = 0;
        for(int i=0; i < values; i++) {
            int pos = friut + sc.nextInt();
            if(pos >= s && pos <= t) count++;
        }
        return count;
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
        // String roman = sc.nextLine();
        // int sum = 0;
        
        // for(int i=0; i < roman.length(); i++) {
        //     int curr = value(roman.charAt(i));
        //     if(i < roman.length() - 1) {
        //         int next = value(roman.charAt(i + 1));
        //         if(curr < next) sum -= curr;
        //         else sum += curr;
        //     } else {
        //         sum += curr;
        //     }
        // }
        // System.out.println("Value: " + sum);


        //Grading Students
        // int n = sc.nextInt();
        // for(int i=0; i < n; i++) {
        //     int grade = sc.nextInt();
        //     int diff = 5 - (grade % 5);

        //     if(grade >= 0 && grade <= 100) {
        //         if (grade >= 38 && diff < 3) System.out.println(grade + diff);
        //         else System.out.println(grade);
        //     } else System.out.println("Out of range");
        // }


        //Apples and Oranges
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // int apple = sc.nextInt();
        // int orange = sc.nextInt();
        // int m = sc.nextInt();
        // int n = sc.nextInt();

        // int appleCount = fallCount(start, end, apple, m, sc);
        // int orangeCount = fallCount(start, end, orange, n, sc);

        // System.out.println(appleCount);
        // System.out.println(orangeCount);


        //Kangaroo
        // int x1 = sc.nextInt();
        // int v1 = sc.nextInt();
        // int x2 = sc.nextInt();
        // int v2 = sc.nextInt();

        // if(v1 <= v2) System.out.println("No");
        // else {
        //     if((x2 - x1) % (v1 - v2) == 0) {
        //         System.out.println("Yes");
        //         int n = (x2 - x1) / (v1 - v2);
        //         System.out.println("They meet at " + n);
        //     } else System.out.println("No");
        // }


        //Triangle Validity
        // int s1 = sc.nextInt();
        // int s2 = sc.nextInt();
        // int s3 = sc.nextInt();

        // if((s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1) System.out.println("Valid");
        // else System.out.println("Invalid");
    }
}
