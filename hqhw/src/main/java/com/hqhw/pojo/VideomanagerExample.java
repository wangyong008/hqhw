package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideomanagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideomanagerExample() {
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

        public Criteria andPictureaddressIsNull() {
            addCriterion("pictureAddress is null");
            return (Criteria) this;
        }

        public Criteria andPictureaddressIsNotNull() {
            addCriterion("pictureAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPictureaddressEqualTo(String value) {
            addCriterion("pictureAddress =", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotEqualTo(String value) {
            addCriterion("pictureAddress <>", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressGreaterThan(String value) {
            addCriterion("pictureAddress >", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pictureAddress >=", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLessThan(String value) {
            addCriterion("pictureAddress <", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLessThanOrEqualTo(String value) {
            addCriterion("pictureAddress <=", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLike(String value) {
            addCriterion("pictureAddress like", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotLike(String value) {
            addCriterion("pictureAddress not like", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressIn(List<String> values) {
            addCriterion("pictureAddress in", values, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotIn(List<String> values) {
            addCriterion("pictureAddress not in", values, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressBetween(String value1, String value2) {
            addCriterion("pictureAddress between", value1, value2, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotBetween(String value1, String value2) {
            addCriterion("pictureAddress not between", value1, value2, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIsNull() {
            addCriterion("videoAddress is null");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIsNotNull() {
            addCriterion("videoAddress is not null");
            return (Criteria) this;
        }

        public Criteria andVideoaddressEqualTo(String value) {
            addCriterion("videoAddress =", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotEqualTo(String value) {
            addCriterion("videoAddress <>", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressGreaterThan(String value) {
            addCriterion("videoAddress >", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("videoAddress >=", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLessThan(String value) {
            addCriterion("videoAddress <", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLessThanOrEqualTo(String value) {
            addCriterion("videoAddress <=", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressLike(String value) {
            addCriterion("videoAddress like", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotLike(String value) {
            addCriterion("videoAddress not like", value, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressIn(List<String> values) {
            addCriterion("videoAddress in", values, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotIn(List<String> values) {
            addCriterion("videoAddress not in", values, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressBetween(String value1, String value2) {
            addCriterion("videoAddress between", value1, value2, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andVideoaddressNotBetween(String value1, String value2) {
            addCriterion("videoAddress not between", value1, value2, "videoaddress");
            return (Criteria) this;
        }

        public Criteria andBelongsortIsNull() {
            addCriterion("belongSort is null");
            return (Criteria) this;
        }

        public Criteria andBelongsortIsNotNull() {
            addCriterion("belongSort is not null");
            return (Criteria) this;
        }

        public Criteria andBelongsortEqualTo(Integer value) {
            addCriterion("belongSort =", value, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortNotEqualTo(Integer value) {
            addCriterion("belongSort <>", value, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortGreaterThan(Integer value) {
            addCriterion("belongSort >", value, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortGreaterThanOrEqualTo(Integer value) {
            addCriterion("belongSort >=", value, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortLessThan(Integer value) {
            addCriterion("belongSort <", value, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortLessThanOrEqualTo(Integer value) {
            addCriterion("belongSort <=", value, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortIn(List<Integer> values) {
            addCriterion("belongSort in", values, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortNotIn(List<Integer> values) {
            addCriterion("belongSort not in", values, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortBetween(Integer value1, Integer value2) {
            addCriterion("belongSort between", value1, value2, "belongsort");
            return (Criteria) this;
        }

        public Criteria andBelongsortNotBetween(Integer value1, Integer value2) {
            addCriterion("belongSort not between", value1, value2, "belongsort");
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

        public Criteria andVideokeywordIsNull() {
            addCriterion("videoKeyWord is null");
            return (Criteria) this;
        }

        public Criteria andVideokeywordIsNotNull() {
            addCriterion("videoKeyWord is not null");
            return (Criteria) this;
        }

        public Criteria andVideokeywordEqualTo(String value) {
            addCriterion("videoKeyWord =", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordNotEqualTo(String value) {
            addCriterion("videoKeyWord <>", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordGreaterThan(String value) {
            addCriterion("videoKeyWord >", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordGreaterThanOrEqualTo(String value) {
            addCriterion("videoKeyWord >=", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordLessThan(String value) {
            addCriterion("videoKeyWord <", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordLessThanOrEqualTo(String value) {
            addCriterion("videoKeyWord <=", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordLike(String value) {
            addCriterion("videoKeyWord like", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordNotLike(String value) {
            addCriterion("videoKeyWord not like", value, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordIn(List<String> values) {
            addCriterion("videoKeyWord in", values, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordNotIn(List<String> values) {
            addCriterion("videoKeyWord not in", values, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordBetween(String value1, String value2) {
            addCriterion("videoKeyWord between", value1, value2, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideokeywordNotBetween(String value1, String value2) {
            addCriterion("videoKeyWord not between", value1, value2, "videokeyword");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionIsNull() {
            addCriterion("videoDescription is null");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionIsNotNull() {
            addCriterion("videoDescription is not null");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionEqualTo(String value) {
            addCriterion("videoDescription =", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionNotEqualTo(String value) {
            addCriterion("videoDescription <>", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionGreaterThan(String value) {
            addCriterion("videoDescription >", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("videoDescription >=", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionLessThan(String value) {
            addCriterion("videoDescription <", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionLessThanOrEqualTo(String value) {
            addCriterion("videoDescription <=", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionLike(String value) {
            addCriterion("videoDescription like", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionNotLike(String value) {
            addCriterion("videoDescription not like", value, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionIn(List<String> values) {
            addCriterion("videoDescription in", values, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionNotIn(List<String> values) {
            addCriterion("videoDescription not in", values, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionBetween(String value1, String value2) {
            addCriterion("videoDescription between", value1, value2, "videodescription");
            return (Criteria) this;
        }

        public Criteria andVideodescriptionNotBetween(String value1, String value2) {
            addCriterion("videoDescription not between", value1, value2, "videodescription");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
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

        public Criteria andBelongaccountIsNull() {
            addCriterion("belongAccount is null");
            return (Criteria) this;
        }

        public Criteria andBelongaccountIsNotNull() {
            addCriterion("belongAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBelongaccountEqualTo(Integer value) {
            addCriterion("belongAccount =", value, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountNotEqualTo(Integer value) {
            addCriterion("belongAccount <>", value, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountGreaterThan(Integer value) {
            addCriterion("belongAccount >", value, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("belongAccount >=", value, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountLessThan(Integer value) {
            addCriterion("belongAccount <", value, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountLessThanOrEqualTo(Integer value) {
            addCriterion("belongAccount <=", value, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountIn(List<Integer> values) {
            addCriterion("belongAccount in", values, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountNotIn(List<Integer> values) {
            addCriterion("belongAccount not in", values, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountBetween(Integer value1, Integer value2) {
            addCriterion("belongAccount between", value1, value2, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andBelongaccountNotBetween(Integer value1, Integer value2) {
            addCriterion("belongAccount not between", value1, value2, "belongaccount");
            return (Criteria) this;
        }

        public Criteria andNpassresonIsNull() {
            addCriterion("nPassReson is null");
            return (Criteria) this;
        }

        public Criteria andNpassresonIsNotNull() {
            addCriterion("nPassReson is not null");
            return (Criteria) this;
        }

        public Criteria andNpassresonEqualTo(String value) {
            addCriterion("nPassReson =", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonNotEqualTo(String value) {
            addCriterion("nPassReson <>", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonGreaterThan(String value) {
            addCriterion("nPassReson >", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonGreaterThanOrEqualTo(String value) {
            addCriterion("nPassReson >=", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonLessThan(String value) {
            addCriterion("nPassReson <", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonLessThanOrEqualTo(String value) {
            addCriterion("nPassReson <=", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonLike(String value) {
            addCriterion("nPassReson like", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonNotLike(String value) {
            addCriterion("nPassReson not like", value, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonIn(List<String> values) {
            addCriterion("nPassReson in", values, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonNotIn(List<String> values) {
            addCriterion("nPassReson not in", values, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonBetween(String value1, String value2) {
            addCriterion("nPassReson between", value1, value2, "npassreson");
            return (Criteria) this;
        }

        public Criteria andNpassresonNotBetween(String value1, String value2) {
            addCriterion("nPassReson not between", value1, value2, "npassreson");
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

        public Criteria andVedionumberIsNull() {
            addCriterion("vedioNumber is null");
            return (Criteria) this;
        }

        public Criteria andVedionumberIsNotNull() {
            addCriterion("vedioNumber is not null");
            return (Criteria) this;
        }

        public Criteria andVedionumberEqualTo(Integer value) {
            addCriterion("vedioNumber =", value, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberNotEqualTo(Integer value) {
            addCriterion("vedioNumber <>", value, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberGreaterThan(Integer value) {
            addCriterion("vedioNumber >", value, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedioNumber >=", value, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberLessThan(Integer value) {
            addCriterion("vedioNumber <", value, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberLessThanOrEqualTo(Integer value) {
            addCriterion("vedioNumber <=", value, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberIn(List<Integer> values) {
            addCriterion("vedioNumber in", values, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberNotIn(List<Integer> values) {
            addCriterion("vedioNumber not in", values, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberBetween(Integer value1, Integer value2) {
            addCriterion("vedioNumber between", value1, value2, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVedionumberNotBetween(Integer value1, Integer value2) {
            addCriterion("vedioNumber not between", value1, value2, "vedionumber");
            return (Criteria) this;
        }

        public Criteria andVediogoodIsNull() {
            addCriterion("vedioGood is null");
            return (Criteria) this;
        }

        public Criteria andVediogoodIsNotNull() {
            addCriterion("vedioGood is not null");
            return (Criteria) this;
        }

        public Criteria andVediogoodEqualTo(Integer value) {
            addCriterion("vedioGood =", value, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodNotEqualTo(Integer value) {
            addCriterion("vedioGood <>", value, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodGreaterThan(Integer value) {
            addCriterion("vedioGood >", value, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedioGood >=", value, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodLessThan(Integer value) {
            addCriterion("vedioGood <", value, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodLessThanOrEqualTo(Integer value) {
            addCriterion("vedioGood <=", value, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodIn(List<Integer> values) {
            addCriterion("vedioGood in", values, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodNotIn(List<Integer> values) {
            addCriterion("vedioGood not in", values, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodBetween(Integer value1, Integer value2) {
            addCriterion("vedioGood between", value1, value2, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediogoodNotBetween(Integer value1, Integer value2) {
            addCriterion("vedioGood not between", value1, value2, "vediogood");
            return (Criteria) this;
        }

        public Criteria andVediobadIsNull() {
            addCriterion("vedioBad is null");
            return (Criteria) this;
        }

        public Criteria andVediobadIsNotNull() {
            addCriterion("vedioBad is not null");
            return (Criteria) this;
        }

        public Criteria andVediobadEqualTo(Integer value) {
            addCriterion("vedioBad =", value, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadNotEqualTo(Integer value) {
            addCriterion("vedioBad <>", value, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadGreaterThan(Integer value) {
            addCriterion("vedioBad >", value, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedioBad >=", value, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadLessThan(Integer value) {
            addCriterion("vedioBad <", value, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadLessThanOrEqualTo(Integer value) {
            addCriterion("vedioBad <=", value, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadIn(List<Integer> values) {
            addCriterion("vedioBad in", values, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadNotIn(List<Integer> values) {
            addCriterion("vedioBad not in", values, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadBetween(Integer value1, Integer value2) {
            addCriterion("vedioBad between", value1, value2, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediobadNotBetween(Integer value1, Integer value2) {
            addCriterion("vedioBad not between", value1, value2, "vediobad");
            return (Criteria) this;
        }

        public Criteria andVediokeepIsNull() {
            addCriterion("vedioKeep is null");
            return (Criteria) this;
        }

        public Criteria andVediokeepIsNotNull() {
            addCriterion("vedioKeep is not null");
            return (Criteria) this;
        }

        public Criteria andVediokeepEqualTo(Integer value) {
            addCriterion("vedioKeep =", value, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepNotEqualTo(Integer value) {
            addCriterion("vedioKeep <>", value, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepGreaterThan(Integer value) {
            addCriterion("vedioKeep >", value, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedioKeep >=", value, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepLessThan(Integer value) {
            addCriterion("vedioKeep <", value, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepLessThanOrEqualTo(Integer value) {
            addCriterion("vedioKeep <=", value, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepIn(List<Integer> values) {
            addCriterion("vedioKeep in", values, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepNotIn(List<Integer> values) {
            addCriterion("vedioKeep not in", values, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepBetween(Integer value1, Integer value2) {
            addCriterion("vedioKeep between", value1, value2, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andVediokeepNotBetween(Integer value1, Integer value2) {
            addCriterion("vedioKeep not between", value1, value2, "vediokeep");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andNPassResonIsNull() {
            addCriterion("n_pass_reson is null");
            return (Criteria) this;
        }

        public Criteria andNPassResonIsNotNull() {
            addCriterion("n_pass_reson is not null");
            return (Criteria) this;
        }

        public Criteria andNPassResonEqualTo(String value) {
            addCriterion("n_pass_reson =", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonNotEqualTo(String value) {
            addCriterion("n_pass_reson <>", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonGreaterThan(String value) {
            addCriterion("n_pass_reson >", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonGreaterThanOrEqualTo(String value) {
            addCriterion("n_pass_reson >=", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonLessThan(String value) {
            addCriterion("n_pass_reson <", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonLessThanOrEqualTo(String value) {
            addCriterion("n_pass_reson <=", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonLike(String value) {
            addCriterion("n_pass_reson like", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonNotLike(String value) {
            addCriterion("n_pass_reson not like", value, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonIn(List<String> values) {
            addCriterion("n_pass_reson in", values, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonNotIn(List<String> values) {
            addCriterion("n_pass_reson not in", values, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonBetween(String value1, String value2) {
            addCriterion("n_pass_reson between", value1, value2, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andNPassResonNotBetween(String value1, String value2) {
            addCriterion("n_pass_reson not between", value1, value2, "nPassReson");
            return (Criteria) this;
        }

        public Criteria andPictureAddressIsNull() {
            addCriterion("picture_address is null");
            return (Criteria) this;
        }

        public Criteria andPictureAddressIsNotNull() {
            addCriterion("picture_address is not null");
            return (Criteria) this;
        }

        public Criteria andPictureAddressEqualTo(String value) {
            addCriterion("picture_address =", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotEqualTo(String value) {
            addCriterion("picture_address <>", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressGreaterThan(String value) {
            addCriterion("picture_address >", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressGreaterThanOrEqualTo(String value) {
            addCriterion("picture_address >=", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressLessThan(String value) {
            addCriterion("picture_address <", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressLessThanOrEqualTo(String value) {
            addCriterion("picture_address <=", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressLike(String value) {
            addCriterion("picture_address like", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotLike(String value) {
            addCriterion("picture_address not like", value, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressIn(List<String> values) {
            addCriterion("picture_address in", values, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotIn(List<String> values) {
            addCriterion("picture_address not in", values, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressBetween(String value1, String value2) {
            addCriterion("picture_address between", value1, value2, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andPictureAddressNotBetween(String value1, String value2) {
            addCriterion("picture_address not between", value1, value2, "pictureAddress");
            return (Criteria) this;
        }

        public Criteria andVedioBadIsNull() {
            addCriterion("vedio_bad is null");
            return (Criteria) this;
        }

        public Criteria andVedioBadIsNotNull() {
            addCriterion("vedio_bad is not null");
            return (Criteria) this;
        }

        public Criteria andVedioBadEqualTo(Integer value) {
            addCriterion("vedio_bad =", value, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadNotEqualTo(Integer value) {
            addCriterion("vedio_bad <>", value, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadGreaterThan(Integer value) {
            addCriterion("vedio_bad >", value, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_bad >=", value, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadLessThan(Integer value) {
            addCriterion("vedio_bad <", value, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_bad <=", value, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadIn(List<Integer> values) {
            addCriterion("vedio_bad in", values, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadNotIn(List<Integer> values) {
            addCriterion("vedio_bad not in", values, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadBetween(Integer value1, Integer value2) {
            addCriterion("vedio_bad between", value1, value2, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioBadNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_bad not between", value1, value2, "vedioBad");
            return (Criteria) this;
        }

        public Criteria andVedioGoodIsNull() {
            addCriterion("vedio_good is null");
            return (Criteria) this;
        }

        public Criteria andVedioGoodIsNotNull() {
            addCriterion("vedio_good is not null");
            return (Criteria) this;
        }

        public Criteria andVedioGoodEqualTo(Integer value) {
            addCriterion("vedio_good =", value, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodNotEqualTo(Integer value) {
            addCriterion("vedio_good <>", value, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodGreaterThan(Integer value) {
            addCriterion("vedio_good >", value, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_good >=", value, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodLessThan(Integer value) {
            addCriterion("vedio_good <", value, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_good <=", value, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodIn(List<Integer> values) {
            addCriterion("vedio_good in", values, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodNotIn(List<Integer> values) {
            addCriterion("vedio_good not in", values, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodBetween(Integer value1, Integer value2) {
            addCriterion("vedio_good between", value1, value2, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_good not between", value1, value2, "vedioGood");
            return (Criteria) this;
        }

        public Criteria andVedioKeepIsNull() {
            addCriterion("vedio_keep is null");
            return (Criteria) this;
        }

        public Criteria andVedioKeepIsNotNull() {
            addCriterion("vedio_keep is not null");
            return (Criteria) this;
        }

        public Criteria andVedioKeepEqualTo(Integer value) {
            addCriterion("vedio_keep =", value, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepNotEqualTo(Integer value) {
            addCriterion("vedio_keep <>", value, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepGreaterThan(Integer value) {
            addCriterion("vedio_keep >", value, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_keep >=", value, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepLessThan(Integer value) {
            addCriterion("vedio_keep <", value, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_keep <=", value, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepIn(List<Integer> values) {
            addCriterion("vedio_keep in", values, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepNotIn(List<Integer> values) {
            addCriterion("vedio_keep not in", values, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepBetween(Integer value1, Integer value2) {
            addCriterion("vedio_keep between", value1, value2, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioKeepNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_keep not between", value1, value2, "vedioKeep");
            return (Criteria) this;
        }

        public Criteria andVedioNumberIsNull() {
            addCriterion("vedio_number is null");
            return (Criteria) this;
        }

        public Criteria andVedioNumberIsNotNull() {
            addCriterion("vedio_number is not null");
            return (Criteria) this;
        }

        public Criteria andVedioNumberEqualTo(Integer value) {
            addCriterion("vedio_number =", value, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberNotEqualTo(Integer value) {
            addCriterion("vedio_number <>", value, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberGreaterThan(Integer value) {
            addCriterion("vedio_number >", value, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_number >=", value, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberLessThan(Integer value) {
            addCriterion("vedio_number <", value, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_number <=", value, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberIn(List<Integer> values) {
            addCriterion("vedio_number in", values, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberNotIn(List<Integer> values) {
            addCriterion("vedio_number not in", values, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberBetween(Integer value1, Integer value2) {
            addCriterion("vedio_number between", value1, value2, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVedioNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_number not between", value1, value2, "vedioNumber");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIsNull() {
            addCriterion("video_address is null");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIsNotNull() {
            addCriterion("video_address is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAddressEqualTo(String value) {
            addCriterion("video_address =", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotEqualTo(String value) {
            addCriterion("video_address <>", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressGreaterThan(String value) {
            addCriterion("video_address >", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("video_address >=", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLessThan(String value) {
            addCriterion("video_address <", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLessThanOrEqualTo(String value) {
            addCriterion("video_address <=", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLike(String value) {
            addCriterion("video_address like", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotLike(String value) {
            addCriterion("video_address not like", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIn(List<String> values) {
            addCriterion("video_address in", values, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotIn(List<String> values) {
            addCriterion("video_address not in", values, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressBetween(String value1, String value2) {
            addCriterion("video_address between", value1, value2, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotBetween(String value1, String value2) {
            addCriterion("video_address not between", value1, value2, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionIsNull() {
            addCriterion("video_description is null");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionIsNotNull() {
            addCriterion("video_description is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionEqualTo(String value) {
            addCriterion("video_description =", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotEqualTo(String value) {
            addCriterion("video_description <>", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionGreaterThan(String value) {
            addCriterion("video_description >", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("video_description >=", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionLessThan(String value) {
            addCriterion("video_description <", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("video_description <=", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionLike(String value) {
            addCriterion("video_description like", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotLike(String value) {
            addCriterion("video_description not like", value, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionIn(List<String> values) {
            addCriterion("video_description in", values, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotIn(List<String> values) {
            addCriterion("video_description not in", values, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionBetween(String value1, String value2) {
            addCriterion("video_description between", value1, value2, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoDescriptionNotBetween(String value1, String value2) {
            addCriterion("video_description not between", value1, value2, "videoDescription");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordIsNull() {
            addCriterion("video_key_word is null");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordIsNotNull() {
            addCriterion("video_key_word is not null");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordEqualTo(String value) {
            addCriterion("video_key_word =", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordNotEqualTo(String value) {
            addCriterion("video_key_word <>", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordGreaterThan(String value) {
            addCriterion("video_key_word >", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("video_key_word >=", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordLessThan(String value) {
            addCriterion("video_key_word <", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordLessThanOrEqualTo(String value) {
            addCriterion("video_key_word <=", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordLike(String value) {
            addCriterion("video_key_word like", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordNotLike(String value) {
            addCriterion("video_key_word not like", value, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordIn(List<String> values) {
            addCriterion("video_key_word in", values, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordNotIn(List<String> values) {
            addCriterion("video_key_word not in", values, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordBetween(String value1, String value2) {
            addCriterion("video_key_word between", value1, value2, "videoKeyWord");
            return (Criteria) this;
        }

        public Criteria andVideoKeyWordNotBetween(String value1, String value2) {
            addCriterion("video_key_word not between", value1, value2, "videoKeyWord");
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

        public Criteria andBelongAccountIsNull() {
            addCriterion("belong_account is null");
            return (Criteria) this;
        }

        public Criteria andBelongAccountIsNotNull() {
            addCriterion("belong_account is not null");
            return (Criteria) this;
        }

        public Criteria andBelongAccountEqualTo(Integer value) {
            addCriterion("belong_account =", value, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountNotEqualTo(Integer value) {
            addCriterion("belong_account <>", value, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountGreaterThan(Integer value) {
            addCriterion("belong_account >", value, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("belong_account >=", value, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountLessThan(Integer value) {
            addCriterion("belong_account <", value, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountLessThanOrEqualTo(Integer value) {
            addCriterion("belong_account <=", value, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountIn(List<Integer> values) {
            addCriterion("belong_account in", values, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountNotIn(List<Integer> values) {
            addCriterion("belong_account not in", values, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountBetween(Integer value1, Integer value2) {
            addCriterion("belong_account between", value1, value2, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("belong_account not between", value1, value2, "belongAccount");
            return (Criteria) this;
        }

        public Criteria andBelongSortIsNull() {
            addCriterion("belong_sort is null");
            return (Criteria) this;
        }

        public Criteria andBelongSortIsNotNull() {
            addCriterion("belong_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBelongSortEqualTo(Integer value) {
            addCriterion("belong_sort =", value, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortNotEqualTo(Integer value) {
            addCriterion("belong_sort <>", value, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortGreaterThan(Integer value) {
            addCriterion("belong_sort >", value, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("belong_sort >=", value, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortLessThan(Integer value) {
            addCriterion("belong_sort <", value, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortLessThanOrEqualTo(Integer value) {
            addCriterion("belong_sort <=", value, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortIn(List<Integer> values) {
            addCriterion("belong_sort in", values, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortNotIn(List<Integer> values) {
            addCriterion("belong_sort not in", values, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortBetween(Integer value1, Integer value2) {
            addCriterion("belong_sort between", value1, value2, "belongSort");
            return (Criteria) this;
        }

        public Criteria andBelongSortNotBetween(Integer value1, Integer value2) {
            addCriterion("belong_sort not between", value1, value2, "belongSort");
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