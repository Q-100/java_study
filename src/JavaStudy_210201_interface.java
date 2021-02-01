public class JavaStudy_210201_interface {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(5,3);
        Unit1 u = new Fighter();
        Fightable f1 = new Fighter();
        f1.move(3,5);

    }
}
interface PlayingCard{
    public static final int SPADE=4; // 인터페이스에서 상수는 항상 public static final이기 때문에 생략가능
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber(); // 인터페이스에서 메서드는 항상 public abstract이기 때문에 생략가능
    String getCardKind();
}
interface Fightable extends Movable, Attackable{ // 인터페이스는 다중 상속가능(추상메서드는 충동해도 문제없음)
}
interface Movable{ // 원래는 Class test이렇게하면 뒤에 extends Object가 자동으로 붙는데 인터페이스는 최고조상이 오브젝트가아님
    void move(int x, int y);
}
interface Attackable{
    void attack(int x);
}
class Fighter extends Unit1 implements Fightable{
    public void move(int x, int y){} // 인터페이스들의 move와 attack은 public이 기본인데 생략해서 표시함
    public void attack(int x){} // 그래서 public을 까먹지않고붙여줘야됨

}
abstract class Fighter1 implements Fightable{ // 추상클래스처럼 메서드를 모두 구현하지 않았을 경우 abstarct를 붙여줘야됨
    public void move(int x, int y){}
}
class Unit1{
    int currentHP;
    int x;
    int y;
}