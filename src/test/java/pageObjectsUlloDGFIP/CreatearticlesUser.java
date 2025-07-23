package pageObjectsUlloDGFIP;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class CreatearticlesUser {
WebDriver driver;

@FindBy(linkText = "Ajouter un article")
private WebElement AjouterArticles;

@FindBy(xpath = "//span[contains(@class, 'jalios-icon') and contains(@class, 'icomoon-more2')]")
private WebElement ClickMenuIcon;

@FindBy(className ="jnews-btn-label")
private WebElement ChooseImageFromMedia;

@FindBy(xpath = "//*[contains(text(), 'Images')]")
private WebElement ImageFolder;

@FindBy(css = ".btn.btn-primary.confirm-image-crop")
private WebElement ButtonClick;

public CreatearticlesUser(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

public void CreateArticle(){
AjouterArticles.click();
}

public void MenuIcon() throws InterruptedException{

     // Attendre que l'overlay disparaisse
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

       // Attendre que l'overlay ne soit plus "is-active"
    wait.until(ExpectedConditions.invisibilityOfElementLocated(
        By.cssSelector("div.article-overlay.is-active")));
    ClickMenuIcon.click();
}

public void ChooseImageFromMediaLibrary(){
    ChooseImageFromMedia.click();
}

public void ImageFolderClick() throws InterruptedException {
    Thread.sleep(3000);
    
    System.out.println("=== DIAGNOSTIC DE LA PAGE ===");
    System.out.println("URL actuelle: " + driver.getCurrentUrl());
    System.out.println("Titre: " + driver.getTitle());
    
    // Voir TOUS les textes sur la page
    List<WebElement> allElements = driver.findElements(By.xpath("//*[text()]"));
    
    System.out.println("\n=== TOUS LES TEXTES SUR LA PAGE ===");
    for (int i = 0; i < Math.min(allElements.size(), 20); i++) {
        WebElement el = allElements.get(i);
        String text = el.getText().trim();
        if (!text.isEmpty() && text.length() < 50) {
            System.out.println("- '" + text + "' (" + el.getTagName() + ")");
        }
    }
    
    // Chercher spécifiquement des mots liés aux images/dossiers
    System.out.println("\n=== RECHERCHE SPÉCIFIQUE ===");
    
    String[] searchTerms = {"image", "Image", "images", "Images", "folder", "dossier", "fichier", "media", "jpg", "png"};
    
    for (String term : searchTerms) {
        try {
            List<WebElement> found = driver.findElements(By.xpath("//*[contains(text(), '" + term + "')]"));
            if (found.size() > 0) {
                System.out.println("Trouvé '" + term + "': " + found.size() + " éléments");
                for (int i = 0; i < Math.min(found.size(), 3); i++) {
                    System.out.println("  - '" + found.get(i).getText() + "'");
                }
            }
        } catch (Exception e) {
            // Ignorer les erreurs
        }
    }
}
 public void ButtonClick1(){
    ButtonClick.click();
 }


}
