package com.shashankkumar.ex16DataDrivenTesting;

import org.testng.annotations.Test;

public class DataDrivenExcel {

    @Test(dataProvider = "getData",dataProviderClass = UtilExcel.class)
 public void testVWOLogin(String name, String password){
     System.out.println(name +" | "+password);
 }
}
