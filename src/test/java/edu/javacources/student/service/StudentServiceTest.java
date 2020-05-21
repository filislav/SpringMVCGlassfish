/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.service;

import edu.javacources.student.rest.StudentController;
import edu.javacources.student.view.StudentRequest;
import edu.javacources.student.view.StudentResponce;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author slava
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:springContext.xml"}) //можно через запятую несколько контекстов
public class StudentServiceTest {
    private static final Logger lg = LoggerFactory.getLogger(StudentServiceTest.class);
    
    @Autowired
    private StudentController studentController;

    @Test
    public void studentInfo() {
        StudentRequest req = new StudentRequest();
        req.setLastName("fil");
        req.setFirstName("slava");
        req.setMiddleName("vic");
        req.setDateOfBirth(LocalDate.of(2000,4,12));
        req.setPassportSeries("1111");
        req.setPassportNumber("222222");
        req.setPassportDate(LocalDate.of(2016,5,9));
        
        List<StudentResponce> info = studentController.getStudentInfo(req);
        
        Assert.assertTrue(info.size()>0);
    }
    
}
