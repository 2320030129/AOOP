package com.isp.worker;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
}
