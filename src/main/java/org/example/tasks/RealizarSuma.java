package org.example.tasks;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.TestDataModel;

import java.util.List;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.example.userinterface.CalculadoraPage.*;

public class RealizarSuma implements Task {
    private List<TestDataModel> data;

    public RealizarSuma(List<TestDataModel> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Locator VALOR_UNO_LOCATOR = locator()
                .withAndroidId("com.miui.calculator:id/btn_"+ data.get(0).getValorUno() + "_s")
                .withIosAccesibilityId("1");

        Locator VALOR_DOS_LOCATOR = locator()
                .withAndroidId("com.miui.calculator:id/btn_"+ data.get(0).getValorDos() +"_s")
                .withIosAccesibilityId("1");
        Target VALOR_UNO=Target.the("valor 1").located(theElementBy(VALOR_UNO_LOCATOR));
        Target VALOR_DOS=Target.the("valor 2").located(theElementBy(VALOR_DOS_LOCATOR));

        actor.attemptsTo(
                WaitUntil.the(VALOR_UNO, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(VALOR_UNO),
                Click.on(BOTON_SUMA),
                Click.on(VALOR_DOS),
                Click.on(BOTON_IGUAL)
                );
        int resultadoOperacion = Integer.parseInt(data.get(0).getValorUno());
        resultadoOperacion = resultadoOperacion + Integer.parseInt(data.get(0).getValorDos());
        actor.remember("ResultadoOperacion", "= "+resultadoOperacion);
    }

    public static RealizarSuma de(List<TestDataModel> data){
        return Tasks.instrumented(RealizarSuma.class, data);
    }
}
