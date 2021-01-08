import java.util.Random;
import java.util.Scanner;

public class Random_Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int flag = 1;

        while (flag == 1){
            int randomNumber = random.nextInt(256);
            int Num;
            while(true){
                System.out.println("숫자를 입력하세요 : ");
                Num = scanner.nextInt();
                if (Num == randomNumber){
                    System.out.println("정답입니다! ");
                    break;
                }
                else if (Num > randomNumber){
                    System.out.println(Num+"보다 작은 숫자입니다.");
                }
                else if (Num < randomNumber){
                    System.out.println(Num+"보다 큰 숫자입니다.");
                }
            }
            System.out.println("게임을 계속하시겠습니까?(Yes:1 / No:0)");
            flag = scanner.nextInt();
        }
    }
}
