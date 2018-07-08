package net.nsreverse.utils;

public class Log {
    static String prefix = "(OCP Practice \\ %s)";

    enum LogTypes {
        DEBUG,
        VERBOSE,
        ERROR,
        INFO
    }

    public static void d(String out) {
        out(LogTypes.DEBUG, out);
    }

    public static void v(String out) {
        out(LogTypes.VERBOSE, out);
    }

    public static void e(String out) {
        out(LogTypes.ERROR, out);
    }

    public static void i(String out) {
        out(LogTypes.INFO, out);
    }

    private static void out(LogTypes type, String out) {
        String[] types = {
                "D", "V", "E", "I"
        };

        String currentType;

        switch (type) {
            case DEBUG:
                currentType = types[0];
                break;

            case VERBOSE:
                currentType = types[1];
                break;

            case ERROR:
                currentType = types[2];
                break;

            default:
                currentType = types[3];
                break;
        }

        String currentPrefix = String.format(prefix, currentType);

        System.out.println(currentPrefix + " > " + out);
    }
}
