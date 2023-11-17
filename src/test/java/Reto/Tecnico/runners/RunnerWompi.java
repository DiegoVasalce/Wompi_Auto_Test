package Reto.Tecnico.runners;

import Reto.Tecnico.utils.ExcelData.BeforeSuite;
import Reto.Tecnico.utils.ExcelData.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(CustomRunner.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "Reto.Tecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = ""
)

public class RunnerWompi {
        @BeforeSuite
            public static void test() throws IOException, InvalidFormatException {
                DataToFeature.overrideFeatureFiles("./src/test/resources/features/pago_nequi.feature");
                DataToFeature.overrideFeatureFiles("./src/test/resources/features/pago_pse.feature");
                DataToFeature.overrideFeatureFiles("./src/test/resources/features/pago_transferencia.feature");
            }
    }



