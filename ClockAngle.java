public class ClockAngle {
    
    public static int angle(String s){

        int hh=Integer.parseInt(s.substring(0, 2));
        int mm=Integer.parseInt(s.substring(3, 5));
        if(mm==60){hh++;mm=0;}
        
        if (hh == 12)hh = 0;
        if (mm == 60){
            mm = 0;
            hh += 1;
        }    
        if(hh>12)hh = hh-12;

        if (hh <0 || mm< 0 || hh >12 || mm > 60){
            System.out.println("Wrong input");
            return -1;
        }
        int hourAngle = (int)(hh*30 + mm*0.5);
        int minuteAngle = (int)(6*mm);
 
        
        int angle = Math.abs(hourAngle - minuteAngle);
 
        
        angle = Math.min(360-angle, angle);
 
        return angle;
        
    }
    public static void main(String[] args) {
        System.out.println(angle("09:70"));
    }
}