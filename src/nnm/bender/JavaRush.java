package nnm.bender;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class JavaRush {

    class LOGTEST {

    }

    public static void main(String[] args) throws Exception {
        Logger log = Logger.getLogger("nnm.bender");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        log.addHandler(handler);
        log.setUseParentHandlers(false);
        log.info("asdsa");
    }

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public static class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotConnection = null;
        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException robotConnectionException) {
                if (i == 2) {
                    throw robotConnectionException;
                }
            } catch (RuntimeException exception) {
                throw exception;
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException robotConnectionException) {
                        if (i == 2) {
                            throw robotConnectionException;
                        }
                    } catch (RuntimeException exception) {
                        throw exception;
                    }
                }
            }
        }
    }


    private static void secondTest() {

    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElement;
        try {
            throw new Exception();
        } catch (Exception e) {
            stackTraceElement = e.getStackTrace();
        }
        int countMethod = stackTraceElement.length;
        if (countMethod == 7) {
            return null;
        }
        String result = stackTraceElement[2].getClassName() + "#" + stackTraceElement[2].getMethodName();
        return result;
    }
}


