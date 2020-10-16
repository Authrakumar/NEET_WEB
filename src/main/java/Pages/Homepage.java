package Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Homepage extends TestBase {
    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement one;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[2]/a/div/div/div")
    public WebElement two;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[3]/a/div/div/div")
    public WebElement three;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[4]/a/div/div/div")
    public WebElement four;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[5]/a/div/div/div/h5")
    public WebElement QBank;

    //----Menu------//
  //  @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[3]/a/span[2]")
    public void menuclick() {
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"accordion-menu\"]/li[3]/a/span[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
    }
    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[5]/a/span[2]")
    private WebElement changepassword;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[7]/a/span[2]")
    public WebElement contactus;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[4]/a/span[2]")
    public WebElement mytest;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[8]/a/span[2]")
    private WebElement logout;

    @FindBy(xpath = "//*[@id=\"bd-logout\"]/div/div/div[1]/div/div")
    private WebElement logoutpop;

    @FindBy(xpath = "//*[@id=\"bd-logout\"]/div/div/div[2]/div/button[2]")
    private WebElement logoutok;

    @FindBy(css = "#first_slider > div.owl-wrapper-outer > div > div:nth-child(1) > div > a > div > h5")
    public WebElement Recentfirst;

    @FindBy(xpath = "//*[@id=\"three_slider\"]/div[1]/div/div[1]/div/a/img")
    public WebElement Latest;

    @FindBy(xpath = "//p[@class='pt-1' and not(@disable)]")
    public WebElement title;


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
}
