public class JavaStudy_polymorphism2_210131 {
    public static void main(String[] args) {
        Product p1 = new Tv2();
        Product p2 = new Computer();
        Product p3 = new Audio();

        Product p[] = new Product[3]; // 위에랑 같은 의미
        p[0] = new Tv2();
        p[1] = new Computer();
        p[2] = new Audio();
    }
}
