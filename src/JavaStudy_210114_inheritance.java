public class JavaStudy_210114_inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        Test t = new Test();
        t.r = 1;
    }
}
class Circle{
    Point p = new Point();
    double r;
}
class Point{
    int x;
    int y;
}
class Test extends Circle{
    int z;
}