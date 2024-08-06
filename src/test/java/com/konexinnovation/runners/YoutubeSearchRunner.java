package com.konexinnovation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/youtubeSearch.feature",
        glue = "com.konexinnovation.stepdefinitions",
        tags = "not @ignore"

)
public class YoutubeSearchRunner {

}
