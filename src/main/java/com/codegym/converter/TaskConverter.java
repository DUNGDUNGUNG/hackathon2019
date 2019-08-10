package com.codegym.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TaskConverter implements Converter<String, LocalDate> {

    private String timeOfTask;

    public TaskConverter(String timeOfTask){
        this.timeOfTask=timeOfTask;
    }
    @Override
    public LocalDate convert(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern(timeOfTask));
        }catch (DateTimeParseException e){
            throw new IllegalArgumentException("invalid date format.Please use thi pattern \""
            + timeOfTask + "\"");
        }
    }
}
