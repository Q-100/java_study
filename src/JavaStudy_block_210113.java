public class JavaStudy_block_210113 {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("Java");
        Document d3 = new Document();
        Document d4 = new Document();
        for(int i=0; i<block_test.intArr.length;i++){
            System.out.println("intArr["+i+"]"+"="+block_test.intArr[i]);
        }
    }
}
class Document{
    static int level; // 0으로 최기화안해줘도 자동으로 0으로 초기화됨
    String name;
    Document(){
        this("제목없음"+ ++level);
    }
    Document(String name){
        System.out.println("문서 "+name+"가 생성되었습니다.");
    }

}
class block_test{
    static int intArr[] = new int[5];

    static {
        for (int i=0; i<intArr.length; i++){
            intArr[i] = (int) (Math.random()*10)+1;
        }
    }


}