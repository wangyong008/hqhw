package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andArearIsNull() {
            addCriterion("arear is null");
            return (Criteria) this;
        }

        public Criteria andArearIsNotNull() {
            addCriterion("arear is not null");
            return (Criteria) this;
        }

        public Criteria andArearEqualTo(String value) {
            addCriterion("arear =", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotEqualTo(String value) {
            addCriterion("arear <>", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearGreaterThan(String value) {
            addCriterion("arear >", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearGreaterThanOrEqualTo(String value) {
            addCriterion("arear >=", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearLessThan(String value) {
            addCriterion("arear <", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearLessThanOrEqualTo(String value) {
            addCriterion("arear <=", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearLike(String value) {
            addCriterion("arear like", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotLike(String value) {
            addCriterion("arear not like", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearIn(List<String> values) {
            addCriterion("arear in", values, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotIn(List<String> values) {
            addCriterion("arear not in", values, "arear");
            return (Criteria) this;
        }

        public Criteria andArearBetween(String value1, String value2) {
            addCriterion("arear between", value1, value2, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotBetween(String value1, String value2) {
            addCriterion("arear not between", value1, value2, "arear");
            return (Criteria) this;
        }

        public Criteria andViewflagIsNull() {
            addCriterion("viewflag is null");
            return (Criteria) this;
        }

        public Criteria andViewflagIsNotNull() {
            addCriterion("viewflag is not null");
            return (Criteria) this;
        }

        public Criteria andViewflagEqualTo(Integer value) {
            addCriterion("viewflag =", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagNotEqualTo(Integer value) {
            addCriterion("viewflag <>", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagGreaterThan(Integer value) {
            addCriterion("viewflag >", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewflag >=", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagLessThan(Integer value) {
            addCriterion("viewflag <", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagLessThanOrEqualTo(Integer value) {
            addCriterion("viewflag <=", value, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagIn(List<Integer> values) {
            addCriterion("viewflag in", values, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagNotIn(List<Integer> values) {
            addCriterion("viewflag not in", values, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagBetween(Integer value1, Integer value2) {
            addCriterion("viewflag between", value1, value2, "viewflag");
            return (Criteria) this;
        }

        public Criteria andViewflagNotBetween(Integer value1, Integer value2) {
            addCriterion("viewflag not between", value1, value2, "viewflag");
            return (Criteria) this;
        }

        public Criteria andSortidIsNull() {
            addCriterion("sortid is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("sortid is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("sortid =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("sortid <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("sortid >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortid >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("sortid <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("sortid <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("sortid in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("sortid not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("sortid between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("sortid not between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uId is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uId is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uId =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uId <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uId >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uId >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uId <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uId <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uId in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uId not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uId between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uId not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNull() {
            addCriterion("clicknum is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("clicknum is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(Integer value) {
            addCriterion("clicknum =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(Integer value) {
            addCriterion("clicknum <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(Integer value) {
            addCriterion("clicknum >", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicknum >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(Integer value) {
            addCriterion("clicknum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("clicknum <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<Integer> values) {
            addCriterion("clicknum in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<Integer> values) {
            addCriterion("clicknum not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(Integer value1, Integer value2) {
            addCriterion("clicknum between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("clicknum not between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsIsNull() {
            addCriterion("seoketwords is null");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsIsNotNull() {
            addCriterion("seoketwords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsEqualTo(String value) {
            addCriterion("seoketwords =", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsNotEqualTo(String value) {
            addCriterion("seoketwords <>", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsGreaterThan(String value) {
            addCriterion("seoketwords >", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsGreaterThanOrEqualTo(String value) {
            addCriterion("seoketwords >=", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsLessThan(String value) {
            addCriterion("seoketwords <", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsLessThanOrEqualTo(String value) {
            addCriterion("seoketwords <=", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsLike(String value) {
            addCriterion("seoketwords like", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsNotLike(String value) {
            addCriterion("seoketwords not like", value, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsIn(List<String> values) {
            addCriterion("seoketwords in", values, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsNotIn(List<String> values) {
            addCriterion("seoketwords not in", values, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsBetween(String value1, String value2) {
            addCriterion("seoketwords between", value1, value2, "seoketwords");
            return (Criteria) this;
        }

        public Criteria andSeoketwordsNotBetween(String value1, String value2) {
            addCriterion("seoketwords not between", value1, value2, "seoketwords");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andAddreassIsNull() {
            addCriterion("addreass is null");
            return (Criteria) this;
        }

        public Criteria andAddreassIsNotNull() {
            addCriterion("addreass is not null");
            return (Criteria) this;
        }

        public Criteria andAddreassEqualTo(String value) {
            addCriterion("addreass =", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassNotEqualTo(String value) {
            addCriterion("addreass <>", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassGreaterThan(String value) {
            addCriterion("addreass >", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassGreaterThanOrEqualTo(String value) {
            addCriterion("addreass >=", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassLessThan(String value) {
            addCriterion("addreass <", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassLessThanOrEqualTo(String value) {
            addCriterion("addreass <=", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassLike(String value) {
            addCriterion("addreass like", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassNotLike(String value) {
            addCriterion("addreass not like", value, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassIn(List<String> values) {
            addCriterion("addreass in", values, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassNotIn(List<String> values) {
            addCriterion("addreass not in", values, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassBetween(String value1, String value2) {
            addCriterion("addreass between", value1, value2, "addreass");
            return (Criteria) this;
        }

        public Criteria andAddreassNotBetween(String value1, String value2) {
            addCriterion("addreass not between", value1, value2, "addreass");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeIsNull() {
            addCriterion("jiezhitime is null");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeIsNotNull() {
            addCriterion("jiezhitime is not null");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeEqualTo(Date value) {
            addCriterion("jiezhitime =", value, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeNotEqualTo(Date value) {
            addCriterion("jiezhitime <>", value, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeGreaterThan(Date value) {
            addCriterion("jiezhitime >", value, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jiezhitime >=", value, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeLessThan(Date value) {
            addCriterion("jiezhitime <", value, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeLessThanOrEqualTo(Date value) {
            addCriterion("jiezhitime <=", value, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeIn(List<Date> values) {
            addCriterion("jiezhitime in", values, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeNotIn(List<Date> values) {
            addCriterion("jiezhitime not in", values, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeBetween(Date value1, Date value2) {
            addCriterion("jiezhitime between", value1, value2, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andJiezhitimeNotBetween(Date value1, Date value2) {
            addCriterion("jiezhitime not between", value1, value2, "jiezhitime");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxIsNull() {
            addCriterion("peoplenummax is null");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxIsNotNull() {
            addCriterion("peoplenummax is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxEqualTo(Integer value) {
            addCriterion("peoplenummax =", value, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxNotEqualTo(Integer value) {
            addCriterion("peoplenummax <>", value, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxGreaterThan(Integer value) {
            addCriterion("peoplenummax >", value, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("peoplenummax >=", value, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxLessThan(Integer value) {
            addCriterion("peoplenummax <", value, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxLessThanOrEqualTo(Integer value) {
            addCriterion("peoplenummax <=", value, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxIn(List<Integer> values) {
            addCriterion("peoplenummax in", values, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxNotIn(List<Integer> values) {
            addCriterion("peoplenummax not in", values, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxBetween(Integer value1, Integer value2) {
            addCriterion("peoplenummax between", value1, value2, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andPeoplenummaxNotBetween(Integer value1, Integer value2) {
            addCriterion("peoplenummax not between", value1, value2, "peoplenummax");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNull() {
            addCriterion("activityType is null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNotNull() {
            addCriterion("activityType is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeEqualTo(String value) {
            addCriterion("activityType =", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotEqualTo(String value) {
            addCriterion("activityType <>", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThan(String value) {
            addCriterion("activityType >", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("activityType >=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThan(String value) {
            addCriterion("activityType <", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThanOrEqualTo(String value) {
            addCriterion("activityType <=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLike(String value) {
            addCriterion("activityType like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotLike(String value) {
            addCriterion("activityType not like", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIn(List<String> values) {
            addCriterion("activityType in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotIn(List<String> values) {
            addCriterion("activityType not in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeBetween(String value1, String value2) {
            addCriterion("activityType between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotBetween(String value1, String value2) {
            addCriterion("activityType not between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
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