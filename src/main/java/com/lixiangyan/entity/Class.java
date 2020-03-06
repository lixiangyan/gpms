package com.lixiangyan.entity;

import java.util.Date;

public class Class {
    private Integer id;

    private String cName;

    private Date cDate;

    private Integer cMajorId;

    private String cState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Integer getcMajorId() {
        return cMajorId;
    }

    public void setcMajorId(Integer cMajorId) {
        this.cMajorId = cMajorId;
    }

    public String getcState() {
        return cState;
    }

    public void setcState(String cState) {
        this.cState = cState == null ? null : cState.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cName=").append(cName);
        sb.append(", cDate=").append(cDate);
        sb.append(", cMajorId=").append(cMajorId);
        sb.append(", cState=").append(cState);
        sb.append("]");
        return sb.toString();
    }
}