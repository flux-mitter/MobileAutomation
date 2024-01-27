package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//package utils.extentreports;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentManager {
//    public static final ExtentReports extentReports = new ExtentReports();
//    public synchronized static ExtentReports createExtentReports() {
//        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
//        reporter.config().setReportName("Sample Extent Report");
//        extentReports.attachReporter(reporter);
//        extentReports.setSystemInfo("Blog Name", "SW Test Academy");
//        extentReports.setSystemInfo("Author", "Onur Baskirt");
//        return extentReports;
//    }
//}

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("Sample Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Blog Name", "SW Test Academy");
        extentReports.setSystemInfo("Author", "Onur Baskirt");
        return extentReports;
    }
}