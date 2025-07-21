package pageObjectsUlloDGFIP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accessTheSpecificSiteArea {

     @FindBy(className = "name")
    private WebElement accessTheSpecificSiteArea;


    WebDriver driver;
    // constructeur
    public accessTheSpecificSiteArea(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickaccessTheSpecificSiteArea(){
        accessTheSpecificSiteArea.click();
    }
}
