package cmj.thread;

public class DaemonThread {

     void main() {
        /* 🔹 Non-Daemon Thread (aka User Thread)
            •	Definition: A normal thread that keeps the JVM alive.
            •	Behavior: The JVM will not exit until all non-daemon threads finish.
            •	Use Cases:
            •	Business logic
            •	Main application flow
            •	Any task that must complete (e.g., request processing, DB writes)
        */
         Thread t2 = new Thread(() -> System.out.println("Non Daemon thread"));
         t2.start();


         /* 🔹 Daemon Thread (Background Thread)
            •	Definition: A thread that runs in the background and does not prevent JVM shutdown.
            •	Behavior: JVM can kill it abruptly when all user threads finish.
            •	Use Cases:
            •	Logging
            •	Monitoring
            •	Cleanup tasks
            •	GC (Java’s own garbage collector runs on daemon threads)
          */
         Thread t = new Thread(() -> {
             while (true) System.out.println("Daemon still running...");
         });
         t.setDaemon(true);  // must be set *before* calling start()
         t.start();

    }
}
