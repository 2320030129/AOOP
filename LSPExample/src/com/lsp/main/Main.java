package com.lsp.main;

import com.lsp.bird.Bird;
import com.lsp.bird.Ostrich;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // This should work fine

        Bird ostrich = new Ostrich();
        ostrich.fly(); // This will cause an exception
    }
}
