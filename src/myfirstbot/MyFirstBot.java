package myfirstbot;

import robocode.*;
import java.awt.Color;

/**
 *
 * @author Lucas
 */
public class MyFirstBot extends AdvancedRobot {

    int gunDirection = 1;

    public void run() {

        setColors(Color.darkGray, Color.black, Color.lightGray, Color.green, Color.green);

        while (true) {
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {

        setTurnRight(e.getBearing());

        setFire(3);

        setAhead(100);

        gunDirection = -gunDirection;

        setTurnGunRight(360 * gunDirection);

        execute();
    }
}
