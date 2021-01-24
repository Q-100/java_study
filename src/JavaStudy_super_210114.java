public class JavaStudy_super_210114 {
    public static void main(String[] args) {
        Child c = new Child(5);
        c.method();


    }
}
class Parent{
    int x=10;
    Parent(){} // 자손클래스와 조상클래스에 생성자가 정의되어있으면 자동으로 생성자 생성X
    Parent(int x){ // 직접적으로 Parent(){}를 추가하거나 조상클래스에 super()을 추가해야됨
        this.x=x;
    }
}
class Child extends Parent{
    int x = 20;
    Child(int x){
        super(x); //super생성자 추가
        this.x = x;
    }
    void method(){
        System.out.println("x:"+x);
        System.out.println("this.x:"+this.x);
        System.out.println("super.x:"+super.x);
    }
}
