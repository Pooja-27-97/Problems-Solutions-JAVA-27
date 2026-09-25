import java.util.*;
public class day2 {
    public static int fruitCount(int fruit, int start, int end, int distCount, Scanner sc) {
        int count = 0;

        for(int i=1; i <= distCount; i++) {
            int dist = sc.nextInt();
            int pos = dist + fruit;
            if(pos >= start && pos <= end) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem-19
        // int grade = sc.nextInt();

        // if(grade < 38 && grade >= 0) {
        //     System.out.println(grade);
        // } else if (grade >= 38 && grade <= 100) {
        //     if(grade % 5 == 3) System.out.println(grade + 2);
        //     else if(grade % 5 == 4) System.out.println(grade  + 1);
        //     else System.out.println(grade);
        // } else System.out.println("Out of range");

        // int diff = 5 - (grade % 5);
        // if(grade < 38 && grade >= 0) {
        //     System.out.println(grade);
        // } else if(grade >= 38 && grade <= 100) {
        //     if(diff < 3) System.out.println(grade + diff);
        //     else System.out.println(grade);
        // } else System.out.println("Out of range");


        //Problem-20
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // int apple = sc.nextInt();
        // int m = sc.nextInt();
        // int orange = sc.nextInt();
        // int n = sc.nextInt();

        // int appleCount = fruitCount(apple, start, end, m, sc);
        // int orangeCount = fruitCount(orange, start, end, n, sc);


        // System.out.println("Apple count: " + appleCount);
        // System.out.println("Orange count: " + orangeCount);


        //Problem-21
        // int k1 = sc.nextInt();
        // int k2 = sc.nextInt();
        // int s1 = sc.nextInt();
        // int s2 = sc.nextInt();

        // if(s1 <= s2) {
        //     System.out.println("Never meet");
        // } else {
        //     if(((k2-k1) % (s1-s2) == 0) && ((k2-k1) / (s1-s2) >= 0)) System.out.println("They meet after " + (k2-k1) / (s1-s2) + " jumps");
        //     else System.out.println("Never meet");
        // }
    }
}