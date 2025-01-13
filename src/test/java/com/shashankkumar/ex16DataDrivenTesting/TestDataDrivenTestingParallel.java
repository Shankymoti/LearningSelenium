package com.shashankkumar.ex16DataDrivenTesting;

import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenTestingParallel {

    @DataProvider(name = "LoginData1", parallel = true)
    public Object[][] getData1(){
        return new Object[][]{
         new Object[]{"shashank.k@gami.com", "pass@123"},
         new Object[]{"shashank.kumar@gmail.com","Pass@1234"}
        };
    }

    @DataProvider(name ="LoginData2", parallel = true)
    public Object[][] getData2(){
        return new Object[][]{
                new Object[]{"shashankkuamr89@gmail.com","password4"},
                new Object[]{"shanky1@gmail.com","Pass@1234"},
                new Object[]{"shashank.k@gmail.com", "Pass@1345"}
        };
    }


    @Test(dataProvider = "LoginData1")
    public void testLogin(String name, String password){
        System.out.println(name+ " | "+password);
    }

    @Test(dataProvider = "LoginData2")
    public void testLogin2(String name, String password){
        System.out.println(name +" and "+ password);
    }
}
