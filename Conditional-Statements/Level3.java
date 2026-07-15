import java.util.*;
public interface Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Odd count in range
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // int count = 0;

        // for(int i=start; i <= end; i++) {
        //     if(i % 2 != 0) count++;
        // }
        // System.out.println(count);


        //Count operations
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int count = 0;

        // if(num1 == 0 || num2 == 0) System.out.println(count);
        // else if(num1 == num2) System.out.println(1);
        // else {
        //     while(num1 > 0 && num2 > 0) {
        //         if(num1 > num2) num1 -= num2;
        //         else num2 -= num1;
        //         count++;
        //     }
        //     System.out.println(count);
        // }


        //Java Datatypes
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {

                long num = sc.nextLong();

                System.out.println(num + " can be fitted in:");

                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                    System.out.println("* short");

                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                    System.out.println("* int");

                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)
                    System.out.println("* long");

            } catch (Exception e) {

                String num = sc.next();

                System.out.println(num + " can't be fitted anywhere.");
            }
        }

    }
}
