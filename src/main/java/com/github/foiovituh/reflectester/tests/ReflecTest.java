package com.github.foiovituh.reflectester.tests;

import com.github.foiovituh.reflectester.models.AbstractTestModel;
import com.github.foiovituh.reflectester.models.TestAnnotation;

public class ReflecTest extends AbstractTestModel {
    @TestAnnotation
    public static void trueEqualsTrue() {
        System.out.println(true == true);
    }
}
