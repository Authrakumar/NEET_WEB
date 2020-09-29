package Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends TestBase {
    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement one;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement two;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement three;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div[1]/a/div/div/div/h5")
    public WebElement four;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[5]/a/span[2]")
    private WebElement changepassword;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[7]/a/span[2]")
    public WebElement contactus;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[4]/a/span[2]")
    public WebElement mytest;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[8]/a")
    private WebElement logout;

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
    }
}
