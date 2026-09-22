import java.util.*;
public class day1 {
    public static int intValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // //Problem-16
        // int num = sc.nextInt();
        // int rev = 0;

        // while(num > 0) {
        //     int lastDigit = num % 10;
        //     rev = rev * 10 + lastDigit;
        //     num /= 10;
        // }
        // System.out.println("Reverse: " + rev);


        //Problem-17
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();

        // // if(n1 > n2 && n1 > n3) System.out.println(n1);
        // // else if(n2 > n3) System.out.println(n2);
        // // else System.out.println(n3);

        // int result = (n1 > n2 && n1 > n3)? n1 : ((n2 > n3)? n2 : n3);
        // System.out.println(result);


        //Problem-18
        String roman = sc.nextLine();
        int sum = 0;

        for(int i=0; i < roman.length(); i++) {
            int curr = intValue(roman.charAt(i));
            if(i < roman.length()-1) {
                int next = intValue(roman.charAt(i+1));
                if(curr < next) sum -= curr;
                else sum += curr;
            } else sum += curr;
        }
        System.out.println(sum);
    }
}