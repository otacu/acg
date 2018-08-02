package com.egoist.acg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andUserIdxCodeIsNull() {
            addCriterion("user_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeIsNotNull() {
            addCriterion("user_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeEqualTo(Long value) {
            addCriterion("user_idx_code =", value, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeNotEqualTo(Long value) {
            addCriterion("user_idx_code <>", value, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeGreaterThan(Long value) {
            addCriterion("user_idx_code >", value, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_idx_code >=", value, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeLessThan(Long value) {
            addCriterion("user_idx_code <", value, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("user_idx_code <=", value, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeIn(List<Long> values) {
            addCriterion("user_idx_code in", values, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeNotIn(List<Long> values) {
            addCriterion("user_idx_code not in", values, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeBetween(Long value1, Long value2) {
            addCriterion("user_idx_code between", value1, value2, "userIdxCode");
            return (Criteria) this;
        }

        public Criteria andUserIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("user_idx_code not between", value1, value2, "userIdxCode");
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

        public Criteria andItemNumberIsNull() {
            addCriterion("item_number is null");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNotNull() {
            addCriterion("item_number is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumberEqualTo(Integer value) {
            addCriterion("item_number =", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotEqualTo(Integer value) {
            addCriterion("item_number <>", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThan(Integer value) {
            addCriterion("item_number >", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_number >=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThan(Integer value) {
            addCriterion("item_number <", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThanOrEqualTo(Integer value) {
            addCriterion("item_number <=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberIn(List<Integer> values) {
            addCriterion("item_number in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotIn(List<Integer> values) {
            addCriterion("item_number not in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberBetween(Integer value1, Integer value2) {
            addCriterion("item_number between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("item_number not between", value1, value2, "itemNumber");
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

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
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

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeIsNull() {
            addCriterion("sku_idx_code is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeIsNotNull() {
            addCriterion("sku_idx_code is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeEqualTo(Long value) {
            addCriterion("sku_idx_code =", value, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeNotEqualTo(Long value) {
            addCriterion("sku_idx_code <>", value, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeGreaterThan(Long value) {
            addCriterion("sku_idx_code >", value, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_idx_code >=", value, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeLessThan(Long value) {
            addCriterion("sku_idx_code <", value, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeLessThanOrEqualTo(Long value) {
            addCriterion("sku_idx_code <=", value, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeIn(List<Long> values) {
            addCriterion("sku_idx_code in", values, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeNotIn(List<Long> values) {
            addCriterion("sku_idx_code not in", values, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeBetween(Long value1, Long value2) {
            addCriterion("sku_idx_code between", value1, value2, "skuIdxCode");
            return (Criteria) this;
        }

        public Criteria andSkuIdxCodeNotBetween(Long value1, Long value2) {
            addCriterion("sku_idx_code not between", value1, value2, "skuIdxCode");
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