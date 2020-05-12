package com.clown.design.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Designtopic implements Serializable {
    private Integer id;
    private String topic;
    private String description;
    private Integer dish_teacherId;
    private Integer guide_teacherId;
    private Integer status;
    private String fileUrl;
    private String fileName;

//    private List<Teacher> teachers;
    private Teacher dish_teacher;
    private Teacher guide_teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDish_teacherId() {
        return dish_teacherId;
    }

    public void setDish_teacherId(Integer dish_teacherId) {
        this.dish_teacherId = dish_teacherId;
    }

    public Integer getGuide_teacherId() {
        return guide_teacherId;
    }

    public void setGuide_teacherId(Integer guide_teacherId) {
        this.guide_teacherId = guide_teacherId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Teacher getDish_teacher() {
        return dish_teacher;
    }

    public void setDish_teacher(Teacher dish_teacher) {
        this.dish_teacher = dish_teacher;
    }

    public Teacher getGuide_teacher() {
        return guide_teacher;
    }

    public void setGuide_teacher(Teacher guide_teacher) {
        this.guide_teacher = guide_teacher;
    }
}
