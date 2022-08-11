import java.util.Scanner;

public class Word59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] wordArr = word.toCharArray();
        int lower = 0;
        int upper = 0;
        for (char ch: wordArr) {
            if(ch>='A' && ch<='Z'){
                upper++;
            }
            if(ch>='a' && ch<='z'){
                lower++;
            }
        }
        System.out.println(upper>lower?word.toUpperCase():word.toLowerCase());
    }
}
