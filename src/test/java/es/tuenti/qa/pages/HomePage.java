package es.tuenti.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage {

    WebDriver driver;
    By profilesIcon = By.cssSelector("li.c026:nth-child(6) > a:nth-child(1)");
    By nameField = By.cssSelector("fieldset.c0298:nth-child(1) > div:nth-child(2) > div:nth-child(1)");
    By misAgendasIcon = By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div/nav/ul/li[4]/a");
    By misAgendas = By.cssSelector(".c0298 > ul:nth-child(2)");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProfiles(){
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(profilesIcon).click();
    }

    public void clickMisAgendas(){
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(misAgendasIcon).click();
    }

    public void checkName(String name) {
        String nameRecovered = driver.findElement(nameField).getText().toString();
        Assert.assertEquals(name, nameRecovered);
    }

    public void checkAgenda(String name) {
        List<WebElement> allElements = driver.findElements(misAgendas);

        for (WebElement element: allElements) {
            System.out.println(element.getText());
        }
    }
}
