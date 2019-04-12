package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class SSIService extends BasePage {
    @FindBy(name = "email")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;


    //-----------------------------Ver Artefacto ------------------------------
    @FindBy(id = "ver")
    private WebElement VerAttefacto;
    //  ------------------------Eliminar Artefacto --------------------------
    @FindBy(id = "2")
    private WebElement Eliminar;
//    ------------------Crear Artefacto ---------------------------------

    @FindBy(id = "nombreArtefacto")
    private WebElement nombreArt;
    @FindBy(id = "modeloArtefacto")
    private WebElement modeloArt;
    @FindBy(id = "estadoArtefacto")
    private WebElement estadoArt;
    @FindBy(id = "cantidadArtefacto")
    private WebElement cantidadArt;
    @FindBy(id = "Add")
    private WebElement add;

    //   ---------------------- Login -------------------------------
    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }


    //    -------------------------------- Ver artefacto-------------------------------------
    public void clickVerArtefacto() {
        CommonEvents.clickButton(VerAttefacto);
    }

    //--------------------------------Eliminar Artefacto--------------------------------------
    public void clickEliminar() {
        CommonEvents.clickButton(Eliminar);
    }

    //---------------------------------Crear Artefacto-----------------------------------------
    public void create(String nombre, String modelo, String estado, int cantidad) {
        System.out.println("Imprimiendo = " + " - " + nombre + " - " + modelo + " - " + estado + " - " + cantidad + " - ");
        CommonEvents.setInputField(nombreArt, nombre);
        CommonEvents.setInputField(modeloArt, modelo);
        CommonEvents.setInputField(estadoArt, estado);
//        CommonEvents.setInputField(cantidadArt,cantidad);
        CommonEvents.clickButton(add);
    }

}
