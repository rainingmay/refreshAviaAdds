package refreshAviaAdds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class CommonRefresh {
    public static void flagma() throws InterruptedException {

        WebDriverHelper.getLink(Data.flagma());
        String loginButton = "loginLink";
        WebDriverHelper.findElementBy(By.id(loginButton)).click();
        WebDriverHelper.waitForPage();
        WebDriverHelper.findElementBy(By.id("Dialog_username")).sendKeys(Data.flagmaLogin());
        WebDriverHelper.findElementBy(By.id("Dialog_password")).sendKeys(Data.flagmaPass());
        WebDriverHelper.findElementBy(By.className("button-reg")).click();
        try {
            WebDriverHelper.waitForPage(5);
        } catch (InterruptedException e) {
            WebDriverHelper.refreshBrowser();
        }

//        WebDriverHelper.findElementBy(By.className("button-reg delete-messages wauto20")).click();



            WebDriverHelper.findElementBy(By.id("my-flagma-link")).click();
            WebDriverHelper.refreshBrowser();

            WebDriverHelper.waitForPage();
            WebDriverHelper.findElementBy(By.xpath(".//*[@id='main-center']/table/tbody/tr[3]/td[1]/div/a[1]")).click();
            WebDriverHelper.refreshBrowser();

            WebDriverHelper.waitForPage();
            //WebDriverHelper.findElementBy(By.xpath(".//*[@id='main-center']/div[4]/div[2]/div/a[1]")).click();
            //mark all
            WebDriverHelper.findElementBy(By.xpath(".//*[@id='main-center']/div[4]/div[1]/div/ins")).click();
            //refresh
            WebDriverHelper.findElementBy(By.xpath(".//*[@id='main-center']/div[4]/input[1]")).click();
            //confirm
            WebDriverHelper.findElementBy(By.xpath(".//*[@id='confirm-dialog']/input[1]")).click();

            WebDriverHelper.waitForPage(5);
            //mark all
            WebDriverHelper.findElementBy(By.xpath(".//*[@id='main-center']/div[4]/div[1]/div/ins")).click();
            //refresh
            WebDriverHelper.findElementBy(By.xpath(".//*[@id='main-center']/div[4]/input[1]")).click();
            //confirm
            WebDriverHelper.waitForPage(5);
            WebDriverHelper.findElementBy(By.xpath(".//*[@id='confirm-dialog']/input[1]")).click();


//    WebElement login = WebDriverHelper.findElementBy(By.name("login"));
//    WebElement pass = WebDriverHelper.findElementBy(By.name("passwd"));
//    login.sendKeys("Yana.balatsko");
//    pass.sendKeys("Co");
//
//    WebElement submit = WebDriverHelper.findElementBy(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[5]/form/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input"));
//        submit.click();
//        WebDriverHelper.waitForPage();
//        WebDriverHelper.findElementBy(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[5]/form/table/tbody/tr[3]/td/a[2]")).
//
//        WebDriverHelper.waitForPage();
//        WebDriverHelper.findElementBy(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[1]/input")).
//
//        WebDriverHelper.findElementBy(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[4]/select")).
//
//        WebDriverHelper.findElementBy(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[4]/select/option[2]")).
//
//        WebDriverHelper.findElementBy(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[3]/form/table[2]/tbody/tr/td[5]/input")).
//
//        WebDriverHelper.waitForPage();
        }
}


