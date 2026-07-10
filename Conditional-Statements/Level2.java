import java.util.*;
public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Power of 2
        int n = sc.nextInt();

        if (n <= 0) System.out.println("No");
        else {
            while (n % 2 == 0) {
                System.out.println(n);
                n /= 2;
            }
            if (n == 1) System.out.println("Yes");
            else System.out.println("No");
        }
        

        //
    }
}
