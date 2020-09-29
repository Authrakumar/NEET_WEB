package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgotpage {
    @FindBy(id = "mobile_no")
    private WebElement edttxtmob;

    @FindBy(className= "btn btn-primary Backbtn px-3 mr-3 backLink")
    private WebElement btnback;

    @FindBy(id = "forgot_password_submit")
    private WebElement btnsubmit;

    @FindBy(xpath= "//*[@id=\"forgot_password\"]/div[1]/div/div[3]/small")
    private WebElement errortxt;

}
