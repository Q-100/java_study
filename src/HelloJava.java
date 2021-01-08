public class HelloJava {
    public static void main(String[] args) {
        int age = 45;
        int age1 = 30;
        int tmp;
        tmp = age;
        age = age1;
        age1 = tmp;
        double test = 10.31234;
        String test1 = "Hello World!";
        System.out.println("age : "+age + "age1 : " + age1);
        System.out.printf("test:%.2f\n",test);
        System.out.printf("test1:%.3s\n",test1);
        System.out.printf("age:%d age1:%d",age,age1);

    }
}

