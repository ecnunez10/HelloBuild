package com.google.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleSchear {
    public static final Target RESULTADOS = Target.the("campo de ingreso").locatedBy("(//* [@id='result-stats'])");
    public static final Target NO_ENCONTRADO = Target.the("campo de ingreso").locatedBy("((//*[@class='card-section'])");
    public static final Target BOTON = Target.the("campo de ingreso").locatedBy("(//input [@name='btnK'])[1]");


}
