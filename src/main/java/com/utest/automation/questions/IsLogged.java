package com.utest.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.utest.automation.userinterface.RegisterUI.SUCCESSFULLY;

public class IsLogged implements Question<String> {

    //This Method Get the Text on Login Xpath for Use in Compare Method
    @Override
    public String answeredBy(Actor actor) {
        return SUCCESSFULLY.resolveFor(actor).getText();
    }

    public static Question<String> onTheSite() {
        return new IsLogged();
    }
}
