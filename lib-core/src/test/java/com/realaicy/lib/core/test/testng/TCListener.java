package com.realaicy.lib.core.test.testng;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

/**
 * Created by realaicy on 2016/2/22.
 *
 */
public class TCListener  extends TestListenerAdapter {

    @Override
    public void onStart(ITestContext testContext) {
        System.out.println(testContext.getName()+"###################");
    }
}