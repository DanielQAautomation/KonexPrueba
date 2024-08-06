package com.konexinnovation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.konexinnovation.userinterfaces.youtubeform.YoutubeForm.*;

public class BrowseToYoutube implements Task {
    public BrowseToYoutube setCancion(String cancion) {
        this.cancion = cancion;
        return this;
    }

    private String cancion;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(CAJADETEXTOBUSCAR),
                Click.on(CAJADETEXTOBUSCAR),
                Enter.theValue(cancion).into(CAJADETEXTOBUSCAR),
                Click.on(BOTONBUSCAR),
                Click.on(CANCION)
                );

    }
    public static BrowseToYoutube browseToYoutube(){
        return new BrowseToYoutube();
    }
}
