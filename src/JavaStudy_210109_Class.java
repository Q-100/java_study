public class JavaStudy_210109_Class {
    public static void main(String[] args) {
        System.out.println(Mymath2.add_static(0.15,0.49)); // 클래스 메소드는 바로사용가능

        Mymath2 t = new Mymath2(); // 인스턴스 메소드는 객체를 생성해야 사용가능
        t.a = 0.15;
        t.b = 0.49;
        System.out.println(t.add());

    }
    static double add_static1(double a,double b){
        return a+b;
    }
}
class Mymath2{
    double a,b;

    double add(){ // 인스턴스 매소드
        return this.a + this.b;
    }
    static double add_static(double a,double b){ // 클래스 메소드(인스턴스 변수를 사용하지 않을 때 사용)
        return a+b;
    }
}
