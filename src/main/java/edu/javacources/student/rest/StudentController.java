/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.rest;

import edu.javacources.student.view.StudentRequest;
import edu.javacources.student.view.StudentResponce;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;

/**
 *
 * @author slava
 */
@Component
@Path("/student")
public class StudentController {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public StudentResponce getStudentInfo(StudentRequest request){
        
    }
}
