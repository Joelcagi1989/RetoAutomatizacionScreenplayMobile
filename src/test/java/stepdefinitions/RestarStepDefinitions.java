package stepdefinitions;

import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.models.TestDataModel;
import org.example.tasks.RealizarResta;
import org.example.tasks.SaltarFrame;

import java.util.List;


public class RestarStepDefinitions {

    @Cuando("^realiza la operacion resta$")
    public void realizaLaOperacionResta(List<TestDataModel> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SaltarFrame.paraUsarCalculadora(),
                RealizarResta.de(data));
    }

}
