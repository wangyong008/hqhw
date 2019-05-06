package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivitypeopleinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivitypeopleinfoExample() {
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

        public Criteria andActivityidIsNull() {
            addCriterion("activityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("activityId =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("activityId <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("activityId >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityId >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("activityId <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("activityId <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("activityId in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("activityId not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("activityId between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityId not between", value1, value2, "activityid");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("relationship is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("relationship is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("relationship =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("relationship <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("relationship >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("relationship >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("relationship <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("relationship <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("relationship like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("relationship not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("relationship in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("relationship not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("relationship between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("relationship not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNull() {
            addCriterion("emergencyContact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNotNull() {
            addCriterion("emergencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactEqualTo(String value) {
            addCriterion("emergencyContact =", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotEqualTo(String value) {
            addCriterion("emergencyContact <>", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThan(String value) {
            addCriterion("emergencyContact >", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyContact >=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThan(String value) {
            addCriterion("emergencyContact <", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThanOrEqualTo(String value) {
            addCriterion("emergencyContact <=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLike(String value) {
            addCriterion("emergencyContact like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotLike(String value) {
            addCriterion("emergencyContact not like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIn(List<String> values) {
            addCriterion("emergencyContact in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotIn(List<String> values) {
            addCriterion("emergencyContact not in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactBetween(String value1, String value2) {
            addCriterion("emergencyContact between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotBetween(String value1, String value2) {
            addCriterion("emergencyContact not between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneIsNull() {
            addCriterion("emergencyContactPhone is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneIsNotNull() {
            addCriterion("emergencyContactPhone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneEqualTo(String value) {
            addCriterion("emergencyContactPhone =", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneNotEqualTo(String value) {
            addCriterion("emergencyContactPhone <>", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneGreaterThan(String value) {
            addCriterion("emergencyContactPhone >", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyContactPhone >=", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneLessThan(String value) {
            addCriterion("emergencyContactPhone <", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneLessThanOrEqualTo(String value) {
            addCriterion("emergencyContactPhone <=", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneLike(String value) {
            addCriterion("emergencyContactPhone like", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneNotLike(String value) {
            addCriterion("emergencyContactPhone not like", value, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneIn(List<String> values) {
            addCriterion("emergencyContactPhone in", values, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneNotIn(List<String> values) {
            addCriterion("emergencyContactPhone not in", values, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneBetween(String value1, String value2) {
            addCriterion("emergencyContactPhone between", value1, value2, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactphoneNotBetween(String value1, String value2) {
            addCriterion("emergencyContactPhone not between", value1, value2, "emergencycontactphone");
            return (Criteria) this;
        }

        public Criteria andColumn11IsNull() {
            addCriterion("Column_11 is null");
            return (Criteria) this;
        }

        public Criteria andColumn11IsNotNull() {
            addCriterion("Column_11 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn11EqualTo(String value) {
            addCriterion("Column_11 =", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotEqualTo(String value) {
            addCriterion("Column_11 <>", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11GreaterThan(String value) {
            addCriterion("Column_11 >", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11GreaterThanOrEqualTo(String value) {
            addCriterion("Column_11 >=", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11LessThan(String value) {
            addCriterion("Column_11 <", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11LessThanOrEqualTo(String value) {
            addCriterion("Column_11 <=", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11Like(String value) {
            addCriterion("Column_11 like", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotLike(String value) {
            addCriterion("Column_11 not like", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11In(List<String> values) {
            addCriterion("Column_11 in", values, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotIn(List<String> values) {
            addCriterion("Column_11 not in", values, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11Between(String value1, String value2) {
            addCriterion("Column_11 between", value1, value2, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotBetween(String value1, String value2) {
            addCriterion("Column_11 not between", value1, value2, "column11");
            return (Criteria) this;
        }

        public Criteria andNumberidIsNull() {
            addCriterion("numberId is null");
            return (Criteria) this;
        }

        public Criteria andNumberidIsNotNull() {
            addCriterion("numberId is not null");
            return (Criteria) this;
        }

        public Criteria andNumberidEqualTo(Integer value) {
            addCriterion("numberId =", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidNotEqualTo(Integer value) {
            addCriterion("numberId <>", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidGreaterThan(Integer value) {
            addCriterion("numberId >", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberId >=", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidLessThan(Integer value) {
            addCriterion("numberId <", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidLessThanOrEqualTo(Integer value) {
            addCriterion("numberId <=", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidIn(List<Integer> values) {
            addCriterion("numberId in", values, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidNotIn(List<Integer> values) {
            addCriterion("numberId not in", values, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidBetween(Integer value1, Integer value2) {
            addCriterion("numberId between", value1, value2, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidNotBetween(Integer value1, Integer value2) {
            addCriterion("numberId not between", value1, value2, "numberid");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIsNull() {
            addCriterion("emergency_contact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIsNotNull() {
            addCriterion("emergency_contact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactEqualTo(String value) {
            addCriterion("emergency_contact =", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotEqualTo(String value) {
            addCriterion("emergency_contact <>", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThan(String value) {
            addCriterion("emergency_contact >", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact >=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThan(String value) {
            addCriterion("emergency_contact <", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact <=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLike(String value) {
            addCriterion("emergency_contact like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotLike(String value) {
            addCriterion("emergency_contact not like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIn(List<String> values) {
            addCriterion("emergency_contact in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotIn(List<String> values) {
            addCriterion("emergency_contact not in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactBetween(String value1, String value2) {
            addCriterion("emergency_contact between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotBetween(String value1, String value2) {
            addCriterion("emergency_contact not between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneIsNull() {
            addCriterion("emergency_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneIsNotNull() {
            addCriterion("emergency_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneEqualTo(String value) {
            addCriterion("emergency_contact_phone =", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotEqualTo(String value) {
            addCriterion("emergency_contact_phone <>", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneGreaterThan(String value) {
            addCriterion("emergency_contact_phone >", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_phone >=", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneLessThan(String value) {
            addCriterion("emergency_contact_phone <", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_phone <=", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneLike(String value) {
            addCriterion("emergency_contact_phone like", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotLike(String value) {
            addCriterion("emergency_contact_phone not like", value, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneIn(List<String> values) {
            addCriterion("emergency_contact_phone in", values, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotIn(List<String> values) {
            addCriterion("emergency_contact_phone not in", values, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneBetween(String value1, String value2) {
            addCriterion("emergency_contact_phone between", value1, value2, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactPhoneNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_phone not between", value1, value2, "emergencyContactPhone");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andNumberIdIsNull() {
            addCriterion("number_id is null");
            return (Criteria) this;
        }

        public Criteria andNumberIdIsNotNull() {
            addCriterion("number_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumberIdEqualTo(Integer value) {
            addCriterion("number_id =", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotEqualTo(Integer value) {
            addCriterion("number_id <>", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdGreaterThan(Integer value) {
            addCriterion("number_id >", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_id >=", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdLessThan(Integer value) {
            addCriterion("number_id <", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("number_id <=", value, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdIn(List<Integer> values) {
            addCriterion("number_id in", values, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotIn(List<Integer> values) {
            addCriterion("number_id not in", values, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdBetween(Integer value1, Integer value2) {
            addCriterion("number_id between", value1, value2, "numberId");
            return (Criteria) this;
        }

        public Criteria andNumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("number_id not between", value1, value2, "numberId");
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