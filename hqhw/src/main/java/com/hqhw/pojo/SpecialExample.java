package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialExample() {
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

        public Criteria andDiquIsNull() {
            addCriterion("diqu is null");
            return (Criteria) this;
        }

        public Criteria andDiquIsNotNull() {
            addCriterion("diqu is not null");
            return (Criteria) this;
        }

        public Criteria andDiquEqualTo(String value) {
            addCriterion("diqu =", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotEqualTo(String value) {
            addCriterion("diqu <>", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquGreaterThan(String value) {
            addCriterion("diqu >", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquGreaterThanOrEqualTo(String value) {
            addCriterion("diqu >=", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquLessThan(String value) {
            addCriterion("diqu <", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquLessThanOrEqualTo(String value) {
            addCriterion("diqu <=", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquLike(String value) {
            addCriterion("diqu like", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotLike(String value) {
            addCriterion("diqu not like", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquIn(List<String> values) {
            addCriterion("diqu in", values, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotIn(List<String> values) {
            addCriterion("diqu not in", values, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquBetween(String value1, String value2) {
            addCriterion("diqu between", value1, value2, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotBetween(String value1, String value2) {
            addCriterion("diqu not between", value1, value2, "diqu");
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
            addCriterion("sortId is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("sortId is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("sortId =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("sortId <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("sortId >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortId >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("sortId <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("sortId <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("sortId in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("sortId not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("sortId between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("sortId not between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andAddrflageIsNull() {
            addCriterion("addrflage is null");
            return (Criteria) this;
        }

        public Criteria andAddrflageIsNotNull() {
            addCriterion("addrflage is not null");
            return (Criteria) this;
        }

        public Criteria andAddrflageEqualTo(String value) {
            addCriterion("addrflage =", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageNotEqualTo(String value) {
            addCriterion("addrflage <>", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageGreaterThan(String value) {
            addCriterion("addrflage >", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageGreaterThanOrEqualTo(String value) {
            addCriterion("addrflage >=", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageLessThan(String value) {
            addCriterion("addrflage <", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageLessThanOrEqualTo(String value) {
            addCriterion("addrflage <=", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageLike(String value) {
            addCriterion("addrflage like", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageNotLike(String value) {
            addCriterion("addrflage not like", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageIn(List<String> values) {
            addCriterion("addrflage in", values, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageNotIn(List<String> values) {
            addCriterion("addrflage not in", values, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageBetween(String value1, String value2) {
            addCriterion("addrflage between", value1, value2, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageNotBetween(String value1, String value2) {
            addCriterion("addrflage not between", value1, value2, "addrflage");
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
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

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(String value) {
            addCriterion("publishtime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(String value) {
            addCriterion("publishtime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(String value) {
            addCriterion("publishtime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishtime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(String value) {
            addCriterion("publishtime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(String value) {
            addCriterion("publishtime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLike(String value) {
            addCriterion("publishtime like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotLike(String value) {
            addCriterion("publishtime not like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<String> values) {
            addCriterion("publishtime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<String> values) {
            addCriterion("publishtime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(String value1, String value2) {
            addCriterion("publishtime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(String value1, String value2) {
            addCriterion("publishtime not between", value1, value2, "publishtime");
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

        public Criteria andSeokeywordIsNull() {
            addCriterion("Seokeyword is null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIsNotNull() {
            addCriterion("Seokeyword is not null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordEqualTo(String value) {
            addCriterion("Seokeyword =", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotEqualTo(String value) {
            addCriterion("Seokeyword <>", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThan(String value) {
            addCriterion("Seokeyword >", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThanOrEqualTo(String value) {
            addCriterion("Seokeyword >=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThan(String value) {
            addCriterion("Seokeyword <", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThanOrEqualTo(String value) {
            addCriterion("Seokeyword <=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLike(String value) {
            addCriterion("Seokeyword like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotLike(String value) {
            addCriterion("Seokeyword not like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIn(List<String> values) {
            addCriterion("Seokeyword in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotIn(List<String> values) {
            addCriterion("Seokeyword not in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordBetween(String value1, String value2) {
            addCriterion("Seokeyword between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotBetween(String value1, String value2) {
            addCriterion("Seokeyword not between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNull() {
            addCriterion("Seodescription is null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIsNotNull() {
            addCriterion("Seodescription is not null");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionEqualTo(String value) {
            addCriterion("Seodescription =", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotEqualTo(String value) {
            addCriterion("Seodescription <>", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThan(String value) {
            addCriterion("Seodescription >", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Seodescription >=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThan(String value) {
            addCriterion("Seodescription <", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLessThanOrEqualTo(String value) {
            addCriterion("Seodescription <=", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionLike(String value) {
            addCriterion("Seodescription like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotLike(String value) {
            addCriterion("Seodescription not like", value, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionIn(List<String> values) {
            addCriterion("Seodescription in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotIn(List<String> values) {
            addCriterion("Seodescription not in", values, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionBetween(String value1, String value2) {
            addCriterion("Seodescription between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andSeodescriptionNotBetween(String value1, String value2) {
            addCriterion("Seodescription not between", value1, value2, "seodescription");
            return (Criteria) this;
        }

        public Criteria andPublishnameIsNull() {
            addCriterion("publishname is null");
            return (Criteria) this;
        }

        public Criteria andPublishnameIsNotNull() {
            addCriterion("publishname is not null");
            return (Criteria) this;
        }

        public Criteria andPublishnameEqualTo(String value) {
            addCriterion("publishname =", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameNotEqualTo(String value) {
            addCriterion("publishname <>", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameGreaterThan(String value) {
            addCriterion("publishname >", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameGreaterThanOrEqualTo(String value) {
            addCriterion("publishname >=", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameLessThan(String value) {
            addCriterion("publishname <", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameLessThanOrEqualTo(String value) {
            addCriterion("publishname <=", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameLike(String value) {
            addCriterion("publishname like", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameNotLike(String value) {
            addCriterion("publishname not like", value, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameIn(List<String> values) {
            addCriterion("publishname in", values, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameNotIn(List<String> values) {
            addCriterion("publishname not in", values, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameBetween(String value1, String value2) {
            addCriterion("publishname between", value1, value2, "publishname");
            return (Criteria) this;
        }

        public Criteria andPublishnameNotBetween(String value1, String value2) {
            addCriterion("publishname not between", value1, value2, "publishname");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
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