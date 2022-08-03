package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.LoginPage;
import br.com.chronosAcademy.pages.NewAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class NewAccountSteps {

    NewAccountPage newAccountPage;
    String username;
    @Dado("que a pagina new account esteja sendo exibida")
    public void queAPaginaNewAccountEstejaSendoExibida() {
        newAccountPage = new NewAccountPage();
        Driver.getDriver().get("https://advantageonlineshopping.com/#/");
        Driver.getDriver().get("https://advantageonlineshopping.com/#/register");
        Assert.assertEquals("CREATE ACCOUNT", newAccountPage.getTextNewAccount());

    }
    @Quando("os campos de cadastro estiverem preenchidos com")
    public void osCamposDeCadastroEstiveremPreenchidosCom(Map<String, String> map) {
        username = map.get("username");
        newAccountPage.setInpUsername(map.get("username"));
        newAccountPage.setInpEmail(map.get("email"));
        newAccountPage.setInpPassword(map.get("password"));
        newAccountPage.setInpConfirmPassword(map.get("password"));
        newAccountPage.selectCountry(map.get("country"));
        newAccountPage.clickInpIagree();
        newAccountPage.clickBtnRegister();
    }
    @Então("deve ser possivel logar no sistema apos o cadastro")
    public void deveSerPossivelLogarNoSistemaAposOCadastro() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(username, loginPage.getUsuarioLogado());
    }
}
