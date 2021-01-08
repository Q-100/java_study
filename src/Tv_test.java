import java.util.Scanner;

public class Tv_test {
    public static void main(String[] args) {

        Tv t = new Tv();
        Tv t1[] = new Tv[]{new Tv(),new Tv(),new Tv()};
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        int guess;
        System.out.println("초기 채널0을 입력하세요 : ");
        int channel = scanner.nextInt();
        t.channel = channel;
        System.out.println("초기 채널1을 입력하세요 : ");
        channel = scanner.nextInt();
        t1[1].channel = channel;

        System.out.println("채널을 "+t.channel+"로 설정하였습니다.");
        System.out.println("채널을 "+t1[1].channel+"로 설정하였습니다.");
        while(flag == 1){
            System.out.println("메뉴를 선택하세요");
            System.out.println("0. 종료");
            System.out.println("1. 티비 전원");
            System.out.println("2. 채널 올리기");
            System.out.println("3. 채널 내리기");
            guess = scanner.nextInt();
            if (guess == 0)
                flag = 0;
            else if (guess == 1){
                t.PowerCheck();
                if (t.power == true)
                    System.out.println("전원이 켜졌습니다.");
                else
                    System.out.println("전원이 꺼졌습니다.");
            }
            else if (guess ==2){
                t.channel_UP();
                System.out.println("현재 채널은 "+t.channel+"입니다.");
            }
            else if (guess == 3){
                t.channel_DOWN();
                System.out.println("현재 채널은 "+t.channel+"입니다");
            }
        }
    }
}
class Tv{
    String color;
    boolean power = true;
    int channel;
    void PowerCheck(){
        if (power == true) {
            power = false;
        }
        else
            power = true;
    }
    void channel_UP(){
        channel++;
    }
    void channel_DOWN(){
        channel--;
    }
}

