package oop;

import javafx.scene.layout.Pane;

public class RedApple extends Apple {


    public RedApple(double locX, double locY, Pane canvas) {
        super("images/newton_red.png");
        this.setLayoutX(locX);
        this.setLayoutY(locY);
        canvas.getChildren().add(this);
    }

    // @Override
    // public AppleType getType() {
    //   return AppleType.RED;
    // }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public void hitsHead(Newton newton) {
        newton.addPoints(5);
    }

    @Override
    public void hitsBody(Newton newton) {
        newton.addPoints(3);
    }

    @Override
    public void hitsGround(Newton newton) {
        newton.addPoints(-2);
    }
}

