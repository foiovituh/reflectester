package com.github.foiovituh.reflectester.example.tests;

import com.github.foiovituh.reflectester.annotations.TestClass;
import com.github.foiovituh.reflectester.annotations.TestMethod;

@TestClass
public class TestMethodsExampleCase {
    @TestMethod
    public static void trueEqualsTrue() {
        System.out.println(true == true);
    }
}
