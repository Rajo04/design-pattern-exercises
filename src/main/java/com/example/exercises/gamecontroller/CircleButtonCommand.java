package com.example.exercises.gamecontroller;

public class CircleButtonCommand implements Command{
    
    private final Receiver receiver;

    public CircleButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionCircle();
    }
}
