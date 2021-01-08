public class Ex6_8 {
    public static void main(String[] args) { //클래스

        Data3 d = new Data3();
        d.x = 10;
        Data3 d2 = copy(d);
        Check();
        d2.x = 100;
        d.x = 1000;
        System.out.println("d.x="+d.x);
        System.out.println("d2.x="+d2.x);


    }
    static Data3 copy(Data3 d){ // 클래스
        Data3 tmp = new Data3();
        tmp.x = d.x;
        return tmp;
    }
    static void Check(){
        System.out.println("asd");
    }
}
class Data3 {int x;}

