/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.view;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author slava
 */
public class StudentRequest {
    private String firstName;
    private String lastName;
    private String middleName;
    @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
    private LocalDate dateOfBirth;
    private String passportNumber;
    private String passportSeries;
    @XmlJavaTypeAdapter(value=LocalDateAdapter.class)
    private LocalDate passportDate;
}
