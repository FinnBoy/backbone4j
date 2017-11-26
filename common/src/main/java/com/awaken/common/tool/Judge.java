package com.awaken.common.tool;

import com.awaken.common.util.CollectionUtil;
import com.awaken.common.util.StringUtil;

import java.util.Collection;
import java.util.Map;

public class Judge {

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNotNull(Object object) {
        return !isNull(object);
    }

    public static boolean isEmpty(String string) {
        return StringUtil.isEmpty(string);
    }

    public static boolean isEmpty(Collection collection) {
        return CollectionUtil.isEmpty(collection);
    }

    public static boolean isEmpty(Map map) {
        return CollectionUtil.isEmpty(map);
    }

    public static boolean isEmpty(Object[] objects) {
        return isNull(objects) || objects.length == 0;
    }

    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }

    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

    public static boolean isNotEmpty(Object[] objects) {
        return !isEmpty(objects);
    }

    public static boolean isBlank(String string) {
        return StringUtil.isBlank(string);
    }

    public static boolean isNotBlank(String string) {
        return StringUtil.isNotBlank(string);
    }

    public static boolean isInstance(Class<?> type, Object obj) {
        return isNotNull(type) && type.isInstance(obj);
    }

    public static boolean isAssignable(Class<?> superType, Class<?> subType) {
        return isNotNull(superType) && isNotNull(subType) && superType.isAssignableFrom(subType);
    }
}
