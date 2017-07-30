package com.awaken.web.excel;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractCachingViewResolver;

import java.util.Locale;

public class ExcelViewResolver extends AbstractCachingViewResolver {

    @Override
    protected View loadView(String viewName, Locale locale) throws Exception {


        return null;
    }
}
