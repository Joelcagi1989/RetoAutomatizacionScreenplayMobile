package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.example.utils.exceldata.BeforeSuite;
import org.example.utils.exceldata.DataToFeature;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/restar.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RestarRunner {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/restar.feature");
    }
}
