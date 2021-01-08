import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int PhonePrice=0;
        double dollar=0;
        Scanner scanner = new Scanner(System.in);
        Input i = new Input();
        try {
            System.out.printf("휴대폰 가격을 입력하세요 : ");
            PhonePrice = scanner.nextInt();
            System.out.printf("\n달러 환율을 입력하세요 : ");
            dollar = scanner.nextDouble();
        }catch (Exception e) {
            System.out.printf("정수와 실수를 제대로 입력하세요.");
        }
        System.out.printf("휴대폰은 %d 달러입니다.",(PhonePrice/dollar));
    }
}