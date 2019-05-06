package com.hqhw.pojo;

import java.util.ArrayList;
import java.util.List;

public class VideosortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideosortExample() {
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

        public Criteria andVideosortnameIsNull() {
            addCriterion("videoSortName is null");
            return (Criteria) this;
        }

        public Criteria andVideosortnameIsNotNull() {
            addCriterion("videoSortName is not null");
            return (Criteria) this;
        }

        public Criteria andVideosortnameEqualTo(String value) {
            addCriterion("videoSortName =", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotEqualTo(String value) {
            addCriterion("videoSortName <>", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameGreaterThan(String value) {
            addCriterion("videoSortName >", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameGreaterThanOrEqualTo(String value) {
            addCriterion("videoSortName >=", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameLessThan(String value) {
            addCriterion("videoSortName <", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameLessThanOrEqualTo(String value) {
            addCriterion("videoSortName <=", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameLike(String value) {
            addCriterion("videoSortName like", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotLike(String value) {
            addCriterion("videoSortName not like", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameIn(List<String> values) {
            addCriterion("videoSortName in", values, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotIn(List<String> values) {
            addCriterion("videoSortName not in", values, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameBetween(String value1, String value2) {
            addCriterion("videoSortName between", value1, value2, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotBetween(String value1, String value2) {
            addCriterion("videoSortName not between", value1, value2, "videosortname");
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

        public Criteria andVediopositionIsNull() {
            addCriterion("vedioPosition is null");
            return (Criteria) this;
        }

        public Criteria andVediopositionIsNotNull() {
            addCriterion("vedioPosition is not null");
            return (Criteria) this;
        }

        public Criteria andVediopositionEqualTo(Integer value) {
            addCriterion("vedioPosition =", value, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionNotEqualTo(Integer value) {
            addCriterion("vedioPosition <>", value, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionGreaterThan(Integer value) {
            addCriterion("vedioPosition >", value, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedioPosition >=", value, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionLessThan(Integer value) {
            addCriterion("vedioPosition <", value, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionLessThanOrEqualTo(Integer value) {
            addCriterion("vedioPosition <=", value, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionIn(List<Integer> values) {
            addCriterion("vedioPosition in", values, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionNotIn(List<Integer> values) {
            addCriterion("vedioPosition not in", values, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionBetween(Integer value1, Integer value2) {
            addCriterion("vedioPosition between", value1, value2, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andVediopositionNotBetween(Integer value1, Integer value2) {
            addCriterion("vedioPosition not between", value1, value2, "vedioposition");
            return (Criteria) this;
        }

        public Criteria andColumnsIsNull() {
            addCriterion("columns is null");
            return (Criteria) this;
        }

        public Criteria andColumnsIsNotNull() {
            addCriterion("columns is not null");
            return (Criteria) this;
        }

        public Criteria andColumnsEqualTo(String value) {
            addCriterion("columns =", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotEqualTo(String value) {
            addCriterion("columns <>", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsGreaterThan(String value) {
            addCriterion("columns >", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsGreaterThanOrEqualTo(String value) {
            addCriterion("columns >=", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsLessThan(String value) {
            addCriterion("columns <", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsLessThanOrEqualTo(String value) {
            addCriterion("columns <=", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsLike(String value) {
            addCriterion("columns like", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotLike(String value) {
            addCriterion("columns not like", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsIn(List<String> values) {
            addCriterion("columns in", values, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotIn(List<String> values) {
            addCriterion("columns not in", values, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsBetween(String value1, String value2) {
            addCriterion("columns between", value1, value2, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotBetween(String value1, String value2) {
            addCriterion("columns not between", value1, value2, "columns");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNull() {
            addCriterion("Column_5 is null");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNotNull() {
            addCriterion("Column_5 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn5EqualTo(String value) {
            addCriterion("Column_5 =", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotEqualTo(String value) {
            addCriterion("Column_5 <>", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThan(String value) {
            addCriterion("Column_5 >", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThanOrEqualTo(String value) {
            addCriterion("Column_5 >=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThan(String value) {
            addCriterion("Column_5 <", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThanOrEqualTo(String value) {
            addCriterion("Column_5 <=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5Like(String value) {
            addCriterion("Column_5 like", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotLike(String value) {
            addCriterion("Column_5 not like", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5In(List<String> values) {
            addCriterion("Column_5 in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotIn(List<String> values) {
            addCriterion("Column_5 not in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5Between(String value1, String value2) {
            addCriterion("Column_5 between", value1, value2, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotBetween(String value1, String value2) {
            addCriterion("Column_5 not between", value1, value2, "column5");
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

        public Criteria andVedioPositionIsNull() {
            addCriterion("vedio_position is null");
            return (Criteria) this;
        }

        public Criteria andVedioPositionIsNotNull() {
            addCriterion("vedio_position is not null");
            return (Criteria) this;
        }

        public Criteria andVedioPositionEqualTo(Integer value) {
            addCriterion("vedio_position =", value, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionNotEqualTo(Integer value) {
            addCriterion("vedio_position <>", value, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionGreaterThan(Integer value) {
            addCriterion("vedio_position >", value, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_position >=", value, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionLessThan(Integer value) {
            addCriterion("vedio_position <", value, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_position <=", value, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionIn(List<Integer> values) {
            addCriterion("vedio_position in", values, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionNotIn(List<Integer> values) {
            addCriterion("vedio_position not in", values, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionBetween(Integer value1, Integer value2) {
            addCriterion("vedio_position between", value1, value2, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVedioPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_position not between", value1, value2, "vedioPosition");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameIsNull() {
            addCriterion("video_sort_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameIsNotNull() {
            addCriterion("video_sort_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameEqualTo(String value) {
            addCriterion("video_sort_name =", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameNotEqualTo(String value) {
            addCriterion("video_sort_name <>", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameGreaterThan(String value) {
            addCriterion("video_sort_name >", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_sort_name >=", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameLessThan(String value) {
            addCriterion("video_sort_name <", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameLessThanOrEqualTo(String value) {
            addCriterion("video_sort_name <=", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameLike(String value) {
            addCriterion("video_sort_name like", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameNotLike(String value) {
            addCriterion("video_sort_name not like", value, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameIn(List<String> values) {
            addCriterion("video_sort_name in", values, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameNotIn(List<String> values) {
            addCriterion("video_sort_name not in", values, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameBetween(String value1, String value2) {
            addCriterion("video_sort_name between", value1, value2, "videoSortName");
            return (Criteria) this;
        }

        public Criteria andVideoSortNameNotBetween(String value1, String value2) {
            addCriterion("video_sort_name not between", value1, value2, "videoSortName");
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