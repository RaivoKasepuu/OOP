package oop;

import javafx.scene.layout.Pane;

public class BadApple extends Apple {

    public BadApple(double locX, double locY, Pane canvas) {
        super("images/newton_bad.png");
        this.setLayoutX(locX);
        this.setLayoutY(locY);
        canvas.getChildren().add(this);
    }


    @Override
    public int getSpeed() {
        return 15;
    }

    @Override
    public void hitsHead(Newton newton) {
        newton.addPoints(- 5);
    }

    @Override
    public void hitsBody(Newton newton) {
        newton.addPoints(- 3);
    }

    @Override
    public void hitsGround(Newton newton) {
        newton.addPoints(5);
    }
}

