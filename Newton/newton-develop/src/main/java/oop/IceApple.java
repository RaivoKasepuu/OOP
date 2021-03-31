package oop;

import javafx.scene.layout.Pane;

public class IceApple extends Apple {


    public IceApple(double locX, double locY, Pane canvas) {
        super("images/newton_green.png");
        this.setLayoutX(locX);
        this.setLayoutY(locY);
        canvas.getChildren().add(this);
    }

    //  @Override
    // public AppleType getType() {
    //     return AppleType.ICE;
    // }

    @Override
    public int getSpeed() {
        return 15;
    }

    @Override
    public void hitsHead(Newton newton) {
        newton.addLives(-1);
    }

    @Override
    public void hitsBody(Newton newton) {
        if (newton.getPoints() > 20) {
            newton.addPoints(-20);
        } else {
            newton.addLives(-1);
        }
    }

    @Override
    public void hitsGround(Newton newton) {
        newton.addPoints(20);
    }
}
