package com.lixiangyan.entity;

import java.util.Date;

public class Department {
    private Integer id;

    private String dName;

    private Date dDate;

    private String dState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public Date getdDate() {
        return dDate;
    }

    public void setdDate(Date dDate) {
        this.dDate = dDate;
    }

    public String getdState() {
        return dState;
    }

    public void setdState(String dState) {
        this.dState = dState == null ? null : dState.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dName=").append(dName);
        sb.append(", dDate=").append(dDate);
        sb.append(", dState=").append(dState);
        sb.append("]");
        return sb.toString();
    }
}