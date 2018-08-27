package com.egoist.acg.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSubExample() {
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

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Short value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Short value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Short value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Short value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Short value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Short> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Short> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Short value1, Short value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Short value1, Short value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusIsNull() {
            addCriterion("out_order_status is null");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusIsNotNull() {
            addCriterion("out_order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusEqualTo(Short value) {
            addCriterion("out_order_status =", value, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusNotEqualTo(Short value) {
            addCriterion("out_order_status <>", value, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusGreaterThan(Short value) {
            addCriterion("out_order_status >", value, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("out_order_status >=", value, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusLessThan(Short value) {
            addCriterion("out_order_status <", value, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("out_order_status <=", value, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusIn(List<Short> values) {
            addCriterion("out_order_status in", values, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusNotIn(List<Short> values) {
            addCriterion("out_order_status not in", values, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusBetween(Short value1, Short value2) {
            addCriterion("out_order_status between", value1, value2, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOutOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("out_order_status not between", value1, value2, "outOrderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Short value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Short value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Short value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Short value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Short> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Short> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Short value1, Short value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIsNull() {
            addCriterion("warehouse_no is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIsNotNull() {
            addCriterion("warehouse_no is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoEqualTo(String value) {
            addCriterion("warehouse_no =", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotEqualTo(String value) {
            addCriterion("warehouse_no <>", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoGreaterThan(String value) {
            addCriterion("warehouse_no >", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_no >=", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLessThan(String value) {
            addCriterion("warehouse_no <", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLessThanOrEqualTo(String value) {
            addCriterion("warehouse_no <=", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoLike(String value) {
            addCriterion("warehouse_no like", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotLike(String value) {
            addCriterion("warehouse_no not like", value, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoIn(List<String> values) {
            addCriterion("warehouse_no in", values, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotIn(List<String> values) {
            addCriterion("warehouse_no not in", values, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoBetween(String value1, String value2) {
            addCriterion("warehouse_no between", value1, value2, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andWarehouseNoNotBetween(String value1, String value2) {
            addCriterion("warehouse_no not between", value1, value2, "warehouseNo");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNull() {
            addCriterion("express_code is null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNotNull() {
            addCriterion("express_code is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeEqualTo(String value) {
            addCriterion("express_code =", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotEqualTo(String value) {
            addCriterion("express_code <>", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThan(String value) {
            addCriterion("express_code >", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("express_code >=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThan(String value) {
            addCriterion("express_code <", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThanOrEqualTo(String value) {
            addCriterion("express_code <=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLike(String value) {
            addCriterion("express_code like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotLike(String value) {
            addCriterion("express_code not like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIn(List<String> values) {
            addCriterion("express_code in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotIn(List<String> values) {
            addCriterion("express_code not in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeBetween(String value1, String value2) {
            addCriterion("express_code between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotBetween(String value1, String value2) {
            addCriterion("express_code not between", value1, value2, "expressCode");
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

        public Criteria andLogisticsTimeIsNull() {
            addCriterion("logistics_time is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeIsNotNull() {
            addCriterion("logistics_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeEqualTo(Date value) {
            addCriterion("logistics_time =", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeNotEqualTo(Date value) {
            addCriterion("logistics_time <>", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeGreaterThan(Date value) {
            addCriterion("logistics_time >", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logistics_time >=", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeLessThan(Date value) {
            addCriterion("logistics_time <", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeLessThanOrEqualTo(Date value) {
            addCriterion("logistics_time <=", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeIn(List<Date> values) {
            addCriterion("logistics_time in", values, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeNotIn(List<Date> values) {
            addCriterion("logistics_time not in", values, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeBetween(Date value1, Date value2) {
            addCriterion("logistics_time between", value1, value2, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeNotBetween(Date value1, Date value2) {
            addCriterion("logistics_time not between", value1, value2, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeIsNull() {
            addCriterion("dynamic_logistics_time is null");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeIsNotNull() {
            addCriterion("dynamic_logistics_time is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeEqualTo(Date value) {
            addCriterion("dynamic_logistics_time =", value, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeNotEqualTo(Date value) {
            addCriterion("dynamic_logistics_time <>", value, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeGreaterThan(Date value) {
            addCriterion("dynamic_logistics_time >", value, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dynamic_logistics_time >=", value, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeLessThan(Date value) {
            addCriterion("dynamic_logistics_time <", value, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeLessThanOrEqualTo(Date value) {
            addCriterion("dynamic_logistics_time <=", value, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeIn(List<Date> values) {
            addCriterion("dynamic_logistics_time in", values, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeNotIn(List<Date> values) {
            addCriterion("dynamic_logistics_time not in", values, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeBetween(Date value1, Date value2) {
            addCriterion("dynamic_logistics_time between", value1, value2, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andDynamicLogisticsTimeNotBetween(Date value1, Date value2) {
            addCriterion("dynamic_logistics_time not between", value1, value2, "dynamicLogisticsTime");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeIsNull() {
            addCriterion("order_sale_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeIsNotNull() {
            addCriterion("order_sale_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeEqualTo(Integer value) {
            addCriterion("order_sale_fee =", value, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeNotEqualTo(Integer value) {
            addCriterion("order_sale_fee <>", value, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeGreaterThan(Integer value) {
            addCriterion("order_sale_fee >", value, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_sale_fee >=", value, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeLessThan(Integer value) {
            addCriterion("order_sale_fee <", value, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeLessThanOrEqualTo(Integer value) {
            addCriterion("order_sale_fee <=", value, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeIn(List<Integer> values) {
            addCriterion("order_sale_fee in", values, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeNotIn(List<Integer> values) {
            addCriterion("order_sale_fee not in", values, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeBetween(Integer value1, Integer value2) {
            addCriterion("order_sale_fee between", value1, value2, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderSaleFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_sale_fee not between", value1, value2, "orderSaleFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeIsNull() {
            addCriterion("order_real_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeIsNotNull() {
            addCriterion("order_real_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeEqualTo(Integer value) {
            addCriterion("order_real_fee =", value, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeNotEqualTo(Integer value) {
            addCriterion("order_real_fee <>", value, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeGreaterThan(Integer value) {
            addCriterion("order_real_fee >", value, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_real_fee >=", value, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeLessThan(Integer value) {
            addCriterion("order_real_fee <", value, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeLessThanOrEqualTo(Integer value) {
            addCriterion("order_real_fee <=", value, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeIn(List<Integer> values) {
            addCriterion("order_real_fee in", values, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeNotIn(List<Integer> values) {
            addCriterion("order_real_fee not in", values, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeBetween(Integer value1, Integer value2) {
            addCriterion("order_real_fee between", value1, value2, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_real_fee not between", value1, value2, "orderRealFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeIsNull() {
            addCriterion("order_discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeIsNotNull() {
            addCriterion("order_discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeEqualTo(Integer value) {
            addCriterion("order_discount_fee =", value, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeNotEqualTo(Integer value) {
            addCriterion("order_discount_fee <>", value, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeGreaterThan(Integer value) {
            addCriterion("order_discount_fee >", value, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_discount_fee >=", value, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeLessThan(Integer value) {
            addCriterion("order_discount_fee <", value, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeLessThanOrEqualTo(Integer value) {
            addCriterion("order_discount_fee <=", value, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeIn(List<Integer> values) {
            addCriterion("order_discount_fee in", values, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeNotIn(List<Integer> values) {
            addCriterion("order_discount_fee not in", values, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeBetween(Integer value1, Integer value2) {
            addCriterion("order_discount_fee between", value1, value2, "orderDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOrderDiscountFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_discount_fee not between", value1, value2, "orderDiscountFee");
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

        public Criteria andStockSourceIsNull() {
            addCriterion("stock_source is null");
            return (Criteria) this;
        }

        public Criteria andStockSourceIsNotNull() {
            addCriterion("stock_source is not null");
            return (Criteria) this;
        }

        public Criteria andStockSourceEqualTo(Short value) {
            addCriterion("stock_source =", value, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceNotEqualTo(Short value) {
            addCriterion("stock_source <>", value, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceGreaterThan(Short value) {
            addCriterion("stock_source >", value, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("stock_source >=", value, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceLessThan(Short value) {
            addCriterion("stock_source <", value, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceLessThanOrEqualTo(Short value) {
            addCriterion("stock_source <=", value, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceIn(List<Short> values) {
            addCriterion("stock_source in", values, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceNotIn(List<Short> values) {
            addCriterion("stock_source not in", values, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceBetween(Short value1, Short value2) {
            addCriterion("stock_source between", value1, value2, "stockSource");
            return (Criteria) this;
        }

        public Criteria andStockSourceNotBetween(Short value1, Short value2) {
            addCriterion("stock_source not between", value1, value2, "stockSource");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyIsNull() {
            addCriterion("order_classify is null");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyIsNotNull() {
            addCriterion("order_classify is not null");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyEqualTo(Short value) {
            addCriterion("order_classify =", value, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyNotEqualTo(Short value) {
            addCriterion("order_classify <>", value, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyGreaterThan(Short value) {
            addCriterion("order_classify >", value, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyGreaterThanOrEqualTo(Short value) {
            addCriterion("order_classify >=", value, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyLessThan(Short value) {
            addCriterion("order_classify <", value, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyLessThanOrEqualTo(Short value) {
            addCriterion("order_classify <=", value, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyIn(List<Short> values) {
            addCriterion("order_classify in", values, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyNotIn(List<Short> values) {
            addCriterion("order_classify not in", values, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyBetween(Short value1, Short value2) {
            addCriterion("order_classify between", value1, value2, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andOrderClassifyNotBetween(Short value1, Short value2) {
            addCriterion("order_classify not between", value1, value2, "orderClassify");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Integer value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Integer value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Integer value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Integer value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Integer value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Integer> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Integer> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Integer value1, Integer value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Integer value1, Integer value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andLogisCompanyNameIsNull() {
            addCriterion("logis_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameIsNotNull() {
            addCriterion("logis_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameEqualTo(String value) {
            addCriterion("logis_company_name =", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameNotEqualTo(String value) {
            addCriterion("logis_company_name <>", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameGreaterThan(String value) {
            addCriterion("logis_company_name >", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("logis_company_name >=", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameLessThan(String value) {
            addCriterion("logis_company_name <", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("logis_company_name <=", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameLike(String value) {
            addCriterion("logis_company_name like", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameNotLike(String value) {
            addCriterion("logis_company_name not like", value, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameIn(List<String> values) {
            addCriterion("logis_company_name in", values, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameNotIn(List<String> values) {
            addCriterion("logis_company_name not in", values, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameBetween(String value1, String value2) {
            addCriterion("logis_company_name between", value1, value2, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisCompanyNameNotBetween(String value1, String value2) {
            addCriterion("logis_company_name not between", value1, value2, "logisCompanyName");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNull() {
            addCriterion("shop_no is null");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNotNull() {
            addCriterion("shop_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopNoEqualTo(String value) {
            addCriterion("shop_no =", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotEqualTo(String value) {
            addCriterion("shop_no <>", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThan(String value) {
            addCriterion("shop_no >", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_no >=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThan(String value) {
            addCriterion("shop_no <", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThanOrEqualTo(String value) {
            addCriterion("shop_no <=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLike(String value) {
            addCriterion("shop_no like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotLike(String value) {
            addCriterion("shop_no not like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIn(List<String> values) {
            addCriterion("shop_no in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotIn(List<String> values) {
            addCriterion("shop_no not in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoBetween(String value1, String value2) {
            addCriterion("shop_no between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotBetween(String value1, String value2) {
            addCriterion("shop_no not between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andCcTaxIsNull() {
            addCriterion("cc_tax is null");
            return (Criteria) this;
        }

        public Criteria andCcTaxIsNotNull() {
            addCriterion("cc_tax is not null");
            return (Criteria) this;
        }

        public Criteria andCcTaxEqualTo(Integer value) {
            addCriterion("cc_tax =", value, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxNotEqualTo(Integer value) {
            addCriterion("cc_tax <>", value, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxGreaterThan(Integer value) {
            addCriterion("cc_tax >", value, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_tax >=", value, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxLessThan(Integer value) {
            addCriterion("cc_tax <", value, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxLessThanOrEqualTo(Integer value) {
            addCriterion("cc_tax <=", value, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxIn(List<Integer> values) {
            addCriterion("cc_tax in", values, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxNotIn(List<Integer> values) {
            addCriterion("cc_tax not in", values, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxBetween(Integer value1, Integer value2) {
            addCriterion("cc_tax between", value1, value2, "ccTax");
            return (Criteria) this;
        }

        public Criteria andCcTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_tax not between", value1, value2, "ccTax");
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