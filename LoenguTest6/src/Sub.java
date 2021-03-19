public class Sub extends AbstractClass {
    int b =2;
    Sub() {
        b = super.b;
    }

    @Override
    int getNumber(int x, int y) {
        int i = x -y +b;
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.getNumber(7,3);
    }
}
