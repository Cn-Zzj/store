package com.cy.store.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author zzj
 * @date 2022/9/6 - 19:43
 */
public class BaseEntity implements Serializable {
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date emodifiedTime;

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getEmodifiedTime() {
        return emodifiedTime;
    }

    public void setEmodifiedTime(Date emodifiedTime) {
        this.emodifiedTime = emodifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseEntity)) {
            return false;
        }
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(getCreatedUser(), that.getCreatedUser()) && Objects.equals(getCreatedTime(), that.getCreatedTime()) && Objects.equals(getModifiedUser(), that.getModifiedUser()) && Objects.equals(getEmodifiedTime(), that.getEmodifiedTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreatedUser(), getCreatedTime(), getModifiedUser(), getEmodifiedTime());
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", emodifiedTime=" + emodifiedTime +
                '}';
    }
}
