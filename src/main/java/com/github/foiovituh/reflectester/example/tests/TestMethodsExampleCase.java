package com.github.foiovituh.reflectester.example.tests;

import com.github.foiovituh.reflectester.models.TestClass;
import com.github.foiovituh.reflectester.models.TestMethod;

@TestClass
public class TestMethodsExampleCase {
    @TestMethod
    public static void trueEqualsTrue() {
        System.out.println(true == true);
    }
}
