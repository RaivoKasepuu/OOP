package oop;

import javafx.scene.image.ImageView;

public abstract class Apple extends ImageView {

    Apple(String url) {
        super(url);
    }

    public abstract int getSpeed();
    public abstract void hitsHead(Newton newton);
    public abstract void hitsBody(Newton newton);
    public void hitsGround(Newton newton) {

    }

    public void move() {
        this.setLayoutX(getLayoutX());
        this.setLayoutY(getLayoutY() + getSpeed());
    }
}
