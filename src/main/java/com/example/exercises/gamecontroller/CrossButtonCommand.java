package com.example.exercises.gamecontroller;

public class CrossButtonCommand implements Command{
    
    private final Receiver receiver;

    public CrossButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionCross();
    }
}
