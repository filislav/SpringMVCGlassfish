/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.service;

import edu.javacources.student.dao.StudentRepository;
import edu.javacources.student.domain.Student;
import edu.javacources.student.domain.StudentDocument;
import edu.javacources.student.view.StudentRequest;
import edu.javacources.student.view.StudentResponce;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author slava
 */
@Service
public class StudentService {
   private static final Logger lg = LoggerFactory.getLogger(StudentService.class);
   
   @Autowired
   private StudentRepository studentRepository;
   
   @Transactional
   public List<StudentResponce> getStudentInfo(StudentRequest request){
        List<Student> student = studentRepository.findStudent(request.getLastName(),request.getFirstName(),
                request.getMiddleName(),request.getDateOfBirth(), 
                request.getPassportSeries(),request.getPassportNumber(), request.getPassportDate());
        if(student.isEmpty()){
            return Collections.EMPTY_LIST;
        }
        List<StudentDocument> docs = student.get(0).getDocuments();
        List<StudentResponce> result = docs.stream().map(d->getResponce(d)).collect(Collectors.toList());
        return result;
    }
   
   private StudentResponce getResponce(StudentDocument sd){
       StudentResponce sr = new StudentResponce();
       sr.setDocumentNumber(sd.getDocumentNumber());
       sr.setDocumentDate(sd.getDocumentDate());
       sr.setExpiredDate(sd.getExpiredDate());
       sr.setFacultyName(sd.getFaculty().getFacultyName());
       sr.setUnivercityName(sd.getFaculty().getUniversity().getUnivercityName());
       sr.setStudentForm(sd.getStudentForm().toString());
       
       return sr;
   }
}
