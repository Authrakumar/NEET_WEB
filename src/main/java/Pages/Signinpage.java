package Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signinpage extends TestBase {
    @FindBy(id = "mobile_no")
    private WebElement fieldmob;

    @FindBy(id = "password")
    private WebElement fieldpwd;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[6]/div/button")
    private WebElement btnsigin;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[5]/a")
    private WebElement forgotlink;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[7]/a")
    private WebElement signuplink;


    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/div/div[3]/small")
    public WebElement errortextmob;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[3]/small")
    public WebElement errortextpwd;

    @FindBy(xpath = "/html/body/div[4]")
    public WebElement errorpopup;

    @FindBy(xpath ="//div[@class='sa-confirm-button-container']")
    public WebElement btnerrorok;

    public Signinpage entermobile(String mob){
        sendkeys(fieldmob,mob);
        return this;
    }
    public Signinpage enterpwd(String pwd){
        sendkeys(fieldpwd,pwd);
        return this;
    }
    public Homepage pressSignin(){
        click(btnsigin);
        return new Homepage();
    }
    public String geterrortext(WebElement e){
        return getAttribute(e,"Text");
    }
    public void errorok(WebElement e){
        click(e);
    }
    public Forgotpage forgotlink(){
        click(forgotlink);
        return new Forgotpage();
    }
    public Signuppage signuplink(){
        click(signuplink);
        return new Signuppage();
    }
    public Signinpage clearall() {
        clear(fieldmob);
        clear(fieldpwd);
        return this;
    }
}
