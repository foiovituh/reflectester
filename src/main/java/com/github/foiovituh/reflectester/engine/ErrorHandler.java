package com.github.foiovituh.reflectester.engine;

import java.util.logging.Level;
import java.util.logging.Logger;

final class ErrorHandler {
    public static final void logAndExit(Logger logger, Level level, String message,
            Exception exception, int exitCode) {
        logger.log(level, message, exception);
        System.exit(exitCode);
    }
    
    public static final void handleTestClassAnnotationNotPresent(Logger logger,
            String className) {
        logAndExit(logger, Level.WARNING, "The " + className + " class must have "
                + "the @TestClass annotation!", new IllegalArgumentException(), 0);
    }
}
