package Clock;

import Clock.Clocks.BRLClock;
import Clock.Clocks.Clock;
import Clock.Clocks.USClock;

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(13); 
        
        System.out.println(brlClock.getTime());

        System.out.println(new USClock().convert(brlClock).getTime());
    }    
}
