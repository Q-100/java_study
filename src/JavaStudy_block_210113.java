public class JavaStudy_block_210113 {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("Java");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
class Document{
    static int level = 0;
    String name;
    Document(){
        this("제목없음"+ ++level);
    }
    Document(String name){
        System.out.println("문서 "+name+"가 생성되었습니다.");
    }

}