package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.SSIService;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private SSIService ssiService;

    @Given("^'SisSecurity' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        ssiService = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        ssiService.setCredentials();
    }

    @And("^click 'Registrar Maquinaria' tab in 'Header' page$")
    public void clickRegistrarMaquinariaTabInHeaderPage() throws Throwable {
        ssiService.clickRegistrarMaquinariTab();
    }
}
