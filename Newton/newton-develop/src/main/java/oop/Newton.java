package oop;

import javafx.scene.image.ImageView;

public class Newton  extends ImageView {

    public Newton() {
        super("images/newton_small.png");
    }

    private int points = 0;
    private int lives = 3;

    public void addPoints(int points) {
        this.points += points;
    }

    public void addLives(int lives) {
        this.lives += lives;
    }


    public int getPoints() {
        return points;
    }

    public int getLives() {
        return lives;
    }
}
