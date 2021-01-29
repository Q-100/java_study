public class JavaStudy_polymorphism_210130 {
    public static void main(String[] args) {
        Tv1 t = new SmartTv(); // Tv1리모컨으로 SmartTv 제품을 사용, 그래서 기능을 다 못씀


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
