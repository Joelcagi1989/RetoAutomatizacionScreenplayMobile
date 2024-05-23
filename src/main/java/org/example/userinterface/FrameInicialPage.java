package org.example.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import co.com.devco.automation.mobile.locator.*;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class FrameInicialPage {

    public static final Locator ACCEDER_CALCULADORA_LOCATOR = locator()
    .withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout")
            .withIosAccesibilityId("1");
    public static Target ACCEDER_CALCULADORA =Target.the("acceder a calculadora").located(theElementBy(ACCEDER_CALCULADORA_LOCATOR));

}
