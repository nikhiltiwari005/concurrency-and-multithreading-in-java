package cmj.thread;

import cmj.AppLogger;

public class VirtualThread {

    void main() {
        Thread.ofVirtual().start(() -> AppLogger.info("1 " + Thread.currentThread()));
        Thread.startVirtualThread(() -> AppLogger.info("2 " + Thread.currentThread()));
        Thread.startVirtualThread(() -> AppLogger.info("3 " + Thread.currentThread()));
        Thread.startVirtualThread(() -> AppLogger.info("4 " + Thread.currentThread()));
        new Thread(() -> AppLogger.info("0 " + Thread.currentThread())).start();
    }
}
