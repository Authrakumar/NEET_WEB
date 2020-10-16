package com.qa.Testcase;

import Pages.Homepage;
import Pages.MyTestpage;
import Pages.Signinpage;
import Pages.Signuppage;
import com.qa.Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.lang.reflect.Method;

public class Signuppage_test extends TestBase {
    Signinpage signinpage;
    MyTestpage myTestpage;
    Homepage homepage;
    Signuppage signuppage;
    @BeforeMethod
    public void beforeMethod(Method m)
    {
        signinpage=new Signinpage();
        myTestpage=new MyTestpage();
        homepage=new Homepage();
        signuppage=new Signuppage();
        System.out.println("\n" + "****** Starting Test:"+ m.getName() +"*****"+"\n");
    }

    @Test(priority = 1)
    public void gettitle(){
        signinpage.signuplink();
        softAssert(signuppage.signuptitle.getText(),"SIGN UP");
    }
    @Test(priority = 2)
    public void signinlinkcheck(){
        signuppage.signinlink();
        Assert.assertTrue(signinpage.signintitle.getText().contains("SIGN IN"));
        signinpage.signuplink();
        Assert.assertTrue(signuppage.signuptitle.getText().contains("SIGN UP"));
    }
    @Test(priority = 3)
    public void emptysigin() {
        signuppage.pressSignup();
        softAssert(signuppage.errortextmob.getText(),"Please Enter Mobile Number");
        softAssert(signuppage.errortextpwd.getText(),"Please Enter Password");
    }
    @Test(priority = 4)
    public void mobonlysigup()  {
        signuppage.entermobile("8667651940");
        signuppage.pressSignup();
        softAssert(signuppage.errortextpwd.getText(),"Please Enter Password");
    }
    @Test(priority = 6)
    public void pwdonlysigin()   {
        signuppage.clearall();
        signuppage.enterpwd("abc@123");
        signuppage.pressSignup();
        softAssert(signuppage.errortextmob.getText(),"Please Enter Mobile Number");
    }
    @Test(priority = 7)
    public void alreadyregistereduser() throws InterruptedException, AWTException {
        signuppage.clearall();
        signuppage.entermobile("8526348083");
        signuppage.enterpwd("abc@123");
        signuppage.pressSignup();
        String s1=signuppage.errorpopup.getText();
        Assert.assertTrue(s1.contains("User already exists, proceed to login"));
        click(signuppage.errorpopupok);
    }
    @Test(priority = 8)
    public void invalidpwd() throws AWTException {
        signuppage.clearall();
        signuppage.entermobile("8252224585");
        signuppage.enterpwd("abc123");
        signuppage.pressSignup();
        String s1=signuppage.errorpopup.getText();
        Assert.assertTrue(s1.contains("Invalid Password"));
        click(signuppage.errorpopupok);
    }
    @Test(priority = 9)
    public void Sigupusingvalidinputs() throws InterruptedException {
        signuppage.clearall();
        signuppage.entermobile("8667651940");
        signuppage.enterpwd("abc@123");
        signuppage.pressSignup();
        softAssert(signuppage.errorpopup.getText(),"Registered Successfully..!");
        click(signuppage.errorpopupok);
    }
}
