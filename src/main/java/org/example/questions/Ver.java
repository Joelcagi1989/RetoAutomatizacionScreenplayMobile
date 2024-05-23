package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.example.userinterface.CalculadoraPage.VALOR_TOTAL;

public class Ver implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultado = actor.recall("ResultadoOperacion");
        return VALOR_TOTAL.resolveFor(actor).getText().equalsIgnoreCase(resultado);
    }

    public static Ver el(){
        return new Ver();
    }
}
