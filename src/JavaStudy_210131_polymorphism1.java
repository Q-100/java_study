import java.util.Scanner;

public class JavaStudy_210131_polymorphism1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyer b = new buyer();
        b.money = 10000;
        b.bonus = 0;
        Tv2 tv = new Tv2();
        Computer c = new Computer();
        Audio a = new Audio();
        /*
        tv.price = 5000;
        tv.bonus = 10;
        c.price = 3000;
        c.bonus = 5;
        a.bonus = 30;
        a.price = 1000;
         */
        int flag = 1;
        while (b.money>0){
            System.out.println("무엇을 구매하시겠습니까?");
            System.out.println("1. Tv");
            System.out.println("2. Computer");
            System.out.println("3. Audio");
            int check = scanner.nextInt();
            if (check == 1){
                b.buy(tv);
            }
            else if(check == 2){
                b.buy(c);
            }
            else{
                b.buy(a);
            }
            System.out.println("남은 돈은"+b.money+"이며"+"보너스는"+b.bonus+"입니다.");
        }
        System.out.println("돈이 부족합니다.");

    }
}

class buyer{
    int money;
    int bonus;
    void buy(Product p){ // Product는 티비 컴퓨터 오디오 모두의 조상이여서 다형성을 이용해 여러 참조변수를 한번에 매개변수로 받을수 있다.

        this.money -= p.price;
        this.bonus += p.bonus;
        System.out.println(p.toString()+"를 구매하셨습니다.");
    }
}
class Product{
    int price;
    int bonus;
    Product(int price){
        this.price = price;
    }
}
class Tv2 extends Product{
    Tv2(){
        super(1000); // Tv2인스턴스가 만들어졌고 그안의 price에 1000원이 저장된거임(super)
    }
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product{
    Computer(){
        super(3000);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio extends Product{
    Audio(){
        super(500);
    }
    public String toString(){
        return "Audio";
    }
}

