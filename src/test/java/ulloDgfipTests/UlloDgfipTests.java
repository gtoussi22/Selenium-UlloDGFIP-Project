package ulloDgfipTests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import io.github.bonigarcia.wdm.WebDriverManager;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class UlloDgfipTests {
 static ChromeDriver driver;

 @BeforeAll
 public static void SetUp(){
    WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoullo.zacocloud.com/jcms/");
        driver.manage().window().maximize();
 }


@AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

