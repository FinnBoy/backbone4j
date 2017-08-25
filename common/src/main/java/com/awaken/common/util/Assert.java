package com.awaken.common.util;

import com.awaken.common.exception.AssertException;

import java.util.Collection;
import java.util.Map;

public class Assert {

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new AssertException(message);
        }
    }

    public static void isTrue(boolean expression) {
        isTrue(expression, "[Assertion failed] - this expression must be true");
    }

    public static void isNull(Object object, String message) {
        isTrue(Judge.isNull(object), message);
    }

    public static void isNull(Object object) {
        isNull(object, "[Assertion failed] - the object argument must be null");
    }

    public static void notNull(Object object, String message) {
        isTrue(Judge.isNotNull(object), message);
    }

    public static void notNull(Object object) {
        notNull(object, "[Assertion failed] - this argument is required; it must not be null");
    }

    public static void hasLength(String text, String message) {
        isTrue(Judge.isNotEmpty(text), message);
    }

    public static void hasLength(String text) {
        hasLength(text,
                "[Assertion failed] - this String argument must have length; it must not be null or empty");
    }

    public static void hasText(String text, String message) {
        isTrue(Judge.hasText(text), message);
    }

    public static void hasText(String text) {
        hasText(text,
                "[Assertion failed] - this String argument must have text; it must not be null, empty, or blank");
    }

    public static void notEmpty(Object[] array, String message) {
        isTrue(Judge.isNotEmpty(array), message);
    }

    public static void notEmpty(Object[] array) {
        notEmpty(array, "[Assertion failed] - this array must not be empty: it must contain at least 1 element");
    }

    public static void notEmpty(Collection collection, String message) {
        isTrue(Judge.isNotEmpty(collection), message);
    }

    public static void notEmpty(Collection collection) {
        notEmpty(collection,
                "[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
    }

    public static void notEmpty(Map map, String message) {
        isTrue(Judge.isNotEmpty(map), message);
    }

    public static void notEmpty(Map map) {
        notEmpty(map, "[Assertion failed] - this map must not be empty; it must contain at least one entry");
    }

    public static void isInstanceOf(Class<?> type, Object obj, String message) {
        isTrue(Judge.isInstance(type, obj), message);
    }

    public static void isInstanceOf(Class<?> clazz, Object obj) {
        isInstanceOf(clazz, obj, "[Assertion failed] - Object of class [" + ObjectUtil.nullSafeClassName(obj) + "] must be an instance of " + clazz);
    }

    public static void isAssignable(Class<?> superType, Class<?> subType, String message) {
        isTrue(Judge.isAssignable(superType, subType), message);
    }

    public static void isAssignable(Class<?> superType, Class<?> subType) {
        isAssignable(superType, subType, "[Assertion failed] - " + subType + " is not assignable to " + superType);
    }

}
