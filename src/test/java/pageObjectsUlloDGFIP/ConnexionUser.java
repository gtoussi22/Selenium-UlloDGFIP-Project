package pageObjectsUlloDGFIP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConnexionUser {
    @FindBy(name = "JCMS_login")
    private WebElement CompteUtilisateur;


    @FindBy(name = "JCMS_password")
    private WebElement Password;

    @FindBy(name = "JCMS_opLogin")
    private WebElement Identifier;

    WebDriver driver;
    //constructeur
    public ConnexionUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void CompteUser(){
        CompteUtilisateur.click();
        CompteUtilisateur.sendKeys("admin");
    }

    public void passwordUser(){
        Password.click();
        Password.sendKeys("Ullo2022!");

    }
    public void identifierUser(){
        Identifier.click();
    }

    

}
