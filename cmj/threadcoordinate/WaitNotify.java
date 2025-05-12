package cmj.threadcoordinate;

public class WaitNotify {

    public static void main(String[] args) {
        SharedQueue shared = new SharedQueue();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    shared.produce(i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    shared.consume();
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
