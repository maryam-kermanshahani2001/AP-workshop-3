import java.awt.font.FontRenderContext;
import java.util.Date;

public class ClockRun {
    public static void main(String[] args) {
        ClockDisplay clkDisplay = new ClockDisplay();
        Date date = new Date();
        clkDisplay.setTime(1, 2);
        System.out.println(clkDisplay.getTime());

        clkDisplay.setTime(date.getHours(), date.getMinutes(), date.getSeconds());

        System.out.println(date);
        clkDisplay.timeTick();
        System.out.println(clkDisplay.getTime());
        clkDisplay.timeTick();
        System.out.println(clkDisplay.getTime());
        for (int i = 0; i < 20; i++){
            clkDisplay.timeTick();
        }
        System.out.println(clkDisplay.getTime());

    }
}
