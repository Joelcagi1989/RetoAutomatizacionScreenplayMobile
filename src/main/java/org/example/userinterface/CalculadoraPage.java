package org.example.userinterface;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class CalculadoraPage {
    public static final Locator BOTON_NUMERO_CINCO_LOCATOR = locator()
            .withAndroidId("com.miui.calculator:id/btn_5_s")
            .withIosAccesibilityId("1");

    public static final Locator BOTON_NUMERO_SIETE_LOCATOR = locator()
            .withAndroidId("com.miui.calculator:id/btn_7_s")
            .withIosAccesibilityId("1");

    public static final Locator VALOR_TOTAL_LOCATOR = locator()
            .withAndroidId("com.miui.calculator:id/result")
            .withIosAccesibilityId("1");
    public static final Locator BOTON_SUMA_LOCATOR = locator()
            .withAndroidAccesibilityId("plus")
            .withIosAccesibilityId("1");
    public static final Locator BOTON_RESTA_LOCATOR = locator()
            .withAndroidAccesibilityId("minus")
            .withIosAccesibilityId("1");
    public static final Locator BOTON_MULTIPLICACION_LOCATOR = locator()
            .withAndroidAccesibilityId("multiply")
            .withIosAccesibilityId("1");
    public static final Locator BOTON_IGUAL_LOCATOR = locator()
            .withAndroidAccesibilityId("equals")
            .withIosAccesibilityId("1");


    public static Target BOTON_NUMERO_CINCO=Target.the("boton numero cinco").located(theElementBy(BOTON_NUMERO_CINCO_LOCATOR));
    public static Target BOTON_NUMERO_SIETE=Target.the("boton numero siete").located(theElementBy(BOTON_NUMERO_SIETE_LOCATOR));
    public static Target VALOR_TOTAL=Target.the("valor total").located(theElementBy(VALOR_TOTAL_LOCATOR));
    public static Target BOTON_SUMA=Target.the("boton suma").located(theElementBy(BOTON_SUMA_LOCATOR));
    public static Target BOTON_RESTA=Target.the("boton resta").located(theElementBy(BOTON_RESTA_LOCATOR));
    public static Target BOTON_MULTIPLICACION=Target.the("boton multiplicacion").located(theElementBy(BOTON_MULTIPLICACION_LOCATOR));
    public static Target BOTON_IGUAL=Target.the("boton igual").located(theElementBy(BOTON_IGUAL_LOCATOR));

}
