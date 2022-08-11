import java.util.Scanner;

public class limakAndBob791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Limak = sc.nextInt();
        int Bob = sc.nextInt();
        int itr=1;
        if(Limak<=10 && Bob<=10){
            do{
                Limak = itr*3*Limak;
                Bob = itr*2*Bob;
                if(Limak>Bob){
                    System.out.println(itr);
                }
                itr++;
            }
            while(Limak<=Bob);
        }
    }
}
