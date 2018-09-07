package com.yejian.spring.model;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: 自定义一个日期转换
 * @date 2018/9/3 19:59
 */
public class DatePropertyEditor extends PropertyEditorSupport {

    private String datePattern;


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
//        super.setAsText(text);
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(getDatePattern());
        Date date = dateTimeFormatter.parseDateTime(text).toDate();
        setValue(date);
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
