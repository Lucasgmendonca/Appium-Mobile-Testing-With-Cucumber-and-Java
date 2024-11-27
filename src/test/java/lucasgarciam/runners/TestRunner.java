package lucasgarciam.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    publish = true,
    features = "src/test/resources/features",
    glue = "lucasgarciam.stepdefinitions",
    plugin = {
        "pretty", 
        "html:target/cucumber-reports",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml" 
},
    monochrome = true
)
public class TestRunner {
}