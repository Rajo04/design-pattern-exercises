package com.example.exercises.gamecontroller;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command crossButtonCommand = new CrossButtonCommand(receiver);
        Command triangleButtonCommand = new TriangleButtonCommand(receiver);
        Command squareButtonCommand = new SquareButtonCommand(receiver);
        Command circleButtonCommand = new CircleButtonCommand(receiver);

        Controller controller = new Controller();

        controller.setCrossButton(crossButtonCommand);
        controller.setTriangleButton(triangleButtonCommand);
        controller.setSquareButton(squareButtonCommand);
        controller.setCircleButton(circleButtonCommand);

        controller.pressCross();
        controller.pressTriangle();
        controller.pressSquare();
        controller.pressCircle();

        controller.setTriangleButton(squareButtonCommand);
        controller.pressTriangle();
    }
}
