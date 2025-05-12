package cmj.threadcoordinate;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            wait(); // wait until there's space
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // notify a waiting consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait until there's data
        }
        int value = queue.remove();
        System.out.println("Consumed: " + value);
        notify(); // notify a waiting producer
    }
}
