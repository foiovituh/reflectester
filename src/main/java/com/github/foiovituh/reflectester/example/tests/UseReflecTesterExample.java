package com.github.foiovituh.reflectester.example.tests;

import com.github.foiovituh.reflectester.engine.ReflecTester;

public class UseReflecTesterExample {
    public static void main(String[] args) {
        final ReflecTester reflecTester = new ReflecTester(
                TestMethodsExampleCase.class.getName()
        );
        
        reflecTester.run();
    }
}
