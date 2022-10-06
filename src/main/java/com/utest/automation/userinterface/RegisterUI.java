package com.utest.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {

    public static final Target BTN_JOIN_US = Target.the("Button Register").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target TXT_FIRST_NAME = Target.the("Input First Name").locatedBy("//input[@id='firstName']");
    public static final Target TXT_LAST_NAME = Target.the("Input Last Name").locatedBy("//input[@id='lastName']");
    public static final Target TXT_EMAIL = Target.the("Input Email Address").locatedBy("//input[@id='email']");
    public static final Target BTN_MONTH = Target.the("Select Month of birth").locatedBy("//select[@id='birthMonth']");
    public static final Target BTN_MY_MONTH = Target.the("My Month").locatedBy("//option[@label ='April']");
    public static final Target BTN_DAY = Target.the("Select Day of birth").locatedBy("//select[@id='birthDay']");
    public static final Target BTN_MY_DAY = Target.the("Select My Day of birth").locatedBy("//option[@label ='1']");
    public static final Target BTN_YEAR = Target.the("Select Year of birth").locatedBy("//select[@id='birthYear']");
    public static final Target BTN_MY_YEAR = Target.the("Select My Year of birth").locatedBy("//option[@label ='1997']");
    public static final Target TXT_LANGUAGE = Target.the("Select Second Language").locatedBy("//input[@type='search']");
    public static final Target BTN_LANGUAGE = Target.the("Button Language").locatedBy("//span[@class='ui-select-highlight']");
    public static final Target BTN_NEXT = Target.the("Button Next").locatedBy("//a[@class='btn btn-blue']");
    public static final Target TXT_CITY = Target.the("Input City").locatedBy("//input[@id='city']");
    public static final Target BTN_CITY = Target.the("Select City").locatedBy("//span[contains(text(),'Medellin, Antioquia, Colombia')]");
    public static final Target TXT_CODE = Target.the("Input Postal Code").locatedBy("//input[@id='zip']");
    public static final Target BTN_SELECT_COUNTRY = Target.the("Button Select Countries").locatedBy("//span[@class='ui-select-match-text pull-left']");
    public static final Target TXT_COUNTRY = Target.the("Input Country").locatedBy("//input[@placeholder='Select a country']");
    public static final Target BTN_COUNTRY = Target.the("Button Country").locatedBy("//span[@class='ui-select-choices-row-inner']");
    public static final Target BTN_NEXT2 = Target.the("Button Next 2").locatedBy("//a[@class='btn btn-blue pull-right']");
    public static final Target BTN_SELECT_PHONE = Target.the("Button Select Phone").locatedBy("//span[contains(text(),'Select Brand')]");
    public static final Target TXT_PHONE = Target.the("Input Phone").locatedBy("//input[@placeholder='Select Brand']");
    public static final Target BTN_PHONE = Target.the("Button Phone").locatedBy("//span[@class='ui-select-choices-row-inner']");
    public static final Target BTN_SELECT_MODEL = Target.the("Button Select Model").locatedBy("//span[contains(text(),'Select a Model')]");
    public static final Target TXT_MODEL = Target.the("Input Model").locatedBy("//input[@placeholder='Select a Model']");
    public static final Target BTN_MODEL = Target.the("Button Model").locatedBy("//span[@class='ui-select-choices-row-inner']");
    public static final Target BTN_SELECT_OS_PHONE = Target.the("Button Select OS Phone").locatedBy("//div[@ng-model='registrationData.mobileDevice.handsetOSId']");
    public static final Target TXT_OS_PHONE = Target.the("Input OS Phone").locatedBy("//div[@name='handsetOSId']//descendant::input[@aria-owns]");
    public static final Target BTN_OS_PHONE = Target.the("Button OS Phone").locatedBy("//span[@class='ui-select-choices-row-inner']");
    public static final Target BTN_NEXT3 = Target.the("Button Next 3").locatedBy("//a[@class='btn btn-blue pull-right']");
    public static final Target TXT_PASSWORD = Target.the("Input PassWord").locatedBy("//input[@id='password']");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Input Confirm PassWord").locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK_BOX_TERMS = Target.the("Accept Terms and conditions").locatedBy("//span[@ng-class='{error: userForm.termOfUse.$error.required}']");
    public static final Target CHECK_BOX_PRIVACY = Target.the("Accept Privacy and Security").locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static final Target BTN_COMPLETE = Target.the("Button Complete").locatedBy("//a[@class='btn btn-blue']");
    public static final Target SUCCESSFULLY = Target.the("Button To Confirm Login").locatedBy("//a[@class='btn btn-filled btn-yellow btn-block btn-welcome']");








}
