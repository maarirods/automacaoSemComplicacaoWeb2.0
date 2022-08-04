package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.EditAccountMap;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
    EditAccountMap editAccountMAp;

    public EditAccountPage() {
        editAccountMAp = new EditAccountMap();
        PageFactory.initElements(Driver.getDriver(), editAccountMAp);
    }

    public void setFirstName(String firstName) {
        Driver.visibilityOf(editAccountMAp.inpFirstName);
        editAccountMAp.inpFirstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        editAccountMAp.inpLastName.sendKeys(lastName);
    }

    public void clickBtnSave() {
        editAccountMAp.btnSave.click();
    }

}
