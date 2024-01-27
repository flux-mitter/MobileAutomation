package utils.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.util.RetryAnalyzerCount;

import com.sun.net.httpserver.Authenticator.Retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
      //  annotation.setRetryAnalyzer(Retry.class);
    	annotation.setRetryAnalyzer((Class<? extends IRetryAnalyzer>) Retry.class);
    }
}