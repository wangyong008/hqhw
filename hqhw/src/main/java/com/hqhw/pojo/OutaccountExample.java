package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class OutaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutaccountExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNikenameIsNull() {
            addCriterion("nikeName is null");
            return (Criteria) this;
        }

        public Criteria andNikenameIsNotNull() {
            addCriterion("nikeName is not null");
            return (Criteria) this;
        }

        public Criteria andNikenameEqualTo(String value) {
            addCriterion("nikeName =", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameNotEqualTo(String value) {
            addCriterion("nikeName <>", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameGreaterThan(String value) {
            addCriterion("nikeName >", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameGreaterThanOrEqualTo(String value) {
            addCriterion("nikeName >=", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameLessThan(String value) {
            addCriterion("nikeName <", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameLessThanOrEqualTo(String value) {
            addCriterion("nikeName <=", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameLike(String value) {
            addCriterion("nikeName like", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameNotLike(String value) {
            addCriterion("nikeName not like", value, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameIn(List<String> values) {
            addCriterion("nikeName in", values, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameNotIn(List<String> values) {
            addCriterion("nikeName not in", values, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameBetween(String value1, String value2) {
            addCriterion("nikeName between", value1, value2, "nikename");
            return (Criteria) this;
        }

        public Criteria andNikenameNotBetween(String value1, String value2) {
            addCriterion("nikeName not between", value1, value2, "nikename");
            return (Criteria) this;
        }

        public Criteria andOdescribeIsNull() {
            addCriterion("odescribe is null");
            return (Criteria) this;
        }

        public Criteria andOdescribeIsNotNull() {
            addCriterion("odescribe is not null");
            return (Criteria) this;
        }

        public Criteria andOdescribeEqualTo(String value) {
            addCriterion("odescribe =", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeNotEqualTo(String value) {
            addCriterion("odescribe <>", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeGreaterThan(String value) {
            addCriterion("odescribe >", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("odescribe >=", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeLessThan(String value) {
            addCriterion("odescribe <", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeLessThanOrEqualTo(String value) {
            addCriterion("odescribe <=", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeLike(String value) {
            addCriterion("odescribe like", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeNotLike(String value) {
            addCriterion("odescribe not like", value, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeIn(List<String> values) {
            addCriterion("odescribe in", values, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeNotIn(List<String> values) {
            addCriterion("odescribe not in", values, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeBetween(String value1, String value2) {
            addCriterion("odescribe between", value1, value2, "odescribe");
            return (Criteria) this;
        }

        public Criteria andOdescribeNotBetween(String value1, String value2) {
            addCriterion("odescribe not between", value1, value2, "odescribe");
            return (Criteria) this;
        }

        public Criteria andHeadpictureIsNull() {
            addCriterion("headPicture is null");
            return (Criteria) this;
        }

        public Criteria andHeadpictureIsNotNull() {
            addCriterion("headPicture is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpictureEqualTo(String value) {
            addCriterion("headPicture =", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureNotEqualTo(String value) {
            addCriterion("headPicture <>", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureGreaterThan(String value) {
            addCriterion("headPicture >", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureGreaterThanOrEqualTo(String value) {
            addCriterion("headPicture >=", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureLessThan(String value) {
            addCriterion("headPicture <", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureLessThanOrEqualTo(String value) {
            addCriterion("headPicture <=", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureLike(String value) {
            addCriterion("headPicture like", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureNotLike(String value) {
            addCriterion("headPicture not like", value, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureIn(List<String> values) {
            addCriterion("headPicture in", values, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureNotIn(List<String> values) {
            addCriterion("headPicture not in", values, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureBetween(String value1, String value2) {
            addCriterion("headPicture between", value1, value2, "headpicture");
            return (Criteria) this;
        }

        public Criteria andHeadpictureNotBetween(String value1, String value2) {
            addCriterion("headPicture not between", value1, value2, "headpicture");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andBanreasonIsNull() {
            addCriterion("banReason is null");
            return (Criteria) this;
        }

        public Criteria andBanreasonIsNotNull() {
            addCriterion("banReason is not null");
            return (Criteria) this;
        }

        public Criteria andBanreasonEqualTo(String value) {
            addCriterion("banReason =", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotEqualTo(String value) {
            addCriterion("banReason <>", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonGreaterThan(String value) {
            addCriterion("banReason >", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonGreaterThanOrEqualTo(String value) {
            addCriterion("banReason >=", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLessThan(String value) {
            addCriterion("banReason <", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLessThanOrEqualTo(String value) {
            addCriterion("banReason <=", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLike(String value) {
            addCriterion("banReason like", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotLike(String value) {
            addCriterion("banReason not like", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonIn(List<String> values) {
            addCriterion("banReason in", values, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotIn(List<String> values) {
            addCriterion("banReason not in", values, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonBetween(String value1, String value2) {
            addCriterion("banReason between", value1, value2, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotBetween(String value1, String value2) {
            addCriterion("banReason not between", value1, value2, "banreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonIsNull() {
            addCriterion("nPassReason is null");
            return (Criteria) this;
        }

        public Criteria andNpassreasonIsNotNull() {
            addCriterion("nPassReason is not null");
            return (Criteria) this;
        }

        public Criteria andNpassreasonEqualTo(String value) {
            addCriterion("nPassReason =", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonNotEqualTo(String value) {
            addCriterion("nPassReason <>", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonGreaterThan(String value) {
            addCriterion("nPassReason >", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonGreaterThanOrEqualTo(String value) {
            addCriterion("nPassReason >=", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonLessThan(String value) {
            addCriterion("nPassReason <", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonLessThanOrEqualTo(String value) {
            addCriterion("nPassReason <=", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonLike(String value) {
            addCriterion("nPassReason like", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonNotLike(String value) {
            addCriterion("nPassReason not like", value, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonIn(List<String> values) {
            addCriterion("nPassReason in", values, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonNotIn(List<String> values) {
            addCriterion("nPassReason not in", values, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonBetween(String value1, String value2) {
            addCriterion("nPassReason between", value1, value2, "npassreason");
            return (Criteria) this;
        }

        public Criteria andNpassreasonNotBetween(String value1, String value2) {
            addCriterion("nPassReason not between", value1, value2, "npassreason");
            return (Criteria) this;
        }

        public Criteria andBanReasonIsNull() {
            addCriterion("ban_reason is null");
            return (Criteria) this;
        }

        public Criteria andBanReasonIsNotNull() {
            addCriterion("ban_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBanReasonEqualTo(String value) {
            addCriterion("ban_reason =", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonNotEqualTo(String value) {
            addCriterion("ban_reason <>", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonGreaterThan(String value) {
            addCriterion("ban_reason >", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonGreaterThanOrEqualTo(String value) {
            addCriterion("ban_reason >=", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonLessThan(String value) {
            addCriterion("ban_reason <", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonLessThanOrEqualTo(String value) {
            addCriterion("ban_reason <=", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonLike(String value) {
            addCriterion("ban_reason like", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonNotLike(String value) {
            addCriterion("ban_reason not like", value, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonIn(List<String> values) {
            addCriterion("ban_reason in", values, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonNotIn(List<String> values) {
            addCriterion("ban_reason not in", values, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonBetween(String value1, String value2) {
            addCriterion("ban_reason between", value1, value2, "banReason");
            return (Criteria) this;
        }

        public Criteria andBanReasonNotBetween(String value1, String value2) {
            addCriterion("ban_reason not between", value1, value2, "banReason");
            return (Criteria) this;
        }

        public Criteria andHeadPictureIsNull() {
            addCriterion("head_picture is null");
            return (Criteria) this;
        }

        public Criteria andHeadPictureIsNotNull() {
            addCriterion("head_picture is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPictureEqualTo(String value) {
            addCriterion("head_picture =", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureNotEqualTo(String value) {
            addCriterion("head_picture <>", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureGreaterThan(String value) {
            addCriterion("head_picture >", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureGreaterThanOrEqualTo(String value) {
            addCriterion("head_picture >=", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureLessThan(String value) {
            addCriterion("head_picture <", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureLessThanOrEqualTo(String value) {
            addCriterion("head_picture <=", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureLike(String value) {
            addCriterion("head_picture like", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureNotLike(String value) {
            addCriterion("head_picture not like", value, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureIn(List<String> values) {
            addCriterion("head_picture in", values, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureNotIn(List<String> values) {
            addCriterion("head_picture not in", values, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureBetween(String value1, String value2) {
            addCriterion("head_picture between", value1, value2, "headPicture");
            return (Criteria) this;
        }

        public Criteria andHeadPictureNotBetween(String value1, String value2) {
            addCriterion("head_picture not between", value1, value2, "headPicture");
            return (Criteria) this;
        }

        public Criteria andNPassReasonIsNull() {
            addCriterion("n_pass_reason is null");
            return (Criteria) this;
        }

        public Criteria andNPassReasonIsNotNull() {
            addCriterion("n_pass_reason is not null");
            return (Criteria) this;
        }

        public Criteria andNPassReasonEqualTo(String value) {
            addCriterion("n_pass_reason =", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonNotEqualTo(String value) {
            addCriterion("n_pass_reason <>", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonGreaterThan(String value) {
            addCriterion("n_pass_reason >", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonGreaterThanOrEqualTo(String value) {
            addCriterion("n_pass_reason >=", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonLessThan(String value) {
            addCriterion("n_pass_reason <", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonLessThanOrEqualTo(String value) {
            addCriterion("n_pass_reason <=", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonLike(String value) {
            addCriterion("n_pass_reason like", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonNotLike(String value) {
            addCriterion("n_pass_reason not like", value, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonIn(List<String> values) {
            addCriterion("n_pass_reason in", values, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonNotIn(List<String> values) {
            addCriterion("n_pass_reason not in", values, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonBetween(String value1, String value2) {
            addCriterion("n_pass_reason between", value1, value2, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNPassReasonNotBetween(String value1, String value2) {
            addCriterion("n_pass_reason not between", value1, value2, "nPassReason");
            return (Criteria) this;
        }

        public Criteria andNikeNameIsNull() {
            addCriterion("nike_name is null");
            return (Criteria) this;
        }

        public Criteria andNikeNameIsNotNull() {
            addCriterion("nike_name is not null");
            return (Criteria) this;
        }

        public Criteria andNikeNameEqualTo(String value) {
            addCriterion("nike_name =", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotEqualTo(String value) {
            addCriterion("nike_name <>", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameGreaterThan(String value) {
            addCriterion("nike_name >", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameGreaterThanOrEqualTo(String value) {
            addCriterion("nike_name >=", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameLessThan(String value) {
            addCriterion("nike_name <", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameLessThanOrEqualTo(String value) {
            addCriterion("nike_name <=", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameLike(String value) {
            addCriterion("nike_name like", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotLike(String value) {
            addCriterion("nike_name not like", value, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameIn(List<String> values) {
            addCriterion("nike_name in", values, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotIn(List<String> values) {
            addCriterion("nike_name not in", values, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameBetween(String value1, String value2) {
            addCriterion("nike_name between", value1, value2, "nikeName");
            return (Criteria) this;
        }

        public Criteria andNikeNameNotBetween(String value1, String value2) {
            addCriterion("nike_name not between", value1, value2, "nikeName");
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