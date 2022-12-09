public class ClockAngle {
    public static String angle(String s){

        int hh=Integer.parseInt(s.substring(0, 2));
        int mm=Integer.parseInt(s.substring(3, 5));
        if(mm==60){hh++;mm=0;}


        return (hh+" "+mm);
    }
    public static void main(String[] args) {
        System.out.println(angle("05:60"));
        //angle("05:30");
    }
}
