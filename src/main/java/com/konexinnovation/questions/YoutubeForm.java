package com.konexinnovation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.konexinnovation.userinterfaces.youtubeform.YoutubeForm.SONGVALIDATION;

public class YoutubeForm implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (SONGVALIDATION.resolveFor(actor).containsText("Bruno Mars - Locked Out Of Heaven (Official Music Video)"));
    }

    public static YoutubeForm youtubeForm(){
        return new YoutubeForm();
    }
}
