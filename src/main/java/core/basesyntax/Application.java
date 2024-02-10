package core.basesyntax;

import models.Ball;
import models.Lottery;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}
