package Pages;

import com.qa.Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Testpage extends TestBase {


    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[1]/a/div/span")
    public WebElement T1;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[2]/a/div/span")
    public WebElement T2;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[3]/a/div/span")
    public WebElement T3;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[4]/a/div/span")
    public WebElement T4;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[5]/a/div/span")
    public WebElement T5;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[6]/a/div/span")
    public WebElement T6;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[7]/a/div/span")
    public WebElement T7;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[8]/a/div/span")
    public WebElement T8;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[9]/a/div/span")
    public WebElement T9;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[10]/a/div/span")
    public WebElement T10;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[11]/a/div/span")
    public WebElement T11;
    @FindBy(xpath = "//*[@id=\"home2\"]/div/div[12]/a/div/span")
    public WebElement T12;




    @FindBy(xpath = "//*[@id=\"redirect_tag\"]")
    private WebElement instruction;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div/div[1]/div[1]/ul/li[1]/p/span/span[2]")
    public WebElement count;

    @FindBy(xpath = "//*[@id=\"one\"]/ul/li[1] ")
    private WebElement firstoption;

    @FindBy(xpath = "//*[@id=\"subject-wrap\"]/div/div/div[2]/div/div[2]/button[2]")
    private WebElement btnsubmit;

    @FindBy(xpath = "//*[@id=\"product\"]/div/div[1]/div/h5/a/i ")
    public WebElement backarrowque;
    @FindBy(xpath = " //*[@id=\"product\"]/div/div[1]/div/div/a/img")
    public WebElement backarrowtest;

    @FindBy(xpath = "//*[@id=\"accordion-menu\"]/li[2]/a/span[2]")
    private WebElement homemenu;

    public void selecttest(WebElement e){
        click(e);
    }
    public void pressinstruction(){
        click(instruction);
    }
    public void pressfirstoption(){
        click(firstoption);
        scrollend();
    }
    public void pressSubmitbutton(){
        click(btnsubmit);
    }
    public void presshomemenu(){
        pageload();
        click(homemenu);
    }

}
