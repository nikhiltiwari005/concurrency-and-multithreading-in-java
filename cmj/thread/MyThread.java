package cmj.thread;

import cmj.AppLogger;

public class MyThread extends Thread {

    @Override
    public void run() {
        AppLogger.info(Thread.currentThread().getName() + " " + Thread.currentThread().threadId() + " " + Thread.currentThread());
    }
}
