import java.util.Scanner;

public class Team237A {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();sc.nextLine();
        int count = 0;
        if(times >= 1 && times<=1000){
            for (int i = 0; i < times; i++) {
                int petya = sc.nextInt();
                int vasya = sc.nextInt();
                int tonya = sc.nextInt();
                if((petya+vasya+tonya)>=2){
                    count++;
                }
            }
        }
        sc.close();
        System.out.println(count);
    }
}
