package com.qa.Testcase;

import Pages.Changepasswordpage;
import Pages.Homepage;
import Pages.Signinpage;
import Pages.Testpage;
import com.qa.Base.TestBase;
import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

public class Changepasswordpage_test extends TestBase {
    Signinpage signinpage;
    Changepasswordpage changepasswordpage;
    Homepage homepage;

    @BeforeMethod
    public void beforeMethod(Method m) {
        changepasswordpage = new Changepasswordpage();
        signinpage = new Signinpage();
        homepage = new Homepage();
        System.out.println("\n" + "****** Starting Test:" + m.getName() + "*****" + "\n");
    }

    @Test(priority = 1)
    public void Sigin() throws InterruptedException {
        signinpage.entermobile("8667651940");
        signinpage.enterpwd("abc@123");
        signinpage.pressSignin();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void emptypwd() throws InterruptedException, AWTException {
        homepage.changepassword();
        changepasswordpage.pressSubmitbutton();
        System.out.println(changepasswordpage.popup.getText());
        Assert.assertTrue(changepasswordpage.popup.getText().contains("Please Enter Password"));
        Thread.sleep(2000);
        keyboardenterkey();
    }

    @Test(priority = 3)
    public void pwdonly() throws InterruptedException, AWTException {
        changepasswordpage.enterpwd("abc@123");
        changepasswordpage.pressSubmitbutton();
        System.out.println(changepasswordpage.popup.getText());
        Assert.assertTrue(changepasswordpage.popup.getText().contains("Please Enter Confirm Password"));
        Thread.sleep(2000);
        changepasswordpage.keyboardenterkey();
        changepasswordpage.clearall();
    }

    @Test(priority = 4)
    public void invalidpwd() throws InterruptedException, AWTException {
        // homepage.changepassword();
        changepasswordpage.enterpwd("abc123");
        changepasswordpage.enterconpwd("abc123");
        changepasswordpage.pressSubmitbutton();
        System.out.println(changepasswordpage.popup.getText());
        Assert.assertTrue(changepasswordpage.popup.getText().contains("Invalid Password"));
        Thread.sleep(2000);
        keyboardenterkey();
        changepasswordpage.clearall();
    }

    @Test(priority = 5)
    public void pwdnotmatch() throws InterruptedException, AWTException {
        //  homepage.changepassword();
        changepasswordpage.enterpwd("abc@123");
        changepasswordpage.enterconpwd("abc@12345");
        changepasswordpage.pressSubmitbutton();
        System.out.println(changepasswordpage.popup.getText());
        Assert.assertTrue(changepasswordpage.popup.getText().contains("Password doesn't match"));
        Thread.sleep(2000);
        keyboardenterkey();
        changepasswordpage.clearall();
    }

    @Test(priority = 6)
    public void Changesamepwd() throws InterruptedException, AWTException {
        //  homepage.changepassword();
        changepasswordpage.enterpwd("abc@123");
        changepasswordpage.enterconpwd("abc@123");
        changepasswordpage.pressSubmitbutton();
        System.out.println(changepasswordpage.popup.getText());
        Assert.assertTrue(changepasswordpage.popup.getText().contains("Looks you set the old password again ! Please set a new one"));
        Thread.sleep(2000);
        keyboardenterkey();
        changepasswordpage.clearall();
    }

    @Test(priority = 7)
    public void Changepwd() throws InterruptedException, AWTException {
        //  homepage.changepassword();
        changepasswordpage.enterpwd("abc@12345");
        changepasswordpage.enterconpwd("abc@12345");
        changepasswordpage.pressSubmitbutton();
        System.out.println(changepasswordpage.popup.getText());
        Assert.assertTrue(changepasswordpage.popup.getText().contains("Password Changed Successfully!"));
        Thread.sleep(2000);
        keyboardenterkey();
    }

    @Test(priority = 8)
    public void help() throws InterruptedException, AWTException {
        homepage.changepassword();
        changepasswordpage.enterpwd("abc@123");
        changepasswordpage.enterconpwd("abc@123");
        changepasswordpage.pressSubmitbutton();
        System.out.println(changepasswordpage.popup.getText());
        Assert.assertTrue(changepasswordpage.popup.getText().contains("Password Changed Successfully!"));
        Thread.sleep(2000);
        keyboardenterkey();
    }
}

