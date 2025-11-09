package com.example.exercises.gamecontroller;

public class SquareButtonCommand implements Command {
    
    private final Receiver receiver;

    public SquareButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionSquare();
    }
}
