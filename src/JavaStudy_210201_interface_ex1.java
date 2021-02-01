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

public class JavaStudy_210201_interface_ex1 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());

    }
}
