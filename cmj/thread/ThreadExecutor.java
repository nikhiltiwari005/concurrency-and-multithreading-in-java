package cmj.thread;

import cmj.AppLogger;

public class ThreadExecutor {

    public void demo() {
        var t = new Thread(new MyTask());
        t.setPriority(1);
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.start();
        new Thread(() -> AppLogger.info(Thread.currentThread().getName() + " " + Thread.currentThread().threadId() + " " + Thread.currentThread())).start();
        new Thread(() -> AppLogger.info(Thread.currentThread().getName() + " " + Thread.currentThread().threadId() + " " + Thread.currentThread())).start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}
