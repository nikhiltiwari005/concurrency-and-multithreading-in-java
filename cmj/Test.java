package cmj;

import java.util.concurrent.atomic.AtomicInteger;

import static java.io.IO.println;

public class Test {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);
        println(ai.get());
        println(ai.incrementAndGet());
        println(ai.getAndIncrement());
        println(ai.get());
    }
}
