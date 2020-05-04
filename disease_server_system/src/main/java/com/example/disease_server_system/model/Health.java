package com.example.disease_server_system.model;

import java.io.Serializable;
import java.util.Date;

/**
 * health
 * @author 
 */
public class Health implements Serializable {
    private Integer id;

    private Integer userId;

    /**
     * 本人身体状况
     */
    private String myPhysicalCondition;

    /**
     * 家人身体状况
     */
    private String familyPhysicalCondition;

    /**
     * 最近是否去过湖北（一个月内）
     */
    private Boolean huBei;

    /**
     * 最近是否出国（一个月内）
     */
    private Boolean abroad;

    /**
     * 是否有外国亲戚
     */
    private Boolean foreignRelatives;

    /**
     * 是否接触过疑似/确诊病例（一个月内）
     */
    private Boolean contactCase;

    /**
     * 最近是否接触到外国人员
     */
    private Boolean contactForeigner;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMyPhysicalCondition() {
        return myPhysicalCondition;
    }

    public void setMyPhysicalCondition(String myPhysicalCondition) {
        this.myPhysicalCondition = myPhysicalCondition;
    }

    public String getFamilyPhysicalCondition() {
        return familyPhysicalCondition;
    }

    public void setFamilyPhysicalCondition(String familyPhysicalCondition) {
        this.familyPhysicalCondition = familyPhysicalCondition;
    }

    public Boolean getHuBei() {
        return huBei;
    }

    public void setHuBei(Boolean huBei) {
        this.huBei = huBei;
    }

    public Boolean getAbroad() {
        return abroad;
    }

    public void setAbroad(Boolean abroad) {
        this.abroad = abroad;
    }

    public Boolean getForeignRelatives() {
        return foreignRelatives;
    }

    public void setForeignRelatives(Boolean foreignRelatives) {
        this.foreignRelatives = foreignRelatives;
    }

    public Boolean getContactCase() {
        return contactCase;
    }

    public void setContactCase(Boolean contactCase) {
        this.contactCase = contactCase;
    }

    public Boolean getContactForeigner() {
        return contactForeigner;
    }

    public void setContactForeigner(Boolean contactForeigner) {
        this.contactForeigner = contactForeigner;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Health other = (Health) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMyPhysicalCondition() == null ? other.getMyPhysicalCondition() == null : this.getMyPhysicalCondition().equals(other.getMyPhysicalCondition()))
            && (this.getFamilyPhysicalCondition() == null ? other.getFamilyPhysicalCondition() == null : this.getFamilyPhysicalCondition().equals(other.getFamilyPhysicalCondition()))
            && (this.getHuBei() == null ? other.getHuBei() == null : this.getHuBei().equals(other.getHuBei()))
            && (this.getAbroad() == null ? other.getAbroad() == null : this.getAbroad().equals(other.getAbroad()))
            && (this.getForeignRelatives() == null ? other.getForeignRelatives() == null : this.getForeignRelatives().equals(other.getForeignRelatives()))
            && (this.getContactCase() == null ? other.getContactCase() == null : this.getContactCase().equals(other.getContactCase()))
            && (this.getContactForeigner() == null ? other.getContactForeigner() == null : this.getContactForeigner().equals(other.getContactForeigner()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMyPhysicalCondition() == null) ? 0 : getMyPhysicalCondition().hashCode());
        result = prime * result + ((getFamilyPhysicalCondition() == null) ? 0 : getFamilyPhysicalCondition().hashCode());
        result = prime * result + ((getHuBei() == null) ? 0 : getHuBei().hashCode());
        result = prime * result + ((getAbroad() == null) ? 0 : getAbroad().hashCode());
        result = prime * result + ((getForeignRelatives() == null) ? 0 : getForeignRelatives().hashCode());
        result = prime * result + ((getContactCase() == null) ? 0 : getContactCase().hashCode());
        result = prime * result + ((getContactForeigner() == null) ? 0 : getContactForeigner().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", myPhysicalCondition=").append(myPhysicalCondition);
        sb.append(", familyPhysicalCondition=").append(familyPhysicalCondition);
        sb.append(", huBei=").append(huBei);
        sb.append(", abroad=").append(abroad);
        sb.append(", foreignRelatives=").append(foreignRelatives);
        sb.append(", contactCase=").append(contactCase);
        sb.append(", contactForeigner=").append(contactForeigner);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}