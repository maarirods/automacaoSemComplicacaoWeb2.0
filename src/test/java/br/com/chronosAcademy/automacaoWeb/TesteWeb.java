package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.enums.Browser;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;


    @Before
    public void inicializaTeste() {
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
        driver.get("https://chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }


    @Test
    public void primeiroTeste() {
        // section[2]/div[3]/div/div/div/div/div[1]/div/h4
        assertEquals("Porque Tempo É Conhecimento", principalPage.getTitulo());
    }


    @Test
    public void segundoTeste(){
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        assertEquals("Conheça todos os nossos cursos", cursoPage.getTitulo2());
    }


    @After
    public void finalizaTeste() {
        driver.quit();
    }

}
