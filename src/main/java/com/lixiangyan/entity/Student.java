package com.lixiangyan.entity;

import java.util.Date;

public class Student {
    private Integer id;

    private Integer sNum;

    private String sPassword;

    private String sName;

    private String sGender;

    private String sBirthday;

    private Date sDate;

    private Integer sClassId;

    private String sGrade;

    private Integer sState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsNum() {
        return sNum;
    }

    public void setsNum(Integer sNum) {
        this.sNum = sNum;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender == null ? null : sGender.trim();
    }

    public String getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(String sBirthday) {
        this.sBirthday = sBirthday == null ? null : sBirthday.trim();
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public Integer getsClassId() {
        return sClassId;
    }

    public void setsClassId(Integer sClassId) {
        this.sClassId = sClassId;
    }

    public String getsGrade() {
        return sGrade;
    }

    public void setsGrade(String sGrade) {
        this.sGrade = sGrade == null ? null : sGrade.trim();
    }

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sNum=").append(sNum);
        sb.append(", sPassword=").append(sPassword);
        sb.append(", sName=").append(sName);
        sb.append(", sGender=").append(sGender);
        sb.append(", sBirthday=").append(sBirthday);
        sb.append(", sDate=").append(sDate);
        sb.append(", sClassId=").append(sClassId);
        sb.append(", sGrade=").append(sGrade);
        sb.append(", sState=").append(sState);
        sb.append("]");
        return sb.toString();
    }
}