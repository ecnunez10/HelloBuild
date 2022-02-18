package com.google.Tasks;

import com.google.userinterface.GoogleHome;
import com.google.userinterface.GoogleSchear;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class IngresoDatosBusquedaGoogle {

    public static Performable realizaBusqueda ( String datos){
        return Task.where(
                "buscar datos",
                Enter.theValue(datos).into(GoogleHome.BARRA_GOOGLE),
                Hit.the(Keys.ENTER).into(GoogleHome.BARRA_GOOGLE)
        );

    }

}
