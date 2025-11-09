package com.example.exercises.gamecontroller;

public class Receiver {
    
    public void actionCross() {
        System.out.println("Cross button pressed: Jump");
    }

    public void actionTriangle() {
        System.out.println("Triangle button pressed: Switch to new weapon");
    }

    public void actionSquare() {
        System.out.println("Square button pressed: use your current weapon");
    }

    public void actionCircle() {
        System.out.println("Circle button pressed: crouch");
    }
}
