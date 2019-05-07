package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andAddrflageEqualTo(Integer value) {
            addCriterion("addrflage =", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageNotEqualTo(Integer value) {
            addCriterion("addrflage <>", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageGreaterThan(Integer value) {
            addCriterion("addrflage >", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageGreaterThanOrEqualTo(Integer value) {
            addCriterion("addrflage >=", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageLessThan(Integer value) {
            addCriterion("addrflage <", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageLessThanOrEqualTo(Integer value) {
            addCriterion("addrflage <=", value, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageIn(List<Integer> values) {
            addCriterion("addrflage in", values, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageNotIn(List<Integer> values) {
            addCriterion("addrflage not in", values, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageBetween(Integer value1, Integer value2) {
            addCriterion("addrflage between", value1, value2, "addrflage");
            return (Criteria) this;
        }

        public Criteria andAddrflageNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andOutidIsNull() {
            addCriterion("outId is null");
            return (Criteria) this;
        }

        public Criteria andOutidIsNotNull() {
            addCriterion("outId is not null");
            return (Criteria) this;
        }

        public Criteria andOutidEqualTo(Integer value) {
            addCriterion("outId =", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotEqualTo(Integer value) {
            addCriterion("outId <>", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThan(Integer value) {
            addCriterion("outId >", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThanOrEqualTo(Integer value) {
            addCriterion("outId >=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThan(Integer value) {
            addCriterion("outId <", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThanOrEqualTo(Integer value) {
            addCriterion("outId <=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidIn(List<Integer> values) {
            addCriterion("outId in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotIn(List<Integer> values) {
            addCriterion("outId not in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidBetween(Integer value1, Integer value2) {
            addCriterion("outId between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotBetween(Integer value1, Integer value2) {
            addCriterion("outId not between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filepath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filepath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filepath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filepath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filepath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filepath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filepath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filepath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filepath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filepath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filepath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filepath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filepath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filepath not between", value1, value2, "filepath");
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

        public Criteria andZanIsNull() {
            addCriterion("zan is null");
            return (Criteria) this;
        }

        public Criteria andZanIsNotNull() {
            addCriterion("zan is not null");
            return (Criteria) this;
        }

        public Criteria andZanEqualTo(Integer value) {
            addCriterion("zan =", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotEqualTo(Integer value) {
            addCriterion("zan <>", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThan(Integer value) {
            addCriterion("zan >", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThanOrEqualTo(Integer value) {
            addCriterion("zan >=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThan(Integer value) {
            addCriterion("zan <", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThanOrEqualTo(Integer value) {
            addCriterion("zan <=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanIn(List<Integer> values) {
            addCriterion("zan in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotIn(List<Integer> values) {
            addCriterion("zan not in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanBetween(Integer value1, Integer value2) {
            addCriterion("zan between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotBetween(Integer value1, Integer value2) {
            addCriterion("zan not between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andCaiIsNull() {
            addCriterion("cai is null");
            return (Criteria) this;
        }

        public Criteria andCaiIsNotNull() {
            addCriterion("cai is not null");
            return (Criteria) this;
        }

        public Criteria andCaiEqualTo(Integer value) {
            addCriterion("cai =", value, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiNotEqualTo(Integer value) {
            addCriterion("cai <>", value, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiGreaterThan(Integer value) {
            addCriterion("cai >", value, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("cai >=", value, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiLessThan(Integer value) {
            addCriterion("cai <", value, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiLessThanOrEqualTo(Integer value) {
            addCriterion("cai <=", value, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiIn(List<Integer> values) {
            addCriterion("cai in", values, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiNotIn(List<Integer> values) {
            addCriterion("cai not in", values, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiBetween(Integer value1, Integer value2) {
            addCriterion("cai between", value1, value2, "cai");
            return (Criteria) this;
        }

        public Criteria andCaiNotBetween(Integer value1, Integer value2) {
            addCriterion("cai not between", value1, value2, "cai");
            return (Criteria) this;
        }

        public Criteria andColumntypeIsNull() {
            addCriterion("columnType is null");
            return (Criteria) this;
        }

        public Criteria andColumntypeIsNotNull() {
            addCriterion("columnType is not null");
            return (Criteria) this;
        }

        public Criteria andColumntypeEqualTo(Integer value) {
            addCriterion("columnType =", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeNotEqualTo(Integer value) {
            addCriterion("columnType <>", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeGreaterThan(Integer value) {
            addCriterion("columnType >", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnType >=", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeLessThan(Integer value) {
            addCriterion("columnType <", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeLessThanOrEqualTo(Integer value) {
            addCriterion("columnType <=", value, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeIn(List<Integer> values) {
            addCriterion("columnType in", values, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeNotIn(List<Integer> values) {
            addCriterion("columnType not in", values, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeBetween(Integer value1, Integer value2) {
            addCriterion("columnType between", value1, value2, "columntype");
            return (Criteria) this;
        }

        public Criteria andColumntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("columnType not between", value1, value2, "columntype");
            return (Criteria) this;
        }

        public Criteria andShoucangIsNull() {
            addCriterion("shoucang is null");
            return (Criteria) this;
        }

        public Criteria andShoucangIsNotNull() {
            addCriterion("shoucang is not null");
            return (Criteria) this;
        }

        public Criteria andShoucangEqualTo(Integer value) {
            addCriterion("shoucang =", value, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangNotEqualTo(Integer value) {
            addCriterion("shoucang <>", value, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangGreaterThan(Integer value) {
            addCriterion("shoucang >", value, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoucang >=", value, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangLessThan(Integer value) {
            addCriterion("shoucang <", value, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangLessThanOrEqualTo(Integer value) {
            addCriterion("shoucang <=", value, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangIn(List<Integer> values) {
            addCriterion("shoucang in", values, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangNotIn(List<Integer> values) {
            addCriterion("shoucang not in", values, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangBetween(Integer value1, Integer value2) {
            addCriterion("shoucang between", value1, value2, "shoucang");
            return (Criteria) this;
        }

        public Criteria andShoucangNotBetween(Integer value1, Integer value2) {
            addCriterion("shoucang not between", value1, value2, "shoucang");
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

        public Criteria andSpecialtypeIsNull() {
            addCriterion("specialType is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeIsNotNull() {
            addCriterion("specialType is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeEqualTo(Integer value) {
            addCriterion("specialType =", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeNotEqualTo(Integer value) {
            addCriterion("specialType <>", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeGreaterThan(Integer value) {
            addCriterion("specialType >", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialType >=", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeLessThan(Integer value) {
            addCriterion("specialType <", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeLessThanOrEqualTo(Integer value) {
            addCriterion("specialType <=", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeIn(List<Integer> values) {
            addCriterion("specialType in", values, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeNotIn(List<Integer> values) {
            addCriterion("specialType not in", values, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeBetween(Integer value1, Integer value2) {
            addCriterion("specialType between", value1, value2, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("specialType not between", value1, value2, "specialtype");
            return (Criteria) this;
        }

        public Criteria andColumn22IsNull() {
            addCriterion("Column_22 is null");
            return (Criteria) this;
        }

        public Criteria andColumn22IsNotNull() {
            addCriterion("Column_22 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn22EqualTo(String value) {
            addCriterion("Column_22 =", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotEqualTo(String value) {
            addCriterion("Column_22 <>", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22GreaterThan(String value) {
            addCriterion("Column_22 >", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22GreaterThanOrEqualTo(String value) {
            addCriterion("Column_22 >=", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22LessThan(String value) {
            addCriterion("Column_22 <", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22LessThanOrEqualTo(String value) {
            addCriterion("Column_22 <=", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22Like(String value) {
            addCriterion("Column_22 like", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotLike(String value) {
            addCriterion("Column_22 not like", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22In(List<String> values) {
            addCriterion("Column_22 in", values, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotIn(List<String> values) {
            addCriterion("Column_22 not in", values, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22Between(String value1, String value2) {
            addCriterion("Column_22 between", value1, value2, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotBetween(String value1, String value2) {
            addCriterion("Column_22 not between", value1, value2, "column22");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNull() {
            addCriterion("column_type is null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNotNull() {
            addCriterion("column_type is not null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeEqualTo(Integer value) {
            addCriterion("column_type =", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotEqualTo(Integer value) {
            addCriterion("column_type <>", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThan(Integer value) {
            addCriterion("column_type >", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("column_type >=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThan(Integer value) {
            addCriterion("column_type <", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThanOrEqualTo(Integer value) {
            addCriterion("column_type <=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIn(List<Integer> values) {
            addCriterion("column_type in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotIn(List<Integer> values) {
            addCriterion("column_type not in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeBetween(Integer value1, Integer value2) {
            addCriterion("column_type between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("column_type not between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIsNull() {
            addCriterion("special_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIsNotNull() {
            addCriterion("special_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeEqualTo(Integer value) {
            addCriterion("special_type =", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotEqualTo(Integer value) {
            addCriterion("special_type <>", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeGreaterThan(Integer value) {
            addCriterion("special_type >", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_type >=", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeLessThan(Integer value) {
            addCriterion("special_type <", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeLessThanOrEqualTo(Integer value) {
            addCriterion("special_type <=", value, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeIn(List<Integer> values) {
            addCriterion("special_type in", values, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotIn(List<Integer> values) {
            addCriterion("special_type not in", values, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeBetween(Integer value1, Integer value2) {
            addCriterion("special_type between", value1, value2, "specialType");
            return (Criteria) this;
        }

        public Criteria andSpecialTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("special_type not between", value1, value2, "specialType");
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

        public Criteria andOutIdIsNull() {
            addCriterion("out_id is null");
            return (Criteria) this;
        }

        public Criteria andOutIdIsNotNull() {
            addCriterion("out_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutIdEqualTo(Integer value) {
            addCriterion("out_id =", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotEqualTo(Integer value) {
            addCriterion("out_id <>", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdGreaterThan(Integer value) {
            addCriterion("out_id >", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_id >=", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdLessThan(Integer value) {
            addCriterion("out_id <", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdLessThanOrEqualTo(Integer value) {
            addCriterion("out_id <=", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdIn(List<Integer> values) {
            addCriterion("out_id in", values, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotIn(List<Integer> values) {
            addCriterion("out_id not in", values, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdBetween(Integer value1, Integer value2) {
            addCriterion("out_id between", value1, value2, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("out_id not between", value1, value2, "outId");
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