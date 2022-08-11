import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Object[] inpArr;
        input = input.replace("+","");
        inpArr = Arrays.stream(input.split("")).toArray();
        Arrays.sort(inpArr);
        StringBuilder newStr = new StringBuilder();
        for(Object ob: inpArr) {
            newStr.append((String) ob);
            if(ob!=inpArr[inpArr.length-1]){
                newStr.append("+");
            }
        }
        System.out.println(newStr);
    }
}
