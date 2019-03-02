package com.wei.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andHeadImageIsNull() {
            addCriterion("head_image is null");
            return (Criteria) this;
        }

        public Criteria andHeadImageIsNotNull() {
            addCriterion("head_image is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImageEqualTo(String value) {
            addCriterion("head_image =", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotEqualTo(String value) {
            addCriterion("head_image <>", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageGreaterThan(String value) {
            addCriterion("head_image >", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageGreaterThanOrEqualTo(String value) {
            addCriterion("head_image >=", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLessThan(String value) {
            addCriterion("head_image <", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLessThanOrEqualTo(String value) {
            addCriterion("head_image <=", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageLike(String value) {
            addCriterion("head_image like", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotLike(String value) {
            addCriterion("head_image not like", value, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageIn(List<String> values) {
            addCriterion("head_image in", values, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotIn(List<String> values) {
            addCriterion("head_image not in", values, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageBetween(String value1, String value2) {
            addCriterion("head_image between", value1, value2, "headImage");
            return (Criteria) this;
        }

        public Criteria andHeadImageNotBetween(String value1, String value2) {
            addCriterion("head_image not between", value1, value2, "headImage");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIsSharerIsNull() {
            addCriterion("is_sharer is null");
            return (Criteria) this;
        }

        public Criteria andIsSharerIsNotNull() {
            addCriterion("is_sharer is not null");
            return (Criteria) this;
        }

        public Criteria andIsSharerEqualTo(String value) {
            addCriterion("is_sharer =", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerNotEqualTo(String value) {
            addCriterion("is_sharer <>", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerGreaterThan(String value) {
            addCriterion("is_sharer >", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerGreaterThanOrEqualTo(String value) {
            addCriterion("is_sharer >=", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerLessThan(String value) {
            addCriterion("is_sharer <", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerLessThanOrEqualTo(String value) {
            addCriterion("is_sharer <=", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerLike(String value) {
            addCriterion("is_sharer like", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerNotLike(String value) {
            addCriterion("is_sharer not like", value, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerIn(List<String> values) {
            addCriterion("is_sharer in", values, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerNotIn(List<String> values) {
            addCriterion("is_sharer not in", values, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerBetween(String value1, String value2) {
            addCriterion("is_sharer between", value1, value2, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIsSharerNotBetween(String value1, String value2) {
            addCriterion("is_sharer not between", value1, value2, "isSharer");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIsNull() {
            addCriterion("id_card_front is null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIsNotNull() {
            addCriterion("id_card_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontEqualTo(String value) {
            addCriterion("id_card_front =", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotEqualTo(String value) {
            addCriterion("id_card_front <>", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontGreaterThan(String value) {
            addCriterion("id_card_front >", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_front >=", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLessThan(String value) {
            addCriterion("id_card_front <", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLessThanOrEqualTo(String value) {
            addCriterion("id_card_front <=", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLike(String value) {
            addCriterion("id_card_front like", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotLike(String value) {
            addCriterion("id_card_front not like", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIn(List<String> values) {
            addCriterion("id_card_front in", values, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotIn(List<String> values) {
            addCriterion("id_card_front not in", values, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontBetween(String value1, String value2) {
            addCriterion("id_card_front between", value1, value2, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotBetween(String value1, String value2) {
            addCriterion("id_card_front not between", value1, value2, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardBackIsNull() {
            addCriterion("id_card_back is null");
            return (Criteria) this;
        }

        public Criteria andIdCardBackIsNotNull() {
            addCriterion("id_card_back is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardBackEqualTo(String value) {
            addCriterion("id_card_back =", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotEqualTo(String value) {
            addCriterion("id_card_back <>", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackGreaterThan(String value) {
            addCriterion("id_card_back >", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_back >=", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackLessThan(String value) {
            addCriterion("id_card_back <", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackLessThanOrEqualTo(String value) {
            addCriterion("id_card_back <=", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackLike(String value) {
            addCriterion("id_card_back like", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotLike(String value) {
            addCriterion("id_card_back not like", value, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackIn(List<String> values) {
            addCriterion("id_card_back in", values, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotIn(List<String> values) {
            addCriterion("id_card_back not in", values, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackBetween(String value1, String value2) {
            addCriterion("id_card_back between", value1, value2, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIdCardBackNotBetween(String value1, String value2) {
            addCriterion("id_card_back not between", value1, value2, "idCardBack");
            return (Criteria) this;
        }

        public Criteria andIsProcurerIsNull() {
            addCriterion("is_procurer is null");
            return (Criteria) this;
        }

        public Criteria andIsProcurerIsNotNull() {
            addCriterion("is_procurer is not null");
            return (Criteria) this;
        }

        public Criteria andIsProcurerEqualTo(String value) {
            addCriterion("is_procurer =", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerNotEqualTo(String value) {
            addCriterion("is_procurer <>", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerGreaterThan(String value) {
            addCriterion("is_procurer >", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerGreaterThanOrEqualTo(String value) {
            addCriterion("is_procurer >=", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerLessThan(String value) {
            addCriterion("is_procurer <", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerLessThanOrEqualTo(String value) {
            addCriterion("is_procurer <=", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerLike(String value) {
            addCriterion("is_procurer like", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerNotLike(String value) {
            addCriterion("is_procurer not like", value, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerIn(List<String> values) {
            addCriterion("is_procurer in", values, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerNotIn(List<String> values) {
            addCriterion("is_procurer not in", values, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerBetween(String value1, String value2) {
            addCriterion("is_procurer between", value1, value2, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andIsProcurerNotBetween(String value1, String value2) {
            addCriterion("is_procurer not between", value1, value2, "isProcurer");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdIsNull() {
            addCriterion("default_receive_address_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdIsNotNull() {
            addCriterion("default_receive_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdEqualTo(Integer value) {
            addCriterion("default_receive_address_id =", value, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdNotEqualTo(Integer value) {
            addCriterion("default_receive_address_id <>", value, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdGreaterThan(Integer value) {
            addCriterion("default_receive_address_id >", value, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_receive_address_id >=", value, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdLessThan(Integer value) {
            addCriterion("default_receive_address_id <", value, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("default_receive_address_id <=", value, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdIn(List<Integer> values) {
            addCriterion("default_receive_address_id in", values, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdNotIn(List<Integer> values) {
            addCriterion("default_receive_address_id not in", values, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("default_receive_address_id between", value1, value2, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andDefaultReceiveAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("default_receive_address_id not between", value1, value2, "defaultReceiveAddressId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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