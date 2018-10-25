import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHerokuapp {
    private WebDriver driver;
    private By usernameLogin = By.name("username");
    private By passwordLogin = By.name("password");
    private By signInButton = By.className("radius");

    public PageHerokuapp(WebDriver driver) {
        this.driver = driver;
        driver.get("http://the-internet.herokuapp.com/login");
    }

    public void loginWith(String username, String password) {
        driver.findElement(usernameLogin).sendKeys(username);
        driver.findElement(passwordLogin).sendKeys(password);
        driver.findElement(signInButton).click();
    }

}
