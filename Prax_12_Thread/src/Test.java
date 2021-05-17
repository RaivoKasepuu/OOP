public class Test {
    public static void main(String[] args) {
        Thread failiLugejaLõim1 = new Thread(new FailiLugeja("countdownlatch.txt"));
        Thread failiLugejaLõim2 = new Thread(new FailiLugeja("executorservice.txt"));
        failiLugejaLõim1.start();
        failiLugejaLõim2.start();
    }
}
