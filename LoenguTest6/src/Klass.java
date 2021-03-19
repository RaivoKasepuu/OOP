public  class Klass extends AbstractClass {
    int b = 2;
    Klass() {
     b = super.b;
    }

    public static void main(String[] args) {
        Klass alam = new Klass();
        alam.getNumber(7,3);
    }

    int getNumber(int x, int y) {
        int i = x -y + b;
        System.out.println(i);
        return i;
    }
}
