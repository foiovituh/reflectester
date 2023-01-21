package com.github.foiovituh.reflectester.utils;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import static java.util.stream.Collectors.toSet;

public final class Assertor {
    private Assertor() {
    }
    
    public static boolean checkIfStringAreNotNullOrEmptyOrBlank(String string) {
        return string != null && !string.isBlank();
    }
    
    public static boolean checkIfCollectionAreNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }
    
    public static boolean checkIfAllElementsInListAreSame(List<?> list) {
        return !checkIfCollectionAreNullOrEmpty(list)
                && 1 == list.stream()
                        .collect(toSet())
                        .size();
    }
    
    public static boolean checkIfBooleanEqualsTrue(Boolean booleanToCompare) {
        if (booleanToCompare == null) {
            return false;
        }
        
        return Objects.equals(Boolean.TRUE, booleanToCompare);
    }
}
