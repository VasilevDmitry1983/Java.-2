import action.*;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        People man1 = new People("Вася", 5000, 3 );
        Robot robot1 = new Robot("Bender",10000, 5);
        Cat cat1 = new Cat("Семен",100, 2);
        Action[] participants = new Action[3];
        participants[0]= man1;
        participants[1]= robot1;
        participants[2]= cat1;

        Treadmill treadmill1= new Treadmill(6000);
        Wall wall1 = new Wall(3);
        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0]=treadmill1;
        obstacles[1]=wall1;

        for (Action i: participants){
            if (obstacles[0].getAction(i.run()) == true) {
                obstacles[1].getAction(i.jump());
            }


        }

    }
}
