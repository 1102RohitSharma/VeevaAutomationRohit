package com.veeva.test.testsuits;


//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//com//veeva//test//features//CoreProduct.feature",
        glue = {"src//test//com//veeva//test//stedefinition"},
        plugin = {"pretty",
                "html:target/cucumber-reports/Cucumber.json",
                "json:target/cucumber-reports/Cucumber.json"
                },
        monochrome = true
)
@Test
public class Runner extends AbstractTestNGCucumberTests {
}
