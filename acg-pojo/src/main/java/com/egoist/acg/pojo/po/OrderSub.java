package com.egoist.acg.pojo.po;

import java.util.Date;

public class OrderSub {
    private Long idx;

    private Long idxCode;

    private String orderNo;

    private String subOrderNo;

    private Short orderSource;

    private Short outOrderStatus;

    private Short orderStatus;

    private Integer totalNum;

    private String warehouseNo;

    private String expressCode;

    private String logisticsNo;

    private Date logisticsTime;

    private Date dynamicLogisticsTime;

    private Integer orderSaleFee;

    private Integer orderRealFee;

    private Integer orderDiscountFee;

    private Integer lockDeductionFee;

    private Short stockSource;

    private Short orderClassify;

    private Integer freight;

    private Integer weight;

    private Integer tax;

    private String remark;

    private Short status;

    private Long version;

    private Long createUserIdxCode;

    private Long updateUserIdxCode;

    private Date createTime;

    private Date updateTime;

    private String logisCompanyName;

    private String shopNo;

    private Integer ccTax;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getSubOrderNo() {
        return subOrderNo;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo == null ? null : subOrderNo.trim();
    }

    public Short getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Short orderSource) {
        this.orderSource = orderSource;
    }

    public Short getOutOrderStatus() {
        return outOrderStatus;
    }

    public void setOutOrderStatus(Short outOrderStatus) {
        this.outOrderStatus = outOrderStatus;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo == null ? null : warehouseNo.trim();
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode == null ? null : expressCode.trim();
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo == null ? null : logisticsNo.trim();
    }

    public Date getLogisticsTime() {
        return logisticsTime;
    }

    public void setLogisticsTime(Date logisticsTime) {
        this.logisticsTime = logisticsTime;
    }

    public Date getDynamicLogisticsTime() {
        return dynamicLogisticsTime;
    }

    public void setDynamicLogisticsTime(Date dynamicLogisticsTime) {
        this.dynamicLogisticsTime = dynamicLogisticsTime;
    }

    public Integer getOrderSaleFee() {
        return orderSaleFee;
    }

    public void setOrderSaleFee(Integer orderSaleFee) {
        this.orderSaleFee = orderSaleFee;
    }

    public Integer getOrderRealFee() {
        return orderRealFee;
    }

    public void setOrderRealFee(Integer orderRealFee) {
        this.orderRealFee = orderRealFee;
    }

    public Integer getOrderDiscountFee() {
        return orderDiscountFee;
    }

    public void setOrderDiscountFee(Integer orderDiscountFee) {
        this.orderDiscountFee = orderDiscountFee;
    }

    public Integer getLockDeductionFee() {
        return lockDeductionFee;
    }

    public void setLockDeductionFee(Integer lockDeductionFee) {
        this.lockDeductionFee = lockDeductionFee;
    }

    public Short getStockSource() {
        return stockSource;
    }

    public void setStockSource(Short stockSource) {
        this.stockSource = stockSource;
    }

    public Short getOrderClassify() {
        return orderClassify;
    }

    public void setOrderClassify(Short orderClassify) {
        this.orderClassify = orderClassify;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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

    public String getLogisCompanyName() {
        return logisCompanyName;
    }

    public void setLogisCompanyName(String logisCompanyName) {
        this.logisCompanyName = logisCompanyName == null ? null : logisCompanyName.trim();
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo == null ? null : shopNo.trim();
    }

    public Integer getCcTax() {
        return ccTax;
    }

    public void setCcTax(Integer ccTax) {
        this.ccTax = ccTax;
    }
}