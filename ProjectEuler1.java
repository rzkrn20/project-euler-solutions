import java.util.Scanner;

public class ProjectEuler1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t > 100000) System.exit(0);
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            if (n > 1000000000) System.exit(0);
            n--;
            long n3 = n / 3;
            long n5 = n / 5;
            long n15 = n / 15;
            long result = 0;
            long s3 = 3 * n3 * (n3 + 1) / 2;
            long s5 = 5 * n5 * (n5 + 1) / 2;
            long s15 = 15 * n15 * (n15 + 1) / 2;
            result = s3 + s5 - (s15);
            System.out.println(result);
        }
    }
}
