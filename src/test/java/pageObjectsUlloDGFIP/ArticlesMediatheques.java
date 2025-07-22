package pageObjectsUlloDGFIP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ArticlesMediatheques {

    @FindBy(linkText = "Articles et Médiathèque")
    private WebElement ArticlesMediatheques;
    WebDriver driver;

public ArticlesMediatheques(WebDriver  driver) {
    this.driver =driver;
    PageFactory.initElements(driver, this);
}
 
public void ArticlesMediaUser(){
    ArticlesMediatheques.click();
}

}
