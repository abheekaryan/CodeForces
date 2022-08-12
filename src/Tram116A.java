import java.util.Scanner;

public class Tram116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enter, exit;
        int MIN_CAPACITY=0;
        int currentlyInTrain = 0;
        int total;
        int stops = sc.nextInt();
        for (int i = 0; i < stops; i++) {
            exit = sc.nextInt();
            enter = sc.nextInt();
            if(exit==0 && currentlyInTrain<0){
                total = exit + enter;
            }
            else{
                total = currentlyInTrain + enter;
            }
            currentlyInTrain = total - exit;
            if(MIN_CAPACITY<currentlyInTrain){
                MIN_CAPACITY = currentlyInTrain;
            }
        }
        System.out.println(MIN_CAPACITY);
    }
}
