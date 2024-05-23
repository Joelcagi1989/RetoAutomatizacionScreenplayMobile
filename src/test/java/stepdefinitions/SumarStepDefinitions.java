package stepdefinitions;

import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.models.TestDataModel;
import org.example.tasks.SaltarFrame;
import org.example.tasks.RealizarSuma;

import java.util.List;


public class SumarStepDefinitions {

    @Cuando("^realiza la operacion suma$")
    public void realizaLaOperacionSuma(List<TestDataModel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SaltarFrame.paraUsarCalculadora(),
                RealizarSuma.de(data));
    }
}
