public class JavaStudy_210115_modifier {
    public static void main(String[] args) {
        System.out.println(StaticTest.max(3,5));
        FinalTest f = new FinalTest(9);
        System.out.println(f.MAX_SIZE);

    }

}
class StaticTest{
    static int width = 200; // 클래스변수(지역변수, 공통으로 사용)
    static int height = 120; // 클래스변수(지역변수, 공통으로 사용)

    static {

    }
    static int max(int x, int y){ // 클래스메서드(인스턴스를 생성안하고도 바로 사용가능)
        return x>y?x:y;
    }
}
final class FinalTest{ // final이 붙은 클래스는 다른 클래스의 조상이 될 수 없음
    final int MAX_SIZE; // 변경할수 없는 상수

    FinalTest(){
        this(0);
    }

     FinalTest(int MAX_SIZE) {
         this.MAX_SIZE = MAX_SIZE;
     }
    final int getMaxsize(){ // 변경될수 없으며 final로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }
}
