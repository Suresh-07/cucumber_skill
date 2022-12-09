package Runner_upskill;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = {"src/test/resources/login/skill.feature"},glue = {"definition_upskill"},tags= "@PostiveTesting")

public class runner_upskill extends AbstractTestNGCucumberTests {

}
