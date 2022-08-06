import java.util.*;

public class BoyOrGirl236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase().trim();
        Set<Character> newset = new HashSet<>();
        char[] chArr = s.toCharArray();
        for(char ch: chArr){
            newset.add(ch);
        }
        int n = newset.size();
        if (n%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
