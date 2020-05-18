/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.service;

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
    private StudentService studentService;

    @Test
    public void simpleTest() {
        studentService.simpleCall();
        lg.info("DONE!!!");
    }
    
}
