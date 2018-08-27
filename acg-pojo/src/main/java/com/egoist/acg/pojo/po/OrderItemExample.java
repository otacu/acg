package com.egoist.acg.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Long value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Long value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Long value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Long value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Long value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Long value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Long> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Long> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Long value1, Long value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Long value1, Long value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIsNull() {
            addCriterion("idx_code is null");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIsNotNull() {
            addCriterion("idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdxCodeEqualTo(Long value) {
            addCriterion("idx_code =", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotEqualTo(Long value) {
            addCriterion("idx_code <>", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeGreaterThan(Long value) {
            addCriterion("idx_code >", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("idx_code >=", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeLessThan(Long value) {
            addCriterion("idx_code <", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("idx_code <=", value, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeIn(List<Long> values) {
            addCriterion("idx_code in", values, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotIn(List<Long> values) {
            addCriterion("idx_code not in", values, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeBetween(Long value1, Long value2) {
            addCriterion("idx_code between", value1, value2, "idxCode");
            return (Criteria) this;
        }

        public Criteria andIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("idx_code not between", value1, value2, "idxCode");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoIsNull() {
            addCriterion("sub_order_no is null");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoIsNotNull() {
            addCriterion("sub_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoEqualTo(String value) {
            addCriterion("sub_order_no =", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotEqualTo(String value) {
            addCriterion("sub_order_no <>", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoGreaterThan(String value) {
            addCriterion("sub_order_no >", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("sub_order_no >=", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoLessThan(String value) {
            addCriterion("sub_order_no <", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoLessThanOrEqualTo(String value) {
            addCriterion("sub_order_no <=", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoLike(String value) {
            addCriterion("sub_order_no like", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotLike(String value) {
            addCriterion("sub_order_no not like", value, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoIn(List<String> values) {
            addCriterion("sub_order_no in", values, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotIn(List<String> values) {
            addCriterion("sub_order_no not in", values, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoBetween(String value1, String value2) {
            addCriterion("sub_order_no between", value1, value2, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andSubOrderNoNotBetween(String value1, String value2) {
            addCriterion("sub_order_no not between", value1, value2, "subOrderNo");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeIsNull() {
            addCriterion("item_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeIsNotNull() {
            addCriterion("item_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeEqualTo(Long value) {
            addCriterion("item_idx_code =", value, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeNotEqualTo(Long value) {
            addCriterion("item_idx_code <>", value, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeGreaterThan(Long value) {
            addCriterion("item_idx_code >", value, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("item_idx_code >=", value, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeLessThan(Long value) {
            addCriterion("item_idx_code <", value, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("item_idx_code <=", value, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeIn(List<Long> values) {
            addCriterion("item_idx_code in", values, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeNotIn(List<Long> values) {
            addCriterion("item_idx_code not in", values, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeBetween(Long value1, Long value2) {
            addCriterion("item_idx_code between", value1, value2, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("item_idx_code not between", value1, value2, "itemIdxCode");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdIsNull() {
            addCriterion("customs_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdIsNotNull() {
            addCriterion("customs_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdEqualTo(String value) {
            addCriterion("customs_goods_id =", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdNotEqualTo(String value) {
            addCriterion("customs_goods_id <>", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdGreaterThan(String value) {
            addCriterion("customs_goods_id >", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("customs_goods_id >=", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdLessThan(String value) {
            addCriterion("customs_goods_id <", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("customs_goods_id <=", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdLike(String value) {
            addCriterion("customs_goods_id like", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdNotLike(String value) {
            addCriterion("customs_goods_id not like", value, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdIn(List<String> values) {
            addCriterion("customs_goods_id in", values, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdNotIn(List<String> values) {
            addCriterion("customs_goods_id not in", values, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdBetween(String value1, String value2) {
            addCriterion("customs_goods_id between", value1, value2, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCustomsGoodsIdNotBetween(String value1, String value2) {
            addCriterion("customs_goods_id not between", value1, value2, "customsGoodsId");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("item_no is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("item_no is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("item_no =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("item_no <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("item_no >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("item_no >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("item_no <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("item_no <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("item_no like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("item_no not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("item_no in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("item_no not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("item_no between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("item_no not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Integer value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Integer value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Integer value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Integer value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Integer> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Integer> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Integer value1, Integer value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNull() {
            addCriterion("buy_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNotNull() {
            addCriterion("buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumEqualTo(Integer value) {
            addCriterion("buy_num =", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotEqualTo(Integer value) {
            addCriterion("buy_num <>", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThan(Integer value) {
            addCriterion("buy_num >", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_num >=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThan(Integer value) {
            addCriterion("buy_num <", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_num <=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIn(List<Integer> values) {
            addCriterion("buy_num in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotIn(List<Integer> values) {
            addCriterion("buy_num not in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_num between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_num not between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumIsNull() {
            addCriterion("stock_lock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockLockNumIsNotNull() {
            addCriterion("stock_lock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockLockNumEqualTo(Integer value) {
            addCriterion("stock_lock_num =", value, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumNotEqualTo(Integer value) {
            addCriterion("stock_lock_num <>", value, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumGreaterThan(Integer value) {
            addCriterion("stock_lock_num >", value, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_lock_num >=", value, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumLessThan(Integer value) {
            addCriterion("stock_lock_num <", value, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumLessThanOrEqualTo(Integer value) {
            addCriterion("stock_lock_num <=", value, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumIn(List<Integer> values) {
            addCriterion("stock_lock_num in", values, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumNotIn(List<Integer> values) {
            addCriterion("stock_lock_num not in", values, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumBetween(Integer value1, Integer value2) {
            addCriterion("stock_lock_num between", value1, value2, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andStockLockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_lock_num not between", value1, value2, "stockLockNum");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeIsNull() {
            addCriterion("unit_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeIsNotNull() {
            addCriterion("unit_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeEqualTo(Long value) {
            addCriterion("unit_idx_code =", value, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeNotEqualTo(Long value) {
            addCriterion("unit_idx_code <>", value, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeGreaterThan(Long value) {
            addCriterion("unit_idx_code >", value, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_idx_code >=", value, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeLessThan(Long value) {
            addCriterion("unit_idx_code <", value, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("unit_idx_code <=", value, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeIn(List<Long> values) {
            addCriterion("unit_idx_code in", values, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeNotIn(List<Long> values) {
            addCriterion("unit_idx_code not in", values, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeBetween(Long value1, Long value2) {
            addCriterion("unit_idx_code between", value1, value2, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("unit_idx_code not between", value1, value2, "unitIdxCode");
            return (Criteria) this;
        }

        public Criteria andSaleFeeIsNull() {
            addCriterion("sale_fee is null");
            return (Criteria) this;
        }

        public Criteria andSaleFeeIsNotNull() {
            addCriterion("sale_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSaleFeeEqualTo(Integer value) {
            addCriterion("sale_fee =", value, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeNotEqualTo(Integer value) {
            addCriterion("sale_fee <>", value, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeGreaterThan(Integer value) {
            addCriterion("sale_fee >", value, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_fee >=", value, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeLessThan(Integer value) {
            addCriterion("sale_fee <", value, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeLessThanOrEqualTo(Integer value) {
            addCriterion("sale_fee <=", value, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeIn(List<Integer> values) {
            addCriterion("sale_fee in", values, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeNotIn(List<Integer> values) {
            addCriterion("sale_fee not in", values, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeBetween(Integer value1, Integer value2) {
            addCriterion("sale_fee between", value1, value2, "saleFee");
            return (Criteria) this;
        }

        public Criteria andSaleFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_fee not between", value1, value2, "saleFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeIsNull() {
            addCriterion("lock_deduction_fee is null");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeIsNotNull() {
            addCriterion("lock_deduction_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeEqualTo(Integer value) {
            addCriterion("lock_deduction_fee =", value, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeNotEqualTo(Integer value) {
            addCriterion("lock_deduction_fee <>", value, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeGreaterThan(Integer value) {
            addCriterion("lock_deduction_fee >", value, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_deduction_fee >=", value, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeLessThan(Integer value) {
            addCriterion("lock_deduction_fee <", value, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeLessThanOrEqualTo(Integer value) {
            addCriterion("lock_deduction_fee <=", value, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeIn(List<Integer> values) {
            addCriterion("lock_deduction_fee in", values, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeNotIn(List<Integer> values) {
            addCriterion("lock_deduction_fee not in", values, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeBetween(Integer value1, Integer value2) {
            addCriterion("lock_deduction_fee between", value1, value2, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andLockDeductionFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_deduction_fee not between", value1, value2, "lockDeductionFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNull() {
            addCriterion("discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(Integer value) {
            addCriterion("discount_fee =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(Integer value) {
            addCriterion("discount_fee <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(Integer value) {
            addCriterion("discount_fee >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_fee >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(Integer value) {
            addCriterion("discount_fee <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(Integer value) {
            addCriterion("discount_fee <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<Integer> values) {
            addCriterion("discount_fee in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<Integer> values) {
            addCriterion("discount_fee not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(Integer value1, Integer value2) {
            addCriterion("discount_fee between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_fee not between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNull() {
            addCriterion("real_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNotNull() {
            addCriterion("real_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealFeeEqualTo(Integer value) {
            addCriterion("real_fee =", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotEqualTo(Integer value) {
            addCriterion("real_fee <>", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThan(Integer value) {
            addCriterion("real_fee >", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_fee >=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThan(Integer value) {
            addCriterion("real_fee <", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThanOrEqualTo(Integer value) {
            addCriterion("real_fee <=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeIn(List<Integer> values) {
            addCriterion("real_fee in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotIn(List<Integer> values) {
            addCriterion("real_fee not in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeBetween(Integer value1, Integer value2) {
            addCriterion("real_fee between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("real_fee not between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andSharePostIsNull() {
            addCriterion("share_post is null");
            return (Criteria) this;
        }

        public Criteria andSharePostIsNotNull() {
            addCriterion("share_post is not null");
            return (Criteria) this;
        }

        public Criteria andSharePostEqualTo(Integer value) {
            addCriterion("share_post =", value, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostNotEqualTo(Integer value) {
            addCriterion("share_post <>", value, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostGreaterThan(Integer value) {
            addCriterion("share_post >", value, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_post >=", value, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostLessThan(Integer value) {
            addCriterion("share_post <", value, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostLessThanOrEqualTo(Integer value) {
            addCriterion("share_post <=", value, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostIn(List<Integer> values) {
            addCriterion("share_post in", values, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostNotIn(List<Integer> values) {
            addCriterion("share_post not in", values, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostBetween(Integer value1, Integer value2) {
            addCriterion("share_post between", value1, value2, "sharePost");
            return (Criteria) this;
        }

        public Criteria andSharePostNotBetween(Integer value1, Integer value2) {
            addCriterion("share_post not between", value1, value2, "sharePost");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightIsNull() {
            addCriterion("goods_gweight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightIsNotNull() {
            addCriterion("goods_gweight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightEqualTo(Integer value) {
            addCriterion("goods_gweight =", value, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightNotEqualTo(Integer value) {
            addCriterion("goods_gweight <>", value, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightGreaterThan(Integer value) {
            addCriterion("goods_gweight >", value, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_gweight >=", value, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightLessThan(Integer value) {
            addCriterion("goods_gweight <", value, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightLessThanOrEqualTo(Integer value) {
            addCriterion("goods_gweight <=", value, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightIn(List<Integer> values) {
            addCriterion("goods_gweight in", values, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightNotIn(List<Integer> values) {
            addCriterion("goods_gweight not in", values, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightBetween(Integer value1, Integer value2) {
            addCriterion("goods_gweight between", value1, value2, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andGoodsGweightNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_gweight not between", value1, value2, "goodsGweight");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIsNull() {
            addCriterion("logistics_no is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIsNotNull() {
            addCriterion("logistics_no is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoEqualTo(String value) {
            addCriterion("logistics_no =", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotEqualTo(String value) {
            addCriterion("logistics_no <>", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoGreaterThan(String value) {
            addCriterion("logistics_no >", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_no >=", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLessThan(String value) {
            addCriterion("logistics_no <", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLessThanOrEqualTo(String value) {
            addCriterion("logistics_no <=", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoLike(String value) {
            addCriterion("logistics_no like", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotLike(String value) {
            addCriterion("logistics_no not like", value, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoIn(List<String> values) {
            addCriterion("logistics_no in", values, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotIn(List<String> values) {
            addCriterion("logistics_no not in", values, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoBetween(String value1, String value2) {
            addCriterion("logistics_no between", value1, value2, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andLogisticsNoNotBetween(String value1, String value2) {
            addCriterion("logistics_no not between", value1, value2, "logisticsNo");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Integer value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Integer value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Integer value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Integer value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Integer value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Integer> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Integer> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Integer value1, Integer value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeIsNull() {
            addCriterion("create_user_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeIsNotNull() {
            addCriterion("create_user_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeEqualTo(Long value) {
            addCriterion("create_user_idx_code =", value, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeNotEqualTo(Long value) {
            addCriterion("create_user_idx_code <>", value, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeGreaterThan(Long value) {
            addCriterion("create_user_idx_code >", value, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_idx_code >=", value, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeLessThan(Long value) {
            addCriterion("create_user_idx_code <", value, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("create_user_idx_code <=", value, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeIn(List<Long> values) {
            addCriterion("create_user_idx_code in", values, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeNotIn(List<Long> values) {
            addCriterion("create_user_idx_code not in", values, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeBetween(Long value1, Long value2) {
            addCriterion("create_user_idx_code between", value1, value2, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("create_user_idx_code not between", value1, value2, "createUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeIsNull() {
            addCriterion("update_user_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeIsNotNull() {
            addCriterion("update_user_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeEqualTo(Long value) {
            addCriterion("update_user_idx_code =", value, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeNotEqualTo(Long value) {
            addCriterion("update_user_idx_code <>", value, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeGreaterThan(Long value) {
            addCriterion("update_user_idx_code >", value, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_idx_code >=", value, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeLessThan(Long value) {
            addCriterion("update_user_idx_code <", value, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("update_user_idx_code <=", value, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeIn(List<Long> values) {
            addCriterion("update_user_idx_code in", values, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeNotIn(List<Long> values) {
            addCriterion("update_user_idx_code not in", values, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeBetween(Long value1, Long value2) {
            addCriterion("update_user_idx_code between", value1, value2, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("update_user_idx_code not between", value1, value2, "updateUserIdxCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeIsNull() {
            addCriterion("spu_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeIsNotNull() {
            addCriterion("spu_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeEqualTo(Long value) {
            addCriterion("spu_idx_code =", value, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeNotEqualTo(Long value) {
            addCriterion("spu_idx_code <>", value, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeGreaterThan(Long value) {
            addCriterion("spu_idx_code >", value, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_idx_code >=", value, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeLessThan(Long value) {
            addCriterion("spu_idx_code <", value, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("spu_idx_code <=", value, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeIn(List<Long> values) {
            addCriterion("spu_idx_code in", values, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeNotIn(List<Long> values) {
            addCriterion("spu_idx_code not in", values, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeBetween(Long value1, Long value2) {
            addCriterion("spu_idx_code between", value1, value2, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSpuIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("spu_idx_code not between", value1, value2, "spuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeIsNull() {
            addCriterion("collect_sku_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeIsNotNull() {
            addCriterion("collect_sku_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeEqualTo(Long value) {
            addCriterion("collect_sku_idx_code =", value, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeNotEqualTo(Long value) {
            addCriterion("collect_sku_idx_code <>", value, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeGreaterThan(Long value) {
            addCriterion("collect_sku_idx_code >", value, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("collect_sku_idx_code >=", value, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeLessThan(Long value) {
            addCriterion("collect_sku_idx_code <", value, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("collect_sku_idx_code <=", value, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeIn(List<Long> values) {
            addCriterion("collect_sku_idx_code in", values, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeNotIn(List<Long> values) {
            addCriterion("collect_sku_idx_code not in", values, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeBetween(Long value1, Long value2) {
            addCriterion("collect_sku_idx_code between", value1, value2, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andCollectSkuIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("collect_sku_idx_code not between", value1, value2, "collectSkuIdxCode");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeIsNull() {
            addCriterion("item_combination_type is null");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeIsNotNull() {
            addCriterion("item_combination_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeEqualTo(Short value) {
            addCriterion("item_combination_type =", value, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeNotEqualTo(Short value) {
            addCriterion("item_combination_type <>", value, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeGreaterThan(Short value) {
            addCriterion("item_combination_type >", value, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("item_combination_type >=", value, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeLessThan(Short value) {
            addCriterion("item_combination_type <", value, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeLessThanOrEqualTo(Short value) {
            addCriterion("item_combination_type <=", value, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeIn(List<Short> values) {
            addCriterion("item_combination_type in", values, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeNotIn(List<Short> values) {
            addCriterion("item_combination_type not in", values, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeBetween(Short value1, Short value2) {
            addCriterion("item_combination_type between", value1, value2, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andItemCombinationTypeNotBetween(Short value1, Short value2) {
            addCriterion("item_combination_type not between", value1, value2, "itemCombinationType");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdIsNull() {
            addCriterion("stock_occupy_id is null");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdIsNotNull() {
            addCriterion("stock_occupy_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdEqualTo(String value) {
            addCriterion("stock_occupy_id =", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdNotEqualTo(String value) {
            addCriterion("stock_occupy_id <>", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdGreaterThan(String value) {
            addCriterion("stock_occupy_id >", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_occupy_id >=", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdLessThan(String value) {
            addCriterion("stock_occupy_id <", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdLessThanOrEqualTo(String value) {
            addCriterion("stock_occupy_id <=", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdLike(String value) {
            addCriterion("stock_occupy_id like", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdNotLike(String value) {
            addCriterion("stock_occupy_id not like", value, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdIn(List<String> values) {
            addCriterion("stock_occupy_id in", values, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdNotIn(List<String> values) {
            addCriterion("stock_occupy_id not in", values, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdBetween(String value1, String value2) {
            addCriterion("stock_occupy_id between", value1, value2, "stockOccupyId");
            return (Criteria) this;
        }

        public Criteria andStockOccupyIdNotBetween(String value1, String value2) {
            addCriterion("stock_occupy_id not between", value1, value2, "stockOccupyId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}