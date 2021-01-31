public class JavaStudy_abstarct_210131 {
    public static void main(String[] args) {
        AudioPlayer a = new AudioPlayer();
// 추상클래스는 상속을 통해 완성해야 객체 생성가능
    }
}
abstract class Player{
    abstract void play(int pos);
    abstract void stop();
}
class AudioPlayer extends Player{
    void play(int pos){}
    void stop(){}
}
abstract class abstractPlayer extends Player{
    void play(int poss){}
    // 이 클래스는 play메서드만 구현하고 stop메서드를 구현하지 않아서 추상클래스로 작성됨
} 