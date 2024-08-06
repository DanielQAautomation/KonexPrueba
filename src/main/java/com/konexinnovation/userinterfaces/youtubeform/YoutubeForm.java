package com.konexinnovation.userinterfaces.youtubeform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class YoutubeForm extends PageObject {

    public static final Target CAJADETEXTOBUSCAR = Target.the("Caja de texto buscar").located(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
    public static final Target BOTONBUSCAR = Target.the("Botón de busqueda").located(By.id("search-icon-legacy"));
    public static final Target CANCION = Target.the("Canción").located(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
    public static final Target SONGVALIDATION = Target.the("Elemento de validación").located(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[2]/ytd-watch-metadata/div/div[1]/h1/yt-formatted-string"));



}
