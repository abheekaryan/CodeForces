import java.util.Scanner;

public class PetyaAndStrings112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()>0 && s2.length()>0 ){
            int flag = s1.compareToIgnoreCase(s2);
            if(flag<0){
                System.out.println(-1);
            }else if(flag==0){
                System.out.println(0);
            }else {
                System.out.println(1);
            }
        }
    }
}
