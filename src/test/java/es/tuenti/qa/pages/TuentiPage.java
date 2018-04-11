package es.tuenti.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TuentiPage {

    WebDriver driver;

    By entrarbutton = By.xpath("/html/body/div[1]/div[1]/ul/li[5]/a");

    public TuentiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEntrar(){
        driver.findElement(this.entrarbutton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
