public class JavaStudy_modifier1_210130 {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(55);
        System.out.println(t.getHour());

    }
}
class Time{
    private int hour;
    private int minute;
    private int second;

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if (hour<0 || hour>23){
            return;
        }
        else
            this.hour = hour;
    }

}







