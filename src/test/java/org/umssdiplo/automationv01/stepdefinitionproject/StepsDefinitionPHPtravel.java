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

    //--------------------------Ver detalle del artefacto ---------------------------------------

    @Given("^'SisSecurity' page inventario is loaded$")
    public void sissecurityPageInventarioIsLoaded() {
        ssiService = LoadPage.loginPage();
    }

    @And("^choose option one click 'Ver detalles' on page inventario$")
    public void chooseOptionOneClickVerDetallesOnPageInventario() {
        ssiService.clickVerArtefacto();
    }

    // ----------------------------Eliminar artefacto  ----------------------------------------------
    @Given("^'SisSecurity' page Inventario es ta cargado$")
    public void sissecurityPageInventarioEsTaCargado() {
        ssiService = LoadPage.loginPage();
    }

    @And("^choose option one click 'Dar de baja' on page inventario$")
    public void chooseOptionOneClickDarDeBajaOnPageInventario() {
        ssiService.clickEliminar();
    }

    //---------------------------------Create Artefacto-------------------------------------------------
    @Given("^crear artefacto$")
    public void crearArtefacto() {
        ssiService = LoadPage.loginPage2();
    }

    @And("^agregar artefacto \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and (\\d+) on page formulario$")
    public void agregarArtefactoAndAndAndCantidadOnPageFormulario(String nombre, String modelo, String estado, int cantidad) throws Throwable {
        ssiService.create(nombre, modelo, estado, cantidad);
    }

    //****************************************************************************************************



}
