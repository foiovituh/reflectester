package com.github.foiovituh.reflectester.tests;

import com.github.foiovituh.reflectester.ReflecTester;

public class ExampleTest {
    public static void main(String[] args) {
        final ReflecTester reflecTester = new ReflecTester(ReflecTest.class.getName());
        reflecTester.run();
    }
}
