package cmj.threadcount;

public class InitialThreads {

    public static void main(String[] args) throws InterruptedException {
        // this will show us the num of threads running in jvm. alt. jcmd <PID> Thread.print or jstack 80956 (this will dump threads)
        Thread.getAllStackTraces().keySet().forEach(System.out::println);
        Thread.sleep(10000); // 10 sec
    }
}
