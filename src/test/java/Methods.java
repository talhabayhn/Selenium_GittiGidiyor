import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

    Logger log = Logger.getLogger(Methods.class);

    public static WebDriver webDriver(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        return driver;
    }
    public static WebDriver driver = webDriver();
    WebDriverWait wait = new WebDriverWait(driver,10,1000);

    WebElement findElement(By by)
    {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    void clickElement(By by)
    {
        findElement(by).click();
    }

    String getUrl(){
        return driver.getCurrentUrl();
    }

    void goUrl(String str)
    {
        driver.get(str);
    }

}
