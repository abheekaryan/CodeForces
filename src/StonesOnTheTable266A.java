import java.util.Scanner;

public class StonesOnTheTable266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        String input = sc.nextLine();
        char[] inpArr = input.toCharArray();
        int toReplace = 0;
        char prev = 0;
        for(char ch: inpArr){
            if(ch==prev){
                toReplace++;
            }
            prev = ch;
        }
        System.out.println(toReplace);
        sc.close();
    }
}
