package com.qa.Testcase;

import Pages.*;
import com.qa.Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.GmailQuickstart;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

public class Resetpasswordpage_test extends TestBase {
    Signinpage signinpage;
    Resetpasswordpage resetpasswordpage;
    Forgotpage forgotpage;
    Otpforgotpage otpforgotpage;
    GmailQuickstart gmailQuickstart;
    @BeforeMethod
    public void beforeMethod(Method m) {
        resetpasswordpage = new Resetpasswordpage();
        signinpage = new Signinpage();
        forgotpage=new Forgotpage();
        otpforgotpage=new Otpforgotpage();
        gmailQuickstart=new GmailQuickstart();
        System.out.println("\n" + "****** Starting Test:" + m.getName() + "*****" + "\n");
    }

    @Test(priority = 1)
    public void gotoresetpage() throws InterruptedException, IOException, GeneralSecurityException {
        signinpage.forgotlink();
        forgotpage.entermobile("8667651940");
        forgotpage.pressSubmit();
        otpforgotpage.enterotp(gmailQuickstart.getmailotp());
        otpforgotpage.pressproceed();
        softAssert(resetpasswordpage.Resettitle.getText(),"RESET PASSWORD");
    }

    @Test(priority = 2)
    public void emptypwd() throws InterruptedException, AWTException {
        resetpasswordpage.pressSubmitbutton();
        System.out.println(resetpasswordpage.popup.getText());
        Assert.assertTrue(resetpasswordpage.popup.getText().contains("Please Enter Password"));
        click(resetpasswordpage.popupok);

    }

    @Test(priority = 3)
    public void pwdonly() throws InterruptedException, AWTException {
        resetpasswordpage.enterpwd("abc@123");
        resetpasswordpage.pressSubmitbutton();
        System.out.println(resetpasswordpage.popup.getText());
        Assert.assertTrue(resetpasswordpage.popup.getText().contains("Please Enter Confirm Password"));
        Thread.sleep(2000);
        click(resetpasswordpage.popupok);
        resetpasswordpage.clearall();
    }

    @Test(priority = 4)
    public void invalidpwd() throws InterruptedException, AWTException {
        // homepage.changepassword();
        resetpasswordpage.enterpwd("abc123");
        resetpasswordpage.enterconpwd("abc123");
        resetpasswordpage.pressSubmitbutton();
        System.out.println(resetpasswordpage.popup.getText());
        Assert.assertTrue(resetpasswordpage.popup.getText().contains("Invalid Password"));
        Thread.sleep(2000);
        click(resetpasswordpage.popupok);
        resetpasswordpage.clearall();
    }

    @Test(priority = 5)
    public void pwdnotmatch() throws InterruptedException, AWTException {
        //  homepage.changepassword();
        resetpasswordpage.enterpwd("abc@123");
        resetpasswordpage.enterconpwd("abc@12345");
        resetpasswordpage.pressSubmitbutton();
        System.out.println(resetpasswordpage.popup.getText());
        Assert.assertTrue(resetpasswordpage.popup.getText().contains("Password doesn't match"));
        Thread.sleep(2000);
        click(resetpasswordpage.popupok);
        resetpasswordpage.clearall();
    }

    @Test(priority = 6)
    public void resetsamepwd() throws InterruptedException, AWTException {
        //  homepage.changepassword();
        resetpasswordpage.enterpwd("abc@123");
        resetpasswordpage.enterconpwd("abc@123");
        resetpasswordpage.pressSubmitbutton();
        System.out.println(resetpasswordpage.popup.getText());
        Assert.assertTrue(resetpasswordpage.popup.getText().contains("Looks you set the old password again ! Please set a new one"));
        Thread.sleep(2000);
        click(resetpasswordpage.popupok);
        resetpasswordpage.clearall();
    }

    @Test(priority = 7)
    public void resetpwd() throws InterruptedException, AWTException {
        //  homepage.changepassword();
        resetpasswordpage.enterpwd("abc@12345");
        resetpasswordpage.enterconpwd("abc@12345");
        resetpasswordpage.pressSubmitbutton();
        System.out.println(resetpasswordpage.popup.getText());
        Assert.assertTrue(resetpasswordpage.popup.getText().contains("Password Reset Successfully..!"));
        Thread.sleep(2000);
        click(resetpasswordpage.popupok);
    }

//    @Test(priority = 9)
//    public void logout() throws InterruptedException {
//        scrolltillend();
//        homepage.logout();
//    }
}
