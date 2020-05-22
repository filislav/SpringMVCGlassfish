/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author slava
 */
public class LocalDateAdapter extends XmlAdapter<String,LocalDate>{

    private static final String PATTERN = "dd.MM.yyyy";
    @Override
    public LocalDate unmarshal(String s) throws Exception {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern(PATTERN));
    }

    @Override
    public String marshal(LocalDate date) throws Exception {
        return date.format(DateTimeFormatter.ofPattern(PATTERN));
    }
    
}
