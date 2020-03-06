package com.lixiangyan.entity;

import java.util.Date;

public class Task {
    private Integer id;

    private Integer taToId;

    private Integer taStuId;

    private Integer taTeaId;

    private Date taDate;

    private String taStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaToId() {
        return taToId;
    }

    public void setTaToId(Integer taToId) {
        this.taToId = taToId;
    }

    public Integer getTaStuId() {
        return taStuId;
    }

    public void setTaStuId(Integer taStuId) {
        this.taStuId = taStuId;
    }

    public Integer getTaTeaId() {
        return taTeaId;
    }

    public void setTaTeaId(Integer taTeaId) {
        this.taTeaId = taTeaId;
    }

    public Date getTaDate() {
        return taDate;
    }

    public void setTaDate(Date taDate) {
        this.taDate = taDate;
    }

    public String getTaStatus() {
        return taStatus;
    }

    public void setTaStatus(String taStatus) {
        this.taStatus = taStatus == null ? null : taStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taToId=").append(taToId);
        sb.append(", taStuId=").append(taStuId);
        sb.append(", taTeaId=").append(taTeaId);
        sb.append(", taDate=").append(taDate);
        sb.append(", taStatus=").append(taStatus);
        sb.append("]");
        return sb.toString();
    }
}