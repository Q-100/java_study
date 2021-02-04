import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Unit{
    int currentHP;
    int currentxy;
    int attack;
    boolean airattackable;
    int price;
    Unit(){ }
    Unit(int currentHP, int currentxy, int attack, boolean airattackable, int price){
        this.currentHP = currentHP;
        this.currentxy = currentxy;
        this.attack = attack;
        this.airattackable = airattackable;
        this.price = price;
    }
}
class GroundUnit extends Unit{
    GroundUnit(int currentHP, int currentxy, int attack, boolean airattackable, int price){
        super(currentHP, currentxy, attack, airattackable, price);
    }
}
class Marine extends GroundUnit{
    Marine(){
        super(50,0,5,true,50);
    }

    public String toString(){
        return "마린";
    }
}
class SCV extends GroundUnit{
    SCV(){
        super(50,0,1,false,50);
    }
    public String toString(){
        return "SCV";
    }
}
class Tank extends GroundUnit{
    Tank(){
        super(200,0,20,false,150);
    }
    public String toString(){
        return "탱크";
    }
}

class AirUnit extends Unit{
    AirUnit(int currentHP, int currentxy, int attack, boolean airattackable, int price){
        super(currentHP, currentxy, attack, airattackable, price);
    }

}
class DropShip extends AirUnit{
    DropShip(){
        super(150,0, 0,false,200);
    }
    public String toString(){
        return "드랍쉽";
    }
}

class User extends Unit{
    static int mineral;
    int status = 0;
    int turn = 0;
    Vector unit_main = new Vector();
    Vector unit_middle = new Vector();
    Vector unit_enemy = new Vector();
    User(){
        this.mineral = 5000;
    }
    void buy_unit(Unit u){
        if (mineral<u.price){
            System.out.println("Not enough Minerals");
        }
        else{
            mineral -= u.price;
            System.out.println(u.toString()+"을(를) 구매하셨습니다.");
            unit_main.add(u);
        }
    }
    void showmine(){
        System.out.println("현재 미네랄은 "+mineral+"입니다.");
    }
    void showpower(){
        String powerlist = "[본진병력] ";
        Unit unit = new Unit();
        if (unit_main.isEmpty()){
            powerlist += "병력없음";
        }
        else if(!unit_main.isEmpty()){
            for (int i = 0; i < unit_main.size(); i++) {
                unit = (Unit) unit_main.get(i);
                powerlist += unit_main.get(i) + "[현재체력:" + unit.currentHP + "]" + " ";
            }
        }
        System.out.println(powerlist);
        powerlist ="[중앙병력] ";
        if (unit_middle.isEmpty()){
            powerlist += "병력없음";
        }
        else if(!unit_middle.isEmpty()){
            for (int i = 0; i < unit_middle.size(); i++) {
                unit = (Unit) unit_middle.get(i);
                powerlist += unit_middle.get(i) + "[현재체력:" + unit.currentHP + "]" + " ";
            }
        }
        System.out.println(powerlist);

        powerlist ="[적진병력] ";
        if (unit_enemy.isEmpty()){
            powerlist += "병력없음";
        }
        else if(!unit_enemy.isEmpty()){
            for (int i = 0; i < unit_enemy.size(); i++) {
                unit = (Unit) unit_enemy.get(i);
                powerlist += unit_enemy.get(i) + "[현재체력:" + unit.currentHP + "]" + " ";
            }
        }
        System.out.println(powerlist);
        powerlist ="";
    }
}
public class StarCraft {
    public static void main(String[] args) {
        boolean CommandCenter = true;
        boolean Hatchery = true;
        boolean Loop1 = true;
        boolean Loop2 = true;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int Start = random.nextInt(7)+1;
        int Choice = 0;
        int EnemyStart = 0;
        if (Start == 1)
            EnemyStart = 1;
        else if(Start == 2)
            EnemyStart = 3;
        else if(Start == 3)
            EnemyStart = 5;
        else if(Start == 4)
            EnemyStart = 6;
        else if(Start == 5)
            EnemyStart = 7;
        else if(Start == 6)
            EnemyStart = 9;
        else if(Start == 7)
            EnemyStart = 11;

        System.out.println("==========게임이 시작되었습니다.==========");
        System.out.println("       당신은 12시에서 시작하였습니다.");
        System.out.println("======================================");
        User user = new User();

        while(CommandCenter & Hatchery){
            while(Loop1) {
                Loop1 = true;
                System.out.println(" ");
                System.out.println("========== 행동을 선택하세요" + "(" + user.turn + ")" + " ==========");
                System.out.println("==========   1.유닛뽑기   ==========");
                System.out.println("==========   2.건물짓기   ==========");
                System.out.println("==========   3.이동하기   ==========");
                System.out.println("==========   4.상태확인   ==========");
                System.out.print("행동을 입력하세요 >>>>>>>  ");
                int choice_menu = scanner.nextInt();
                Loop2 = true;
                while(Loop2) {
                    switch (choice_menu) {
                        case 1:
                            System.out.println("==========   1.SCV   ==========");
                            System.out.println("==========   2.마린   ==========");
                            System.out.println("==========   3.탱크   ==========");
                            System.out.println("==========   돌아가기  ==========");
                            switch (scanner.nextInt()) {
                                case 1:
                                    SCV scv = new SCV();
                                    user.buy_unit(scv);
                                    Loop1 = true;
                                    Loop2 = false;
                                    break;
                                case 2:
                                    if (user.status < 1) {
                                        System.out.println("배럭스를 먼저 지으십시오.");
                                        continue;
                                    }
                                case 3:
                                    if (user.status < 2) {
                                        System.out.println("팩토리를 먼저 지으십시오.");
                                        continue;
                                    }
                                case 4:
                                    continue;
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("이동할 병력이 있는 위치를 선택하세요");
                            System.out.println("1.본진");
                            System.out.println("2.중앙");
                            System.out.println("3.적진");
                            System.out.println("4.돌아가기");
                            switch (scanner.nextInt()) {
                                case 1:
                                    if (user.unit_main.isEmpty()) {
                                        System.out.println("이동할 병력이 없습니다.");
                                        continue;
                                    } else {
                                        System.out.println("이동할 병력을 선택하세요");
                                        for (int i = 0; i < user.unit_main.size(); i++) {
                                            System.out.println(i + "." + user.unit_main.get(i));
                                        }
                                        int power_choice = scanner.nextInt();
                                        if (user.unit_main.get(power_choice) == null) {
                                            System.out.println("잘못입력하였습니다.");
                                            continue;
                                        }
                                        System.out.println("어디로 이동하시겠습니까?");
                                        System.out.println("1.중앙");
                                        if (scanner.nextInt() != 1) {
                                            System.out.println("잘못입력하셨습니다.");
                                            continue;
                                        } else {
                                            user.unit_middle.add(user.unit_main.get(power_choice));
                                            user.unit_main.remove(power_choice);
                                        }
                                    }
                            }
                            break;
                        case 4:
                            user.showmine();
                            user.showpower();
                            Loop2 = false;
                            break;
                    }
                }
            }
            user.turn++;
        }
    }
}
