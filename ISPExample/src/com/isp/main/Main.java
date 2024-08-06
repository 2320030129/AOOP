package com.isp.main;

import com.isp.worker.Human;
import com.isp.worker.Robot;
import com.isp.worker.Worker;
import com.isp.worker.Eater;

public class Main {
    public static void main(String[] args) {
        Worker robot = new Robot();
        robot.work();

        Human human = new Human();
        human.work();
        human.eat();
    }
}
