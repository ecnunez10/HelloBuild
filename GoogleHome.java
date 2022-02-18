package com.google.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class GoogleHome extends PageObject {


    public static final Target BARRA_GOOGLE = Target.the("campo de ingreso").locatedBy("//input [@name='q']");
    public static final Target BOTON = Target.the("campo de ingreso").locatedBy("(//input [@name='btnK'])[2]i");
}
