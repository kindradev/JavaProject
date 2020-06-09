import java.awt.*;
import java.util.Random;

public class MouseMover {
    public static void main(String[] args) throws Exception{
        int count=0;
        Robot hal=new Robot();
        Random random=new Random();
        System.out.println("....MouseMover Program Started....");
        while(true){
            hal.delay(500*60);
            int x=random.nextInt()%640;
            //System.out.println(x);

            int y=random.nextInt()%480;
            //System.out.println(y);

            hal.mouseMove(x,y);

            System.out.println("counter count ---> "+ ++count);
        }

    }

}
