package stepdefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.questions.Ver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComunStepDefinitions {

    @Dado("^que (.*) quiere usar la calculadora$")
    public void queUsuarioQuiereUsarLaCalculadora(String actor) {
        OnStage.theActorCalled(actor).entersTheScene();
    }

    @Entonces("^debe ver el resultado$")
    public void debeVerElResultado() {
        OnStage.theActorInTheSpotlight().should(seeThat(Ver.el()));
    }

}
