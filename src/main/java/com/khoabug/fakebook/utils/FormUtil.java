package com.khoabug.fakebook.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;


import java.lang.reflect.InvocationTargetException;

public class FormUtil {

    public static <T> T toModel(Class<T> type, HttpServletRequest request) {
        T bean = null;
        try {
            bean = type.getConstructor().newInstance();
            BeanUtils.populate(bean, request.getParameterMap());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.print(e.getMessage());
        }
        return bean;
    }
}
