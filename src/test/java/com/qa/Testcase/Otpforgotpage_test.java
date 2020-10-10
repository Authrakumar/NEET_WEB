package com.qa.Testcase;

import Pages.Forgotpage;
import Pages.Otpforgotpage;
import Pages.Signinpage;
import com.qa.Base.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class Otpforgotpage_test extends TestBase {
   Signinpage signinpage;
   Forgotpage forgotpage;
   Forgotpage_test forgotpage_test;
   Otpforgotpage otpforgotpage;
   @BeforeMethod
    public void beforeMethod(Method m)
    {
        signinpage=new Signinpage();
        forgotpage=new Forgotpage();
        otpforgotpage=new Otpforgotpage();
        forgotpage_test=new Forgotpage_test();
        System.out.println("\n" + "****** Starting Test:"+ m.getName() +"*****"+"\n");
    }
    @Test
    public void otptitlecheck() throws InterruptedException {
        signinpage.forgotlink();
        softAssert(forgotpage.title.getText(),"FORGOT PASSWORD");

        softAssert(otpforgotpage.otptitle.getText(),"OTP VERIFICATION");
    }
}
