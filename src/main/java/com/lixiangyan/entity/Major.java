package com.lixiangyan.entity;

import java.util.Date;

public class Major {
    private Integer id;

    private String mName;

    private Date mDate;

    private Integer mDeptId;

    private String mState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Integer getmDeptId() {
        return mDeptId;
    }

    public void setmDeptId(Integer mDeptId) {
        this.mDeptId = mDeptId;
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState == null ? null : mState.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mName=").append(mName);
        sb.append(", mDate=").append(mDate);
        sb.append(", mDeptId=").append(mDeptId);
        sb.append(", mState=").append(mState);
        sb.append("]");
        return sb.toString();
    }
}