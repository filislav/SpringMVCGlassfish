/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacources.student.dao;

import edu.javacources.student.domain.Student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

/**
 *
 * @author slava
 */
@Component
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("SELECT st from Student st WHERE st.lastName=:lastName AND"
            + " st.firstName=:firstName AND st.middleName =:middleName AND "
            + "st.dateOfBirth =:dateOfBirth AND st.passportSeria =:passportSeria"
            + " AND st.passportNumber=:passportNumber AND st.passportDate = :passportDate")
    List<Student> findStudent(@Param("lastName")String lastName,
                              @Param("firstName")String firstName,
                              @Param("middleName")String middleName,
                              @Param("dateOfBirth")LocalDate dateOfBirth,
                              @Param("passportSeria")String passportSeria,
                              @Param("passportNumber")String passportNumber,
                              @Param("passportDate")LocalDate passportDate);
    

}
