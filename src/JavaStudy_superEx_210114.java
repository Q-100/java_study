public class JavaStudy_superEx_210114 {
    public static void main(String[] args) {

    }
}
class Point1{
    int x,y;
    Point1(int x,int y){
        this.x = x;
        this.y = y;
    }
}
class Point3D extends Point1{
    int z;

    Point3D(int x, int y, int z){
        super(x,y);
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
