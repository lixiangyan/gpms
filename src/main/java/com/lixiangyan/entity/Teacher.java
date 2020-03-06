package com.lixiangyan.entity;

import java.util.Date;

public class Teacher {
    private Integer id;

    private Integer tNum;

    private String tPassword;

    private String tName;

    private String tGender;

    private String tBirthday;

    private Date tDate;

    private Integer tState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettNum() {
        return tNum;
    }

    public void settNum(Integer tNum) {
        this.tNum = tNum;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettGender() {
        return tGender;
    }

    public void settGender(String tGender) {
        this.tGender = tGender == null ? null : tGender.trim();
    }

    public String gettBirthday() {
        return tBirthday;
    }

    public void settBirthday(String tBirthday) {
        this.tBirthday = tBirthday == null ? null : tBirthday.trim();
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public Integer gettState() {
        return tState;
    }

    public void settState(Integer tState) {
        this.tState = tState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tNum=").append(tNum);
        sb.append(", tPassword=").append(tPassword);
        sb.append(", tName=").append(tName);
        sb.append(", tGender=").append(tGender);
        sb.append(", tBirthday=").append(tBirthday);
        sb.append(", tDate=").append(tDate);
        sb.append(", tState=").append(tState);
        sb.append("]");
        return sb.toString();
    }
}