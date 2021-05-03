public class Pilt {

    private int pictureWidth;
    private int pictureHeight;
    private int[][] pictureMatrix;


    public Pilt(int pictureWidth, int pictureHeight) {
        this.pictureWidth = pictureWidth;
        this.pictureHeight = pictureHeight;
        pictureMatrix = new int[pictureWidth][pictureHeight];
        for (int i = 0; i < pictureWidth; i++) {
            for (int j = 0; j < pictureHeight; j++){
                pictureMatrix[i][j] = 0;
            }
        }
    }

    public void määraPiksel(int x, int y, int colorCode) {
        System.out.println(x);
        System.out.println(y);
        if (x > pictureWidth || y > pictureHeight || x < 1  || y < 1) {
            throw new VigaseKoordinaadiErind("Koordinaat asub pildi mõõtmetest väljaspool. Pildi laius on " + pictureWidth + " ja pildi kõrgus on " + pictureHeight) ;
        }
        if (colorCode > 255 || colorCode < 0) {
            throw new VigaseVärviErind("Värvikood peab jääma vahemikku 0...255");
        }
        pictureMatrix[x - 1][y - 1] = colorCode;
    }


    public int annaPiksel(int x, int y) {
        if (x > pictureWidth || y > pictureHeight || x < 1  || y < 1 ) {
            throw new VigaseKoordinaadiErind("Sisestatud piksel asub väljaspool pildi mõõte! Pildi laius on " + pictureWidth + " ja pildi kõrgus on " + pictureHeight);
        }
        return pictureMatrix[x - 1][y - 1];
    }

    public int getPictureWidth() {
        return pictureWidth;
    }

    public int getPictureHeight() {
        return pictureHeight;
    }
}
