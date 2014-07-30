import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by developer on 7/29/14.
 */


// Associates Cucumber JVM with the JUnit runner
    @RunWith (Cucumber.class)
    @Cucumber.Options(format={"pretty", "html:target/cucumber"})
//    @CucumberOptions
//            (format = { "html:target/cucumber - html  - report" , "json:target/cucumber - json - report.json" })
    public class CucumberTestRunner {
}
