package stepdefinitions;

import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.models.TestDataModel;
import org.example.tasks.RealizarMultiplicacion;
import org.example.tasks.SaltarFrame;

import java.util.List;

public class MultiplicarStepDefinitions {

        @Cuando("^realiza la operacion multiplicacion$")
        public void realizaLaOperacionMultiplicacion(List< TestDataModel > data) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    SaltarFrame.paraUsarCalculadora(),
                    RealizarMultiplicacion.de(data));
        }
}
