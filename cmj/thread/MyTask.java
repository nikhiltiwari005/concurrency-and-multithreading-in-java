package cmj.thread;

import cmj.AppLogger;

public class MyTask implements Runnable {
    @Override
    public void run() {
        AppLogger.info(Thread.currentThread().toString());
    }
}
