package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports","json:src/cucumber-reports/reports.json"},features="src/test/resources/skeleton/casestudy1.feature",monochrome = true,dryRun=false)
//@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports","json:src/cucumber-reports/reports.jason"},features="src/test/resources/skeleton/casestudy3.feature",monochrome = true,dryRun=false)

public class Run_cucumber {

}
