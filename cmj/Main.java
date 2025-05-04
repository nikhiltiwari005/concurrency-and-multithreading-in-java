package cmj;

import cmj.thread.ThreadExecutor;

public class Main {

    public static void main(String[] args) {
        AppLogger.info("Hi there");
        new ThreadExecutor().demo();
    }
}
