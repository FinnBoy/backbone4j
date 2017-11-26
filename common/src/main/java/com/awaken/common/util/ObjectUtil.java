package com.awaken.common.util;

import com.awaken.common.constant.Constants;
import org.apache.commons.lang3.ObjectUtils;

public abstract class ObjectUtil extends ObjectUtils {

    /**
     * Determine the class name for the given object.
     * <p>Returns {@code "null"} if {@code obj} is {@code null}.
     *
     * @param obj the object to introspect (may be {@code null})
     * @return the corresponding class name
     */
    public static String nullSafeClassName(Object obj) {
        return (obj != null ? obj.getClass().getName() : Constants.NULL_STRING);
    }
}
