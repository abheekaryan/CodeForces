import java.util.Scanner;

public class WayTooLongWords71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();sc.nextLine();
        if(times>=1 && times<=100){
            for (int j =0; j < times;j++){
                String words = sc.nextLine();
                int n = words.length();
                if(n>10){
                    char[] wordArray = words.toCharArray();
                    System.out.print(wordArray[0]);
                    System.out.print(n-2);
                    System.out.println(wordArray[n-1]);
                }
                else{
                    System.out.println(words);
                }
            }
        }
    }
}
