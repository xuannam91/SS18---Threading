package ra.bt02;

public class EvenThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("Even num: %d\n", i);
            }
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
