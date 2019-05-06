package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class WebinformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebinformationExample() {
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

        public Criteria andWebnameIsNull() {
            addCriterion("webName is null");
            return (Criteria) this;
        }

        public Criteria andWebnameIsNotNull() {
            addCriterion("webName is not null");
            return (Criteria) this;
        }

        public Criteria andWebnameEqualTo(String value) {
            addCriterion("webName =", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotEqualTo(String value) {
            addCriterion("webName <>", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThan(String value) {
            addCriterion("webName >", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThanOrEqualTo(String value) {
            addCriterion("webName >=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThan(String value) {
            addCriterion("webName <", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThanOrEqualTo(String value) {
            addCriterion("webName <=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLike(String value) {
            addCriterion("webName like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotLike(String value) {
            addCriterion("webName not like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameIn(List<String> values) {
            addCriterion("webName in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotIn(List<String> values) {
            addCriterion("webName not in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameBetween(String value1, String value2) {
            addCriterion("webName between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotBetween(String value1, String value2) {
            addCriterion("webName not between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andTopwordsIsNull() {
            addCriterion("topWords is null");
            return (Criteria) this;
        }

        public Criteria andTopwordsIsNotNull() {
            addCriterion("topWords is not null");
            return (Criteria) this;
        }

        public Criteria andTopwordsEqualTo(String value) {
            addCriterion("topWords =", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsNotEqualTo(String value) {
            addCriterion("topWords <>", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsGreaterThan(String value) {
            addCriterion("topWords >", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsGreaterThanOrEqualTo(String value) {
            addCriterion("topWords >=", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsLessThan(String value) {
            addCriterion("topWords <", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsLessThanOrEqualTo(String value) {
            addCriterion("topWords <=", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsLike(String value) {
            addCriterion("topWords like", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsNotLike(String value) {
            addCriterion("topWords not like", value, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsIn(List<String> values) {
            addCriterion("topWords in", values, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsNotIn(List<String> values) {
            addCriterion("topWords not in", values, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsBetween(String value1, String value2) {
            addCriterion("topWords between", value1, value2, "topwords");
            return (Criteria) this;
        }

        public Criteria andTopwordsNotBetween(String value1, String value2) {
            addCriterion("topWords not between", value1, value2, "topwords");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressIsNull() {
            addCriterion("microBlogAddress is null");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressIsNotNull() {
            addCriterion("microBlogAddress is not null");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressEqualTo(String value) {
            addCriterion("microBlogAddress =", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressNotEqualTo(String value) {
            addCriterion("microBlogAddress <>", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressGreaterThan(String value) {
            addCriterion("microBlogAddress >", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressGreaterThanOrEqualTo(String value) {
            addCriterion("microBlogAddress >=", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressLessThan(String value) {
            addCriterion("microBlogAddress <", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressLessThanOrEqualTo(String value) {
            addCriterion("microBlogAddress <=", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressLike(String value) {
            addCriterion("microBlogAddress like", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressNotLike(String value) {
            addCriterion("microBlogAddress not like", value, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressIn(List<String> values) {
            addCriterion("microBlogAddress in", values, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressNotIn(List<String> values) {
            addCriterion("microBlogAddress not in", values, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressBetween(String value1, String value2) {
            addCriterion("microBlogAddress between", value1, value2, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andMicroblogaddressNotBetween(String value1, String value2) {
            addCriterion("microBlogAddress not between", value1, value2, "microblogaddress");
            return (Criteria) this;
        }

        public Criteria andHwlinkIsNull() {
            addCriterion("HWLink is null");
            return (Criteria) this;
        }

        public Criteria andHwlinkIsNotNull() {
            addCriterion("HWLink is not null");
            return (Criteria) this;
        }

        public Criteria andHwlinkEqualTo(String value) {
            addCriterion("HWLink =", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkNotEqualTo(String value) {
            addCriterion("HWLink <>", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkGreaterThan(String value) {
            addCriterion("HWLink >", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkGreaterThanOrEqualTo(String value) {
            addCriterion("HWLink >=", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkLessThan(String value) {
            addCriterion("HWLink <", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkLessThanOrEqualTo(String value) {
            addCriterion("HWLink <=", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkLike(String value) {
            addCriterion("HWLink like", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkNotLike(String value) {
            addCriterion("HWLink not like", value, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkIn(List<String> values) {
            addCriterion("HWLink in", values, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkNotIn(List<String> values) {
            addCriterion("HWLink not in", values, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkBetween(String value1, String value2) {
            addCriterion("HWLink between", value1, value2, "hwlink");
            return (Criteria) this;
        }

        public Criteria andHwlinkNotBetween(String value1, String value2) {
            addCriterion("HWLink not between", value1, value2, "hwlink");
            return (Criteria) this;
        }

        public Criteria andServicephoneIsNull() {
            addCriterion("servicePhone is null");
            return (Criteria) this;
        }

        public Criteria andServicephoneIsNotNull() {
            addCriterion("servicePhone is not null");
            return (Criteria) this;
        }

        public Criteria andServicephoneEqualTo(String value) {
            addCriterion("servicePhone =", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotEqualTo(String value) {
            addCriterion("servicePhone <>", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneGreaterThan(String value) {
            addCriterion("servicePhone >", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneGreaterThanOrEqualTo(String value) {
            addCriterion("servicePhone >=", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLessThan(String value) {
            addCriterion("servicePhone <", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLessThanOrEqualTo(String value) {
            addCriterion("servicePhone <=", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLike(String value) {
            addCriterion("servicePhone like", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotLike(String value) {
            addCriterion("servicePhone not like", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneIn(List<String> values) {
            addCriterion("servicePhone in", values, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotIn(List<String> values) {
            addCriterion("servicePhone not in", values, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneBetween(String value1, String value2) {
            addCriterion("servicePhone between", value1, value2, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotBetween(String value1, String value2) {
            addCriterion("servicePhone not between", value1, value2, "servicephone");
            return (Criteria) this;
        }

        public Criteria andWebdescribeIsNull() {
            addCriterion("webDescribe is null");
            return (Criteria) this;
        }

        public Criteria andWebdescribeIsNotNull() {
            addCriterion("webDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andWebdescribeEqualTo(String value) {
            addCriterion("webDescribe =", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotEqualTo(String value) {
            addCriterion("webDescribe <>", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeGreaterThan(String value) {
            addCriterion("webDescribe >", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("webDescribe >=", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeLessThan(String value) {
            addCriterion("webDescribe <", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeLessThanOrEqualTo(String value) {
            addCriterion("webDescribe <=", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeLike(String value) {
            addCriterion("webDescribe like", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotLike(String value) {
            addCriterion("webDescribe not like", value, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeIn(List<String> values) {
            addCriterion("webDescribe in", values, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotIn(List<String> values) {
            addCriterion("webDescribe not in", values, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeBetween(String value1, String value2) {
            addCriterion("webDescribe between", value1, value2, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebdescribeNotBetween(String value1, String value2) {
            addCriterion("webDescribe not between", value1, value2, "webdescribe");
            return (Criteria) this;
        }

        public Criteria andWebbottomIsNull() {
            addCriterion("webBottom is null");
            return (Criteria) this;
        }

        public Criteria andWebbottomIsNotNull() {
            addCriterion("webBottom is not null");
            return (Criteria) this;
        }

        public Criteria andWebbottomEqualTo(String value) {
            addCriterion("webBottom =", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomNotEqualTo(String value) {
            addCriterion("webBottom <>", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomGreaterThan(String value) {
            addCriterion("webBottom >", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomGreaterThanOrEqualTo(String value) {
            addCriterion("webBottom >=", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomLessThan(String value) {
            addCriterion("webBottom <", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomLessThanOrEqualTo(String value) {
            addCriterion("webBottom <=", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomLike(String value) {
            addCriterion("webBottom like", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomNotLike(String value) {
            addCriterion("webBottom not like", value, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomIn(List<String> values) {
            addCriterion("webBottom in", values, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomNotIn(List<String> values) {
            addCriterion("webBottom not in", values, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomBetween(String value1, String value2) {
            addCriterion("webBottom between", value1, value2, "webbottom");
            return (Criteria) this;
        }

        public Criteria andWebbottomNotBetween(String value1, String value2) {
            addCriterion("webBottom not between", value1, value2, "webbottom");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressIsNull() {
            addCriterion("micro_blog_address is null");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressIsNotNull() {
            addCriterion("micro_blog_address is not null");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressEqualTo(String value) {
            addCriterion("micro_blog_address =", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressNotEqualTo(String value) {
            addCriterion("micro_blog_address <>", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressGreaterThan(String value) {
            addCriterion("micro_blog_address >", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressGreaterThanOrEqualTo(String value) {
            addCriterion("micro_blog_address >=", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressLessThan(String value) {
            addCriterion("micro_blog_address <", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressLessThanOrEqualTo(String value) {
            addCriterion("micro_blog_address <=", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressLike(String value) {
            addCriterion("micro_blog_address like", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressNotLike(String value) {
            addCriterion("micro_blog_address not like", value, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressIn(List<String> values) {
            addCriterion("micro_blog_address in", values, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressNotIn(List<String> values) {
            addCriterion("micro_blog_address not in", values, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressBetween(String value1, String value2) {
            addCriterion("micro_blog_address between", value1, value2, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andMicroBlogAddressNotBetween(String value1, String value2) {
            addCriterion("micro_blog_address not between", value1, value2, "microBlogAddress");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("service_phone is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("service_phone =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("service_phone <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("service_phone >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("service_phone <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("service_phone <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("service_phone like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("service_phone not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("service_phone in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("service_phone not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("service_phone between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("service_phone not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andTopWordsIsNull() {
            addCriterion("top_words is null");
            return (Criteria) this;
        }

        public Criteria andTopWordsIsNotNull() {
            addCriterion("top_words is not null");
            return (Criteria) this;
        }

        public Criteria andTopWordsEqualTo(String value) {
            addCriterion("top_words =", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsNotEqualTo(String value) {
            addCriterion("top_words <>", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsGreaterThan(String value) {
            addCriterion("top_words >", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsGreaterThanOrEqualTo(String value) {
            addCriterion("top_words >=", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsLessThan(String value) {
            addCriterion("top_words <", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsLessThanOrEqualTo(String value) {
            addCriterion("top_words <=", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsLike(String value) {
            addCriterion("top_words like", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsNotLike(String value) {
            addCriterion("top_words not like", value, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsIn(List<String> values) {
            addCriterion("top_words in", values, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsNotIn(List<String> values) {
            addCriterion("top_words not in", values, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsBetween(String value1, String value2) {
            addCriterion("top_words between", value1, value2, "topWords");
            return (Criteria) this;
        }

        public Criteria andTopWordsNotBetween(String value1, String value2) {
            addCriterion("top_words not between", value1, value2, "topWords");
            return (Criteria) this;
        }

        public Criteria andWebBottomIsNull() {
            addCriterion("web_bottom is null");
            return (Criteria) this;
        }

        public Criteria andWebBottomIsNotNull() {
            addCriterion("web_bottom is not null");
            return (Criteria) this;
        }

        public Criteria andWebBottomEqualTo(String value) {
            addCriterion("web_bottom =", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomNotEqualTo(String value) {
            addCriterion("web_bottom <>", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomGreaterThan(String value) {
            addCriterion("web_bottom >", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomGreaterThanOrEqualTo(String value) {
            addCriterion("web_bottom >=", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomLessThan(String value) {
            addCriterion("web_bottom <", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomLessThanOrEqualTo(String value) {
            addCriterion("web_bottom <=", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomLike(String value) {
            addCriterion("web_bottom like", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomNotLike(String value) {
            addCriterion("web_bottom not like", value, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomIn(List<String> values) {
            addCriterion("web_bottom in", values, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomNotIn(List<String> values) {
            addCriterion("web_bottom not in", values, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomBetween(String value1, String value2) {
            addCriterion("web_bottom between", value1, value2, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebBottomNotBetween(String value1, String value2) {
            addCriterion("web_bottom not between", value1, value2, "webBottom");
            return (Criteria) this;
        }

        public Criteria andWebDescribeIsNull() {
            addCriterion("web_describe is null");
            return (Criteria) this;
        }

        public Criteria andWebDescribeIsNotNull() {
            addCriterion("web_describe is not null");
            return (Criteria) this;
        }

        public Criteria andWebDescribeEqualTo(String value) {
            addCriterion("web_describe =", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeNotEqualTo(String value) {
            addCriterion("web_describe <>", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeGreaterThan(String value) {
            addCriterion("web_describe >", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("web_describe >=", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeLessThan(String value) {
            addCriterion("web_describe <", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeLessThanOrEqualTo(String value) {
            addCriterion("web_describe <=", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeLike(String value) {
            addCriterion("web_describe like", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeNotLike(String value) {
            addCriterion("web_describe not like", value, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeIn(List<String> values) {
            addCriterion("web_describe in", values, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeNotIn(List<String> values) {
            addCriterion("web_describe not in", values, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeBetween(String value1, String value2) {
            addCriterion("web_describe between", value1, value2, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebDescribeNotBetween(String value1, String value2) {
            addCriterion("web_describe not between", value1, value2, "webDescribe");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNull() {
            addCriterion("web_name is null");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNotNull() {
            addCriterion("web_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebNameEqualTo(String value) {
            addCriterion("web_name =", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotEqualTo(String value) {
            addCriterion("web_name <>", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThan(String value) {
            addCriterion("web_name >", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThanOrEqualTo(String value) {
            addCriterion("web_name >=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThan(String value) {
            addCriterion("web_name <", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThanOrEqualTo(String value) {
            addCriterion("web_name <=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLike(String value) {
            addCriterion("web_name like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotLike(String value) {
            addCriterion("web_name not like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameIn(List<String> values) {
            addCriterion("web_name in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotIn(List<String> values) {
            addCriterion("web_name not in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameBetween(String value1, String value2) {
            addCriterion("web_name between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotBetween(String value1, String value2) {
            addCriterion("web_name not between", value1, value2, "webName");
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