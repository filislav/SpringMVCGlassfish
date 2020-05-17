package edu.javacources.student.domain;

import javax.persistence.*;
import java.util.List;

@Table(name="sr_univercity")
@Entity
public class University {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="university_id")
    public Long universityId;
    @Column(name="university_name")
    public String univercityName;
    @OneToMany(cascade={CascadeType.REFRESH},fetch=FetchType.LAZY, mappedBy = "university")
    private List<Faculty> faculties;

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    public String getUnivercityName() {
        return univercityName;
    }

    public void setUnivercityName(String univercityName) {
        this.univercityName = univercityName;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}
