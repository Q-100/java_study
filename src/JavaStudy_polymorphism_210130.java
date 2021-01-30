public class JavaStudy_polymorphism_210130 {
    public static void main(String[] args) {
        Tv1 t = new SmartTv(); // Tv1리모컨으로 SmartTv 제품을 사용, 그래서 기능을 다 못씀
        /*FireEngine f = new FireEngine(); // 조상자손 관계에서만 참조변수 형반환 가능
        Car c = (Car) f;
        FireEngine f2 = (FireEngine)c;
        f2.water();
        Car c = new Car(); 
        FireEngine f = (FireEngine) c;
        f.water();*/ // c라는 인스턴스가 있는데 그걸 FireEngine으로 형변환해도 인스턴스는 그대로 c이기 때문에 자기범위를 넘어선 water()은 사용불가능 
        Car c = new Car();
        System.out.println(c instanceof FireEngine);
        if (c instanceof FireEngine){
            FireEngine f = (FireEngine) c;
            f.water();
        }


    }
}
class Tv1{
    boolean power;
    int channel;
}
class SmartTv extends Tv1{
    String text;
    void caption(){

    }
}
class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive!!");
    }
    void stop(){
        System.out.println("Stop!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("Water!!");
    }
}

