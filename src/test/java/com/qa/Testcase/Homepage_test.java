package com.qa.Testcase;

import Pages.Homepage;
import Pages.Signinpage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Homepage_test {
    Homepage homepage;

    @BeforeMethod
    public void beforeMethod(Method m)
    {
        homepage=new Homepage();
        System.out.println("\n" + "****** Starting Test:"+ m.getName() +"*****"+"\n");
    }
    @Test
    public void attenttestone(){
        homepage.selectsub(homepage.one);
    }
}
