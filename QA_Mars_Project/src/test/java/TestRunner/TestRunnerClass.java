package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:target/CucumberReport.html"},
        features = "src/test/java/FeatureFile"
        , glue = {"StepDefinition" , "hooks"}
)

public class TestRunnerClass
{

}
