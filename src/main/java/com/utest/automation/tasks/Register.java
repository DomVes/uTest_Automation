package com.utest.automation.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.utest.automation.userinterface.RegisterUI;
import com.utest.automation.utils.Excel;

import java.io.IOException;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {

    Excel excel = new Excel();

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Try-Catch To Use the 'leerDatoExcel' methods because add the IOException
        try{
            actor.attemptsTo(
                    JavaScriptClick.on(RegisterUI.BTN_JOIN_US),
                    WaitUntil.the(RegisterUI.BTN_NEXT, isVisible()),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,0)).into(RegisterUI.TXT_FIRST_NAME),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,1)).into(RegisterUI.TXT_LAST_NAME),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,2)).into(RegisterUI.TXT_EMAIL),
                    Click.on(RegisterUI.BTN_MONTH),
                    Click.on(RegisterUI.BTN_MY_MONTH),
                    Click.on(RegisterUI.BTN_DAY),
                    Click.on(RegisterUI.BTN_MY_DAY),
                    Click.on(RegisterUI.BTN_YEAR),
                    Click.on(RegisterUI.BTN_MY_YEAR),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,3)).into(RegisterUI.TXT_LANGUAGE),
                    Click.on(RegisterUI.BTN_LANGUAGE),
                    JavaScriptClick.on(RegisterUI.BTN_NEXT),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,4)).into(RegisterUI.TXT_CITY),
                    Click.on(RegisterUI.BTN_CITY),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,5)).into(RegisterUI.TXT_CODE),
                    Click.on(RegisterUI.BTN_SELECT_COUNTRY),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,6)).into(RegisterUI.TXT_COUNTRY),
                    Click.on(RegisterUI.BTN_COUNTRY),
                    JavaScriptClick.on(RegisterUI.BTN_NEXT2),
                    Click.on(RegisterUI.BTN_SELECT_PHONE),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,9)).into(RegisterUI.TXT_PHONE),
                    Click.on(RegisterUI.BTN_PHONE),
                    Click.on(RegisterUI.BTN_SELECT_MODEL),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,10)).into(RegisterUI.TXT_MODEL),
                    Click.on(RegisterUI.BTN_MODEL),
                    Click.on(RegisterUI.BTN_SELECT_OS_PHONE),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,11)).into(RegisterUI.TXT_OS_PHONE),
                    Click.on(RegisterUI.BTN_OS_PHONE),
                    JavaScriptClick.on(RegisterUI.BTN_NEXT3),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,12)).into(RegisterUI.TXT_PASSWORD),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,12)).into(RegisterUI.TXT_CONFIRM_PASSWORD),
                    Click.on(RegisterUI.CHECK_BOX_TERMS),
                    Click.on(RegisterUI.CHECK_BOX_PRIVACY),
                    JavaScriptClick.on(RegisterUI.BTN_COMPLETE),
                    WaitUntil.the(RegisterUI.SUCCESSFULLY,isVisible())
                    );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static Register onuTest(){
        return Instrumented.instanceOf(Register.class).withProperties();
    }
}
