import java.util.Scanner;

public class StringTask118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String PetyaString = sc.nextLine();
        if(PetyaString.length()<=100){
            String vowelDictionary = "aeiouyAEIOUY";
            char[] newCharArr = PetyaString.toCharArray();
            for(char ch: newCharArr){
                if(vowelDictionary.indexOf(ch)>-1){
                    PetyaString = PetyaString.replace(String.valueOf(ch),"");
                }
            }
            PetyaString = PetyaString.toLowerCase();
            newCharArr = PetyaString.toCharArray();
            for (char ch: newCharArr){
                System.out.print("."+ch);
            }
        }
        sc.close();
    }
}
