package com.example.exercises.gamecontroller;

public class Controller {
    
    Command circleButton;
    Command crossButton;
    Command squareButton;
    Command triangleButton;

    public void setCircleButton(Command circleButton) {
        this.circleButton = circleButton;
    }

    public void setCrossButton(Command crossButton) {
        this.crossButton = crossButton;
    }

    public void setSquareButton(Command squareButton) {
        this.squareButton = squareButton;
    }

    public void setTriangleButton(Command triangleButton) {
        this.triangleButton = triangleButton;
    }

    public void pressCircle() {
        circleButton.execute();
    }

    public void pressCross() {
        crossButton.execute();;
    }

    public void pressSquare() {
        squareButton.execute();
    }

    public void pressTriangle() {
        triangleButton.execute();
    }
}
