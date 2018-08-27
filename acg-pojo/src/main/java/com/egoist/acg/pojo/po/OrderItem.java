package com.egoist.acg.pojo.po;

import java.util.Date;

public class OrderItem {
    private Long idx;

    private Long idxCode;

    private String orderNo;

    private String subOrderNo;

    private Long itemIdxCode;

    private String customsGoodsId;

    private String itemNo;

    private String itemName;

    private String barcode;

    private Integer unitPrice;

    private Integer buyNum;

    private Integer stockLockNum;

    private Long unitIdxCode;

    private Integer saleFee;

    private Integer lockDeductionFee;

    private Integer discountFee;

    private Integer realFee;

    private Integer sharePost;

    private Integer goodsGweight;

    private String specification;

    private String logisticsNo;

    private Integer tax;

    private String remark;

    private Short status;

    private Long version;

    private Long createUserIdxCode;

    private Long updateUserIdxCode;

    private Date createTime;

    private Date updateTime;

    private Long spuIdxCode;

    private Long collectSkuIdxCode;

    private Short itemCombinationType;

    private String stockOccupyId;

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

    public Long getItemIdxCode() {
        return itemIdxCode;
    }

    public void setItemIdxCode(Long itemIdxCode) {
        this.itemIdxCode = itemIdxCode;
    }

    public String getCustomsGoodsId() {
        return customsGoodsId;
    }

    public void setCustomsGoodsId(String customsGoodsId) {
        this.customsGoodsId = customsGoodsId == null ? null : customsGoodsId.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getStockLockNum() {
        return stockLockNum;
    }

    public void setStockLockNum(Integer stockLockNum) {
        this.stockLockNum = stockLockNum;
    }

    public Long getUnitIdxCode() {
        return unitIdxCode;
    }

    public void setUnitIdxCode(Long unitIdxCode) {
        this.unitIdxCode = unitIdxCode;
    }

    public Integer getSaleFee() {
        return saleFee;
    }

    public void setSaleFee(Integer saleFee) {
        this.saleFee = saleFee;
    }

    public Integer getLockDeductionFee() {
        return lockDeductionFee;
    }

    public void setLockDeductionFee(Integer lockDeductionFee) {
        this.lockDeductionFee = lockDeductionFee;
    }

    public Integer getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Integer discountFee) {
        this.discountFee = discountFee;
    }

    public Integer getRealFee() {
        return realFee;
    }

    public void setRealFee(Integer realFee) {
        this.realFee = realFee;
    }

    public Integer getSharePost() {
        return sharePost;
    }

    public void setSharePost(Integer sharePost) {
        this.sharePost = sharePost;
    }

    public Integer getGoodsGweight() {
        return goodsGweight;
    }

    public void setGoodsGweight(Integer goodsGweight) {
        this.goodsGweight = goodsGweight;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo == null ? null : logisticsNo.trim();
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

    public Long getSpuIdxCode() {
        return spuIdxCode;
    }

    public void setSpuIdxCode(Long spuIdxCode) {
        this.spuIdxCode = spuIdxCode;
    }

    public Long getCollectSkuIdxCode() {
        return collectSkuIdxCode;
    }

    public void setCollectSkuIdxCode(Long collectSkuIdxCode) {
        this.collectSkuIdxCode = collectSkuIdxCode;
    }

    public Short getItemCombinationType() {
        return itemCombinationType;
    }

    public void setItemCombinationType(Short itemCombinationType) {
        this.itemCombinationType = itemCombinationType;
    }

    public String getStockOccupyId() {
        return stockOccupyId;
    }

    public void setStockOccupyId(String stockOccupyId) {
        this.stockOccupyId = stockOccupyId == null ? null : stockOccupyId.trim();
    }
}