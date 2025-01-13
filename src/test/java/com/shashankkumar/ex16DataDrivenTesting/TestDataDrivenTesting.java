package com.shashankkumar.ex16DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenTesting {


    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin123@gmail.com","pass@123"},
                new Object[]{"admin1@gmail.com", "pass1234"}
        };
    }

    @Test(dataProvider = "getData")
    public void test_login(String name, String password){
        System.out.println("name is : "+name+" password is : "+password);
    }
}
