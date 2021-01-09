public class JavaStudy_constructor_210109 {
    public static void main(String[] args) {
        Data1 d1 = new Data1(5);
        Data2 d2 = new Data2(5); // Data2 클래스에는 생성자가 존재하기 때문에 인자가 필요함
        Car2 c1 = new Car2(); // Car2 매개변수 없는 생성자
        Car2 c2 = new Car2("blue"); // 색깔만 넘겨주는 생성자
        Car2 c3 = new Car2("green","auto",5); // 3개다 넘겨주는 생성자

        System.out.println(c1.color + c1.gearType + c1.door);
        System.out.println(c2.color + c2.gearType + c2.door);
        System.out.println(c3.color + c3.gearType + c3.door);

    }
}
class Data1{ 
    int value;
    Data1(){ // 매개변수가 없으면 3
        value = 3;
    }
    Data1(int x){ // 매개변수가 있으면 매개변수를 value에 저장
        value = x;
    }
}
class Data2{
    int value;
    
    Data2(int x){
        value= x;
    }
}

class Car2{
    String color;
    String gearType;
    int door;
    /*
    Car2(String color){
    door = 5;            // this를 사용할떈 무조건 첫번째 줄에서 사용해야함
    Car2(color,"auto",5); // Car2가 아니라 this를 사용하기
    }
     */
    {
        this.color = "white";
    }

    Car2(){
        this("white","auto",4);
    }
    Car2(String color){
        this(color,"white",4);
    }
    Car2(String c,String g, int d){ // 지역변수랑 인스턴스 변수랑 이름이 다르면 this 생략가능
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
    /*
    Car2(String color,String gearType, int door){ // 지역변수랑 인스턴스변수를 구분할려고 this 사용
        this.color = color;
        this.gearType = gearType;
        this.door = door;

    }*/
}
