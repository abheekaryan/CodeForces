import java.util.Scanner;

public class MaximumGCD1370A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            int find = findGCD(num);
        }
    }

    private static int findGCD(int num) {
        int MAX = 1;

        //findGCD(num-1)
        // FIXME: 8/12/22
        return 0;
    }
}
