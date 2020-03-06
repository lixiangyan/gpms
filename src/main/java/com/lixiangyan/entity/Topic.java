package com.lixiangyan.entity;

import java.util.Date;

public class Topic {
    private Integer id;

    private String toName;

    private String toType;

    private String toNature;

    private String toRemark;

    private String toSource;

    private String toStatus;

    private String toIntro;

    private String toCondition;

    private Integer toTeaId;

    private Integer toStuId;

    private Date toDate;

    private String toState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType == null ? null : toType.trim();
    }

    public String getToNature() {
        return toNature;
    }

    public void setToNature(String toNature) {
        this.toNature = toNature == null ? null : toNature.trim();
    }

    public String getToRemark() {
        return toRemark;
    }

    public void setToRemark(String toRemark) {
        this.toRemark = toRemark == null ? null : toRemark.trim();
    }

    public String getToSource() {
        return toSource;
    }

    public void setToSource(String toSource) {
        this.toSource = toSource == null ? null : toSource.trim();
    }

    public String getToStatus() {
        return toStatus;
    }

    public void setToStatus(String toStatus) {
        this.toStatus = toStatus == null ? null : toStatus.trim();
    }

    public String getToIntro() {
        return toIntro;
    }

    public void setToIntro(String toIntro) {
        this.toIntro = toIntro == null ? null : toIntro.trim();
    }

    public String getToCondition() {
        return toCondition;
    }

    public void setToCondition(String toCondition) {
        this.toCondition = toCondition == null ? null : toCondition.trim();
    }

    public Integer getToTeaId() {
        return toTeaId;
    }

    public void setToTeaId(Integer toTeaId) {
        this.toTeaId = toTeaId;
    }

    public Integer getToStuId() {
        return toStuId;
    }

    public void setToStuId(Integer toStuId) {
        this.toStuId = toStuId;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getToState() {
        return toState;
    }

    public void setToState(String toState) {
        this.toState = toState == null ? null : toState.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", toName=").append(toName);
        sb.append(", toType=").append(toType);
        sb.append(", toNature=").append(toNature);
        sb.append(", toRemark=").append(toRemark);
        sb.append(", toSource=").append(toSource);
        sb.append(", toStatus=").append(toStatus);
        sb.append(", toIntro=").append(toIntro);
        sb.append(", toCondition=").append(toCondition);
        sb.append(", toTeaId=").append(toTeaId);
        sb.append(", toStuId=").append(toStuId);
        sb.append(", toDate=").append(toDate);
        sb.append(", toState=").append(toState);
        sb.append("]");
        return sb.toString();
    }
}