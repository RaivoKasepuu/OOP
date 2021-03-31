package oop;

import javafx.scene.layout.Pane;

public class YellowApple extends Apple {

    public YellowApple(double locX, double locY, Pane canvas) {
        super("images/newton_yellow.png");
        this.setLayoutX(locX);
        this.setLayoutY(locY);
        canvas.getChildren().add(this);
    }

    // @Override
    //   public AppleType getType() {
    //   return AppleType.YELLOW;
    // }

    @Override
    public int getSpeed() {
        return 7;
    }

    @Override
    public void hitsHead(Newton newton) {
        newton.addPoints(3);
    }

    @Override
    public void hitsBody(Newton newton) {
        newton.addPoints(2);
    }

    @Override
    public void hitsGround(Newton newton) {
        newton.addPoints(-1);
    }
}

