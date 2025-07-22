package pageObjectsUlloDGFIP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthentificationUser {
    
    @FindBy(linkText = "Se connecter")
    private WebElement connectButton;
    
    @FindBy(xpath = "//a[@href='front/login.jsp']")
    private WebElement loginLink;
    
    WebDriver driver;
    
    // Constructeur
    public AuthentificationUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // Méthode pour cliquer sur "Se connecter"
    public void clickSeConnecter() {
        connectButton.click();
    }
    
    // Méthode alternative par href
    public void clickLoginLink() {
        loginLink.click();
    }
}
