package Demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_C2a.05.01\\workspace\\new\\Arti_1\\src\\resources\\java\\Case_4.feature",
plugin={"html:target/report"})
public class NewTest {
}
