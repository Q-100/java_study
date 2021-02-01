class A{
    void methodA(I i){
        i.play();
    }
}
class B implements I{
    public void play(){
        System.out.println("시작!");
    }
}
interface I {
    void play();
}
class Marine{

}
class SCV{

}
class Tank{

}
class DropShip{

}
class GroundUnit{
    void move(){
        System.out.println("땅에서 이동중");
    }
}
public class JavaStudy_210201_interface_ex1 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());

    }
}
