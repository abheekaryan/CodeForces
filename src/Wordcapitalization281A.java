import java.util.Scanner;

public class Wordcapitalization281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] charArr = word.toCharArray();
        charArr[0] = Character.toTitleCase(charArr[0]);
        System.out.print(charArr[0]);
        for (int i = 1; i < charArr.length; i++) {
            System.out.print(charArr[i]);
        }
    }
}
