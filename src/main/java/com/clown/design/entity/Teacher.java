package com.clown.design.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private Integer id;
    private String teacherName;
    private Integer expertiseId;
    private Integer collegeId;
    private String password;
    private String jobNumber;

    private Expertise expertise;
    private College college;

    public Integer getId() {
        return id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Integer getExpertiseId() {
        return expertiseId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public String getPassword() {
        return password;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public Expertise getExpertise() {
        return expertise;
    }

    public College getCollege() {
        return college;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setExpertiseId(Integer expertiseId) {
        this.expertiseId = expertiseId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void setExpertise(Expertise expertise) {
        this.expertise = expertise;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
