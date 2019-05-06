package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpecialsortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialsortExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIsNull() {
            addCriterion("seokeyword is null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIsNotNull() {
            addCriterion("seokeyword is not null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordEqualTo(String value) {
            addCriterion("seokeyword =", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotEqualTo(String value) {
            addCriterion("seokeyword <>", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThan(String value) {
            addCriterion("seokeyword >", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThanOrEqualTo(String value) {
            addCriterion("seokeyword >=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThan(String value) {
            addCriterion("seokeyword <", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThanOrEqualTo(String value) {
            addCriterion("seokeyword <=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLike(String value) {
            addCriterion("seokeyword like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotLike(String value) {
            addCriterion("seokeyword not like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIn(List<String> values) {
            addCriterion("seokeyword in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotIn(List<String> values) {
            addCriterion("seokeyword not in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordBetween(String value1, String value2) {
            addCriterion("seokeyword between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotBetween(String value1, String value2) {
            addCriterion("seokeyword not between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNull() {
            addCriterion("seodescription is null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNotNull() {
            addCriterion("seodescription is not null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionEqualTo(String value) {
            addCriterion("seodescription =", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotEqualTo(String value) {
            addCriterion("seodescription <>", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThan(String value) {
            addCriterion("seodescription >", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seodescription >=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThan(String value) {
            addCriterion("seodescription <", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThanOrEqualTo(String value) {
            addCriterion("seodescription <=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLike(String value) {
            addCriterion("seodescription like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotLike(String value) {
            addCriterion("seodescription not like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIn(List<String> values) {
            addCriterion("seodescription in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotIn(List<String> values) {
            addCriterion("seodescription not in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionBetween(String value1, String value2) {
            addCriterion("seodescription between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotBetween(String value1, String value2) {
            addCriterion("seodescription not between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andReorderIsNull() {
            addCriterion("reorder is null");
            return (Criteria) this;
        }

        public Criteria andReorderIsNotNull() {
            addCriterion("reorder is not null");
            return (Criteria) this;
        }

        public Criteria andReorderEqualTo(Integer value) {
            addCriterion("reorder =", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotEqualTo(Integer value) {
            addCriterion("reorder <>", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderGreaterThan(Integer value) {
            addCriterion("reorder >", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("reorder >=", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLessThan(Integer value) {
            addCriterion("reorder <", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLessThanOrEqualTo(Integer value) {
            addCriterion("reorder <=", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderIn(List<Integer> values) {
            addCriterion("reorder in", values, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotIn(List<Integer> values) {
            addCriterion("reorder not in", values, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderBetween(Integer value1, Integer value2) {
            addCriterion("reorder between", value1, value2, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotBetween(Integer value1, Integer value2) {
            addCriterion("reorder not between", value1, value2, "reorder");
            return (Criteria) this;
        }

        public Criteria andContributenumIsNull() {
            addCriterion("contributenum is null");
            return (Criteria) this;
        }

        public Criteria andContributenumIsNotNull() {
            addCriterion("contributenum is not null");
            return (Criteria) this;
        }

        public Criteria andContributenumEqualTo(Integer value) {
            addCriterion("contributenum =", value, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumNotEqualTo(Integer value) {
            addCriterion("contributenum <>", value, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumGreaterThan(Integer value) {
            addCriterion("contributenum >", value, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("contributenum >=", value, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumLessThan(Integer value) {
            addCriterion("contributenum <", value, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumLessThanOrEqualTo(Integer value) {
            addCriterion("contributenum <=", value, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumIn(List<Integer> values) {
            addCriterion("contributenum in", values, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumNotIn(List<Integer> values) {
            addCriterion("contributenum not in", values, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumBetween(Integer value1, Integer value2) {
            addCriterion("contributenum between", value1, value2, "contributenum");
            return (Criteria) this;
        }

        public Criteria andContributenumNotBetween(Integer value1, Integer value2) {
            addCriterion("contributenum not between", value1, value2, "contributenum");
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