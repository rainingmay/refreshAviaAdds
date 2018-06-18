package refreshAviaAdds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by ybalatc on 6/23/2017.
 */
public class WebDriverHelper {

    private static volatile WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }

    public static void main() {

    }

    public static WebDriver openBrowser() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        return driver;
    }
    public static WebDriver refreshBrowser() {
        //driver = new ChromeDriver();
        driver.navigate().refresh();
        return driver;
    }

    public static void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        } else {
            System.out.println("Cant close session");
        }
    }


    public static void getLink(String string) {
        driver.get(string);
    };

//    public static void printUrl() {
//        System.out.println(driver.getCurrentUrl());
//    }

//    public void waitUntilElementVisible(WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, 10, 250);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }

    public static void waitForPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public static void waitForPage(int sec) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public static WebElement findElementBy(By by){
        WebElement element = getDriver().findElement(by);
        return element;
    }

//    public static void waitForElement(WebElement element) throws NoSuchElementException {
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }


//    @FindBy(name = "login")
//    private WebElement login;
//
//    @FindBy(name = "passwd")
//    private WebElement password;
//
//    @FindBy(xPath = "html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[5]/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
//    private WebElement Submit;


//    public WebDriverHelper (WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//}

}
