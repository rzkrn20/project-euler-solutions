import java.util.Scanner;

public class ProjectEuler2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            long sum = 2;
            long a = 2;
            long temp = 0;
            while (a < n) {
                long b = (a * 4) + temp;
                temp = a;
                a = b;
                if (a > n) break;
                sum += a;
            }
            System.out.println(sum);
        }
    }
}
