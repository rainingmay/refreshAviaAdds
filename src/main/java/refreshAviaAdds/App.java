package refreshAviaAdds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriverHelper.getDriver();
        WebDriverHelper.openBrowser();
        WebDriverHelper.getLink("http://www.avia-board.com/");
        WebElement login = WebDriverHelper.getDriver().findElement(By.name("login"));
        WebElement pass = WebDriverHelper.getDriver().findElement(By.name("passwd"));


        login.sendKeys("Yana.balatsko");
        pass.sendKeys("ComeTogether");

        WebElement submit = WebDriverHelper.getDriver().findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[5]/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input"));
        submit.click();
        WebDriverHelper.waitForPage();
        WebDriverHelper.getDriver().findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[5]/form/table/tbody/tr[3]/td/a[2]")).click();
        WebDriverHelper.waitForPage();
        WebDriverHelper.getDriver().findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[1]/input")).click();
        WebDriverHelper.getDriver().findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[4]/select")).click();
        WebDriverHelper.getDriver().findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[4]/select/option[2]")).click();
        WebDriverHelper.getDriver().findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[5]/input")).click();
        WebDriverHelper.waitForPage();
        WebDriverHelper.close();

    }
}
