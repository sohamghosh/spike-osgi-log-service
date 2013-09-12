package org.motechproject.spike.log.service;

import org.osgi.service.log.LogService;

import java.text.MessageFormat;

import static org.osgi.service.log.LogService.LOG_DEBUG;
import static org.osgi.service.log.LogService.LOG_ERROR;
import static org.osgi.service.log.LogService.LOG_INFO;
import static org.osgi.service.log.LogService.LOG_WARNING;

public class MotechLogService {

    private org.osgi.service.log.LogService logService;

    public void debug(String pattern, String... args) {
        String message = MessageFormat.format(pattern, args);
        logService.log(LOG_DEBUG, message);
    }

    public void debug(Throwable cause, String pattern, String... args) {
        String message = MessageFormat.format(pattern, args);
        logService.log(LOG_DEBUG, message, cause);
    }

    public void info(String pattern, String... args) {
        String message = MessageFormat.format(pattern, args);
        logService.log(LOG_INFO, message);
    }

    public void warn(String pattern, String... args) {
        String message = MessageFormat.format(pattern, args);
        logService.log(LOG_WARNING, message);
    }

    public void warn(Throwable cause, String pattern, String... args) {
        String message = MessageFormat.format(pattern, args);
        logService.log(LOG_WARNING, message, cause);
    }

    public void error(String pattern, String... args) {
        String message = MessageFormat.format(pattern, args);
        logService.log(LOG_ERROR, message);
    }

    public void error(Throwable cause, String pattern, String... args) {
        String message = MessageFormat.format(pattern, args);
        logService.log(LOG_ERROR, message, cause);
    }

    public void setLogService(LogService logService) {
        this.logService = logService;
    }
}
