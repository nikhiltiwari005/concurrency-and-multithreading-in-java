package cmj;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class AppLogger {

    private static final Logger logger = Logger.getLogger("AppLogger");
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");

    static {
        logger.setUseParentHandlers(false);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                LocalDateTime now = LocalDateTime.now();
                String timestamp = now.format(formatter);
                return String.format("%s %s: %s%n",
                        timestamp,
                        record.getLoggerName(),
                        record.getMessage());
            }
        });
        logger.addHandler(consoleHandler);
    }

    public static void info(String message) {
        logger.info(message.toString());
    }
}