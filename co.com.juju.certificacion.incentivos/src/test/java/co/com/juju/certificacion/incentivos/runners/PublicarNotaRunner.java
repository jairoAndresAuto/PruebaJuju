package co.com.juju.certificacion.incentivos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregar_publicación.feature",
        glue = "co.com.juju.certificacion.incentivos.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class PublicarNotaRunner {
}
