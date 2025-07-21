package ulloDgfipTests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class UlloDgfipTests {
    static ChromeDriver driver;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoullo.zacocloud.com/jcms/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test001_accessTheSpecificSiteArea() {
        System.out.println("Page title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        Assertions.assertTrue(driver.getTitle().length() > 0);
        Assertions.assertTrue(driver.getCurrentUrl().contains("demoullo.zacocloud.com"));
    }

    @Test
    public void test002_accessTheSpecificSiteArea() {
        System.out.println("Page title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        Assertions.assertTrue(driver.getTitle().length() > 0);
        Assertions.assertTrue(driver.getCurrentUrl().contains("demoullo.zacocloud.com/jcms/pp_2021024/accueil"));
    }

    @AfterAll
    public static void tearDown() {
       // if (driver != null) {
            //driver.quit();
        //}
    }
}