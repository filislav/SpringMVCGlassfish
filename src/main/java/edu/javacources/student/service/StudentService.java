/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author slava
 */
@Service
public class StudentService {
   private static final Logger lg = LoggerFactory.getLogger(StudentService.class);
   
   public void simpleCall(){
       lg.info("CALLED!!!");
   }
   public StudentService(){
       
   }
}
