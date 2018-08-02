package com.egoist.acg.pojo;

import java.util.Date;

public class Cart {
    private Long idx;

    private Long idxCode;

    private Long userIdxCode;

    private Long itemIdxCode;

    private Integer itemNumber;

    private Short status;

    private Long createUserIdxCode;

    private Long updateUserIdxCode;

    private Date createTime;

    private Date updateTime;

    private Long version;

    private String ext;

    private String remark;

    private Integer itemType;

    private Long skuIdxCode;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public Long getIdxCode() {
        return idxCode;
    }

    public void setIdxCode(Long idxCode) {
        this.idxCode = idxCode;
    }

    public Long getUserIdxCode() {
        return userIdxCode;
    }

    public void setUserIdxCode(Long userIdxCode) {
        this.userIdxCode = userIdxCode;
    }

    public Long getItemIdxCode() {
        return itemIdxCode;
    }

    public void setItemIdxCode(Long itemIdxCode) {
        this.itemIdxCode = itemIdxCode;
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getCreateUserIdxCode() {
        return createUserIdxCode;
    }

    public void setCreateUserIdxCode(Long createUserIdxCode) {
        this.createUserIdxCode = createUserIdxCode;
    }

    public Long getUpdateUserIdxCode() {
        return updateUserIdxCode;
    }

    public void setUpdateUserIdxCode(Long updateUserIdxCode) {
        this.updateUserIdxCode = updateUserIdxCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Long getSkuIdxCode() {
        return skuIdxCode;
    }

    public void setSkuIdxCode(Long skuIdxCode) {
        this.skuIdxCode = skuIdxCode;
    }
}