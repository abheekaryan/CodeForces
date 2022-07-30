import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int X = 0;
        if(n>=1 && n<=150){
            for (int i = 0; i < n; i++) {
                String statement = sc.nextLine();
                if(statement.equals("X++") || statement.equals("++X")){
                    X++;
                }
                else if(statement.equals("X--") || statement.equals("--X")){
                    X--;
                }
            }
            System.out.println(X);
        }

    }
}
