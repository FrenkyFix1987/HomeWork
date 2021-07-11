package ui.steps;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target", "json:target/cucumber.json" },
        features = "src/test/resources/ui/features",
        glue = {"ui.steps"},
        tags = {"@1"}
)

public class RunTest {
}
