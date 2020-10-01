package Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Homepage extends TestBase {
    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement one;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement two;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement three;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement four;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[5]/a/div/div/div/h5")
    public WebElement five;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[5]/a/span[2]")
    private WebElement changepassword;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[7]/a/span[2]")
    public WebElement contactus;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[4]/a/span[2]")
    public WebElement mytest;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[8]/a")
    private WebElement logout;

    @FindBy(xpath = "//*[@id=\"bd-logout\"]/div/div/div[1]/div/div")
    private WebElement logoutpop;

    @FindBy(xpath = "//*[@id=\"bd-logout\"]/div/div/div[2]/div/button[2]")
    private WebElement logoutok;

    @FindBy(css = "#first_slider > div.owl-wrapper-outer > div > div:nth-child(1) > div > a > div > h5")
    public WebElement Recentfirst;

    @FindBy(xpath = "//*[@id=\"three_slider\"]/div[1]/div/div[1]/div/a/img")
    public WebElement Latest;

    public void selectsub(WebElement e){
        click(e);
    }

    public void changepassword(){
       elementtoeclickable(changepassword);
    }
    public void contactus(){
        elementtoeclickable(contactus);
    }
    public void mytest(){
        elementtoeclickable(mytest);
    }
    public void logout(){
        elementtoeclickable(logout);
        waitForVisibility(logoutpop);
        String popup=logoutpop.getText();
        System.out.println(popup);
        Assert.assertTrue(popup.contains("Are you sure you want to logout?"));
        click(logoutok);
    }
    public void scolltilllogout() throws InterruptedException {
        WebElement element =driver.findElement(By.xpath("//*[@id=\"accordion-menu\"]/li[8]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }
}
