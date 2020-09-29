package Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTestpage extends TestBase {
    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/div/div[1]/h5")
    public WebElement Title;

    public void scolltilllogout() throws InterruptedException {
        WebElement element =driver.findElement(By.xpath("//*[@id=\"accordion-menu\"]/li[8]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }


}
