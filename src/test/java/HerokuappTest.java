import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HerokuappTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lilias\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void successLoginHerokuapp()
    {
        PageHerokuapp loginPage =  new PageHerokuapp(driver);
        loginPage.loginWith("mail@mail.am", "Password");

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
