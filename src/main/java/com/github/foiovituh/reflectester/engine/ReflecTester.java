package com.github.foiovituh.reflectester.engine;

import com.github.foiovituh.reflectester.annotations.TestClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;
import com.github.foiovituh.reflectester.annotations.TestMethod;

public class ReflecTester {
    private Class<?> clazz;
    
    public ReflecTester(String className) {
        try {
            this.clazz = Class.forName(className);
        } catch (ClassNotFoundException classNotFoundException) {
            // TODO: logs
            System.exit(0);
        }
    }
    
    public void run() {
        if (clazz.isAnnotationPresent(TestClass.class)) {
            Stream.of(clazz.getDeclaredMethods())
                    .forEach(method -> {
                        if (method.isAnnotationPresent(TestMethod.class)
                                && method.getParameterCount() == 0
                                && method.getReturnType() == void.class
                                && Modifier.isStatic(method.getModifiers())) {
                            try {
                                method.invoke(null);
                            } catch (IllegalAccessException
                                    | IllegalArgumentException
                                    | InvocationTargetException invokeMethodException) {
                                // TODO: logs
                            }
                        }
                    });
        } else {
            // TODO: logs
        }
    }
}
