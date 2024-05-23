package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static org.example.userinterface.FrameInicialPage.ACCEDER_CALCULADORA;

public class SaltarFrame implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACCEDER_CALCULADORA));
    }

    public static SaltarFrame paraUsarCalculadora(){
        return Tasks.instrumented(SaltarFrame.class);
    }
}
