abstract class Unit2{
    int x,y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다");
    }
}
interface Fightable1{
    void move(int x,int y);
    void attack(Fightable1 f);
}
class Fighter2 extends Unit2 implements Fightable1{
    public void move(int x, int y){ // 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안됨(Fightable1은 public abstract임)
        System.out.println("["+x+","+y+"]"+"로 이동");
    }
    public void attack(Fightable1 f){
        System.out.println(f+"를 공격");
    }
    Fightable1 getfightable(){
        Fighter2 f = new Fighter2();
        return f; // 사실 return (Fightable1) f임 -> 함수 반환값이 Fgithable1이기 때문에 자동으로 형변환되서 반환됨
    }
}
public class JavaStudy_210201_interface_ex {
    public static void main(String[] args) {
        Fighter2 f = new Fighter2();
        f.move(10,50);
        f.attack(new Fighter2());

        Unit2 u = new Fighter2();
        Fightable1 f1 = new Fighter2();

        u.move(10,50);
       // u.attack(new Fighter()); // Unit2에는 attack메서드가 없음
        u.stop();

        f1.attack(new Fighter2());
        f1.move(30,50);
        // f1.stop(); // Fightable1에는 stop메서드가 없음

        Fightable1 fig = f.getfightable(); // getfightable의 반환타입과 일치해야됨


    }
}
