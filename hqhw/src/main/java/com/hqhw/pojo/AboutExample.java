package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class AboutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AboutExample() {
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
            addCriterion("SeoKeyWord is null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIsNotNull() {
            addCriterion("SeoKeyWord is not null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordEqualTo(String value) {
            addCriterion("SeoKeyWord =", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotEqualTo(String value) {
            addCriterion("SeoKeyWord <>", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThan(String value) {
            addCriterion("SeoKeyWord >", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThanOrEqualTo(String value) {
            addCriterion("SeoKeyWord >=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThan(String value) {
            addCriterion("SeoKeyWord <", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThanOrEqualTo(String value) {
            addCriterion("SeoKeyWord <=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLike(String value) {
            addCriterion("SeoKeyWord like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotLike(String value) {
            addCriterion("SeoKeyWord not like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIn(List<String> values) {
            addCriterion("SeoKeyWord in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotIn(List<String> values) {
            addCriterion("SeoKeyWord not in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordBetween(String value1, String value2) {
            addCriterion("SeoKeyWord between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotBetween(String value1, String value2) {
            addCriterion("SeoKeyWord not between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNull() {
            addCriterion("SeoDescription is null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNotNull() {
            addCriterion("SeoDescription is not null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionEqualTo(String value) {
            addCriterion("SeoDescription =", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotEqualTo(String value) {
            addCriterion("SeoDescription <>", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThan(String value) {
            addCriterion("SeoDescription >", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SeoDescription >=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThan(String value) {
            addCriterion("SeoDescription <", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThanOrEqualTo(String value) {
            addCriterion("SeoDescription <=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLike(String value) {
            addCriterion("SeoDescription like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotLike(String value) {
            addCriterion("SeoDescription not like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIn(List<String> values) {
            addCriterion("SeoDescription in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotIn(List<String> values) {
            addCriterion("SeoDescription not in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionBetween(String value1, String value2) {
            addCriterion("SeoDescription between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotBetween(String value1, String value2) {
            addCriterion("SeoDescription not between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andViewflagIsNull() {
            addCriterion("viewFlag is null");
            return (Criteria) this;
        }

        public Criteria andViewflagIsNotNull() {
            addCriterion("viewFlag is not null");
            return (Criteria) this;
        }

        public Criteria andViewflagEqualTo(Integer value) {
            addCriterion("viewFlag =", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagNotEqualTo(Integer value) {
            addCriterion("viewFlag <>", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagGreaterThan(Integer value) {
            addCriterion("viewFlag >", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewFlag >=", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagLessThan(Integer value) {
            addCriterion("viewFlag <", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagLessThanOrEqualTo(Integer value) {
            addCriterion("viewFlag <=", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagIn(List<Integer> values) {
            addCriterion("viewFlag in", values, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagNotIn(List<Integer> values) {
            addCriterion("viewFlag not in", values, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagBetween(Integer value1, Integer value2) {
            addCriterion("viewFlag between", value1, value2, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagNotBetween(Integer value1, Integer value2) {
            addCriterion("viewFlag not between", value1, value2, "viewflag");
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

        public Criteria andColumn7IsNull() {
            addCriterion("Column_7 is null");
            return (Criteria) this;
        }

        public Criteria andColumn7IsNotNull() {
            addCriterion("Column_7 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn7EqualTo(String value) {
            addCriterion("Column_7 =", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotEqualTo(String value) {
            addCriterion("Column_7 <>", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7GreaterThan(String value) {
            addCriterion("Column_7 >", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7GreaterThanOrEqualTo(String value) {
            addCriterion("Column_7 >=", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7LessThan(String value) {
            addCriterion("Column_7 <", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7LessThanOrEqualTo(String value) {
            addCriterion("Column_7 <=", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7Like(String value) {
            addCriterion("Column_7 like", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotLike(String value) {
            addCriterion("Column_7 not like", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7In(List<String> values) {
            addCriterion("Column_7 in", values, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotIn(List<String> values) {
            addCriterion("Column_7 not in", values, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7Between(String value1, String value2) {
            addCriterion("Column_7 between", value1, value2, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotBetween(String value1, String value2) {
            addCriterion("Column_7 not between", value1, value2, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn8IsNull() {
            addCriterion("Column_8 is null");
            return (Criteria) this;
        }

        public Criteria andColumn8IsNotNull() {
            addCriterion("Column_8 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn8EqualTo(String value) {
            addCriterion("Column_8 =", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotEqualTo(String value) {
            addCriterion("Column_8 <>", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8GreaterThan(String value) {
            addCriterion("Column_8 >", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8GreaterThanOrEqualTo(String value) {
            addCriterion("Column_8 >=", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8LessThan(String value) {
            addCriterion("Column_8 <", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8LessThanOrEqualTo(String value) {
            addCriterion("Column_8 <=", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8Like(String value) {
            addCriterion("Column_8 like", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotLike(String value) {
            addCriterion("Column_8 not like", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8In(List<String> values) {
            addCriterion("Column_8 in", values, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotIn(List<String> values) {
            addCriterion("Column_8 not in", values, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8Between(String value1, String value2) {
            addCriterion("Column_8 between", value1, value2, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotBetween(String value1, String value2) {
            addCriterion("Column_8 not between", value1, value2, "column8");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNull() {
            addCriterion("seo_description is null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNotNull() {
            addCriterion("seo_description is not null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionEqualTo(String value) {
            addCriterion("seo_description =", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotEqualTo(String value) {
            addCriterion("seo_description <>", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThan(String value) {
            addCriterion("seo_description >", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seo_description >=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThan(String value) {
            addCriterion("seo_description <", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("seo_description <=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLike(String value) {
            addCriterion("seo_description like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotLike(String value) {
            addCriterion("seo_description not like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIn(List<String> values) {
            addCriterion("seo_description in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotIn(List<String> values) {
            addCriterion("seo_description not in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionBetween(String value1, String value2) {
            addCriterion("seo_description between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotBetween(String value1, String value2) {
            addCriterion("seo_description not between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordIsNull() {
            addCriterion("seo_key_word is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordIsNotNull() {
            addCriterion("seo_key_word is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordEqualTo(String value) {
            addCriterion("seo_key_word =", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordNotEqualTo(String value) {
            addCriterion("seo_key_word <>", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordGreaterThan(String value) {
            addCriterion("seo_key_word >", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("seo_key_word >=", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordLessThan(String value) {
            addCriterion("seo_key_word <", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordLessThanOrEqualTo(String value) {
            addCriterion("seo_key_word <=", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordLike(String value) {
            addCriterion("seo_key_word like", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordNotLike(String value) {
            addCriterion("seo_key_word not like", value, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordIn(List<String> values) {
            addCriterion("seo_key_word in", values, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordNotIn(List<String> values) {
            addCriterion("seo_key_word not in", values, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordBetween(String value1, String value2) {
            addCriterion("seo_key_word between", value1, value2, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoKeyWordNotBetween(String value1, String value2) {
            addCriterion("seo_key_word not between", value1, value2, "seoKeyWord");
            return (Criteria) this;
        }

        public Criteria andViewFlagIsNull() {
            addCriterion("view_flag is null");
            return (Criteria) this;
        }

        public Criteria andViewFlagIsNotNull() {
            addCriterion("view_flag is not null");
            return (Criteria) this;
        }

        public Criteria andViewFlagEqualTo(Integer value) {
            addCriterion("view_flag =", value, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagNotEqualTo(Integer value) {
            addCriterion("view_flag <>", value, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagGreaterThan(Integer value) {
            addCriterion("view_flag >", value, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_flag >=", value, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagLessThan(Integer value) {
            addCriterion("view_flag <", value, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagLessThanOrEqualTo(Integer value) {
            addCriterion("view_flag <=", value, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagIn(List<Integer> values) {
            addCriterion("view_flag in", values, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagNotIn(List<Integer> values) {
            addCriterion("view_flag not in", values, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagBetween(Integer value1, Integer value2) {
            addCriterion("view_flag between", value1, value2, "viewFlag");
            return (Criteria) this;
        }

        public Criteria andViewFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("view_flag not between", value1, value2, "viewFlag");
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