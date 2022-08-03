import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@dealFinder",
        plugin = {"pretty","html:target/testreport.html"})
public class Run {
}
