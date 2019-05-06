package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityimageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityimageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBelongidIsNull() {
            addCriterion("belongId is null");
            return (Criteria) this;
        }

        public Criteria andBelongidIsNotNull() {
            addCriterion("belongId is not null");
            return (Criteria) this;
        }

        public Criteria andBelongidEqualTo(Integer value) {
            addCriterion("belongId =", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidNotEqualTo(Integer value) {
            addCriterion("belongId <>", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidGreaterThan(Integer value) {
            addCriterion("belongId >", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidGreaterThanOrEqualTo(Integer value) {
            addCriterion("belongId >=", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidLessThan(Integer value) {
            addCriterion("belongId <", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidLessThanOrEqualTo(Integer value) {
            addCriterion("belongId <=", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidIn(List<Integer> values) {
            addCriterion("belongId in", values, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidNotIn(List<Integer> values) {
            addCriterion("belongId not in", values, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidBetween(Integer value1, Integer value2) {
            addCriterion("belongId between", value1, value2, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidNotBetween(Integer value1, Integer value2) {
            addCriterion("belongId not between", value1, value2, "belongid");
            return (Criteria) this;
        }

        public Criteria andViewflageIsNull() {
            addCriterion("viewflage is null");
            return (Criteria) this;
        }

        public Criteria andViewflageIsNotNull() {
            addCriterion("viewflage is not null");
            return (Criteria) this;
        }

        public Criteria andViewflageEqualTo(Integer value) {
            addCriterion("viewflage =", value, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageNotEqualTo(Integer value) {
            addCriterion("viewflage <>", value, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageGreaterThan(Integer value) {
            addCriterion("viewflage >", value, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewflage >=", value, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageLessThan(Integer value) {
            addCriterion("viewflage <", value, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageLessThanOrEqualTo(Integer value) {
            addCriterion("viewflage <=", value, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageIn(List<Integer> values) {
            addCriterion("viewflage in", values, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageNotIn(List<Integer> values) {
            addCriterion("viewflage not in", values, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageBetween(Integer value1, Integer value2) {
            addCriterion("viewflage between", value1, value2, "viewflage");
            return (Criteria) this;
        }

        public Criteria andViewflageNotBetween(Integer value1, Integer value2) {
            addCriterion("viewflage not between", value1, value2, "viewflage");
            return (Criteria) this;
        }

        public Criteria andSpecialpicIsNull() {
            addCriterion("specialpic is null");
            return (Criteria) this;
        }

        public Criteria andSpecialpicIsNotNull() {
            addCriterion("specialpic is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialpicEqualTo(String value) {
            addCriterion("specialpic =", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicNotEqualTo(String value) {
            addCriterion("specialpic <>", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicGreaterThan(String value) {
            addCriterion("specialpic >", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicGreaterThanOrEqualTo(String value) {
            addCriterion("specialpic >=", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicLessThan(String value) {
            addCriterion("specialpic <", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicLessThanOrEqualTo(String value) {
            addCriterion("specialpic <=", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicLike(String value) {
            addCriterion("specialpic like", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicNotLike(String value) {
            addCriterion("specialpic not like", value, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicIn(List<String> values) {
            addCriterion("specialpic in", values, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicNotIn(List<String> values) {
            addCriterion("specialpic not in", values, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicBetween(String value1, String value2) {
            addCriterion("specialpic between", value1, value2, "specialpic");
            return (Criteria) this;
        }

        public Criteria andSpecialpicNotBetween(String value1, String value2) {
            addCriterion("specialpic not between", value1, value2, "specialpic");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBelongIdIsNull() {
            addCriterion("belong_id is null");
            return (Criteria) this;
        }

        public Criteria andBelongIdIsNotNull() {
            addCriterion("belong_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelongIdEqualTo(Integer value) {
            addCriterion("belong_id =", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdNotEqualTo(Integer value) {
            addCriterion("belong_id <>", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdGreaterThan(Integer value) {
            addCriterion("belong_id >", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("belong_id >=", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdLessThan(Integer value) {
            addCriterion("belong_id <", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdLessThanOrEqualTo(Integer value) {
            addCriterion("belong_id <=", value, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdIn(List<Integer> values) {
            addCriterion("belong_id in", values, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdNotIn(List<Integer> values) {
            addCriterion("belong_id not in", values, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdBetween(Integer value1, Integer value2) {
            addCriterion("belong_id between", value1, value2, "belongId");
            return (Criteria) this;
        }

        public Criteria andBelongIdNotBetween(Integer value1, Integer value2) {
            addCriterion("belong_id not between", value1, value2, "belongId");
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