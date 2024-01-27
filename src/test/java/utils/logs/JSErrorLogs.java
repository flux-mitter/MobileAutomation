package utils.logs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import io.appium.java_client.AppiumDriver;

public class JSErrorLogs {
    public static LogEntries getLogs(WebDriver driver) {
        return driver.manage().logs().get(LogType.BROWSER);
    }

    public static Boolean isLoginErrorLog(AppiumDriver driver) {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        return logEntries.getAll().stream()
                .anyMatch(logEntry -> logEntry.getMessage().contains("An invalid email address was specified"));
    }
}
