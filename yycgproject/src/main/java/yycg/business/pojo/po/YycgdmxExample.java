package yycg.business.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class YycgdmxExample  extends BusinessBasePo {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YycgdmxExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYycgdidIsNull() {
            addCriterion("YYCGDID is null");
            return (Criteria) this;
        }

        public Criteria andYycgdidIsNotNull() {
            addCriterion("YYCGDID is not null");
            return (Criteria) this;
        }

        public Criteria andYycgdidEqualTo(String value) {
            addCriterion("YYCGDID =", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotEqualTo(String value) {
            addCriterion("YYCGDID <>", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidGreaterThan(String value) {
            addCriterion("YYCGDID >", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidGreaterThanOrEqualTo(String value) {
            addCriterion("YYCGDID >=", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLessThan(String value) {
            addCriterion("YYCGDID <", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLessThanOrEqualTo(String value) {
            addCriterion("YYCGDID <=", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLike(String value) {
            addCriterion("YYCGDID like", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotLike(String value) {
            addCriterion("YYCGDID not like", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidIn(List<String> values) {
            addCriterion("YYCGDID in", values, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotIn(List<String> values) {
            addCriterion("YYCGDID not in", values, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidBetween(String value1, String value2) {
            addCriterion("YYCGDID between", value1, value2, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotBetween(String value1, String value2) {
            addCriterion("YYCGDID not between", value1, value2, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYpxxidIsNull() {
            addCriterion("YPXXID is null");
            return (Criteria) this;
        }

        public Criteria andYpxxidIsNotNull() {
            addCriterion("YPXXID is not null");
            return (Criteria) this;
        }

        public Criteria andYpxxidEqualTo(String value) {
            addCriterion("YPXXID =", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotEqualTo(String value) {
            addCriterion("YPXXID <>", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidGreaterThan(String value) {
            addCriterion("YPXXID >", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidGreaterThanOrEqualTo(String value) {
            addCriterion("YPXXID >=", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLessThan(String value) {
            addCriterion("YPXXID <", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLessThanOrEqualTo(String value) {
            addCriterion("YPXXID <=", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLike(String value) {
            addCriterion("YPXXID like", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotLike(String value) {
            addCriterion("YPXXID not like", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidIn(List<String> values) {
            addCriterion("YPXXID in", values, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotIn(List<String> values) {
            addCriterion("YPXXID not in", values, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidBetween(String value1, String value2) {
            addCriterion("YPXXID between", value1, value2, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotBetween(String value1, String value2) {
            addCriterion("YPXXID not between", value1, value2, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andUsergysidIsNull() {
            addCriterion("USERGYSID is null");
            return (Criteria) this;
        }

        public Criteria andUsergysidIsNotNull() {
            addCriterion("USERGYSID is not null");
            return (Criteria) this;
        }

        public Criteria andUsergysidEqualTo(String value) {
            addCriterion("USERGYSID =", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidNotEqualTo(String value) {
            addCriterion("USERGYSID <>", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidGreaterThan(String value) {
            addCriterion("USERGYSID >", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidGreaterThanOrEqualTo(String value) {
            addCriterion("USERGYSID >=", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidLessThan(String value) {
            addCriterion("USERGYSID <", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidLessThanOrEqualTo(String value) {
            addCriterion("USERGYSID <=", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidLike(String value) {
            addCriterion("USERGYSID like", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidNotLike(String value) {
            addCriterion("USERGYSID not like", value, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidIn(List<String> values) {
            addCriterion("USERGYSID in", values, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidNotIn(List<String> values) {
            addCriterion("USERGYSID not in", values, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidBetween(String value1, String value2) {
            addCriterion("USERGYSID between", value1, value2, "usergysid");
            return (Criteria) this;
        }

        public Criteria andUsergysidNotBetween(String value1, String value2) {
            addCriterion("USERGYSID not between", value1, value2, "usergysid");
            return (Criteria) this;
        }

        public Criteria andZbjgIsNull() {
            addCriterion("ZBJG is null");
            return (Criteria) this;
        }

        public Criteria andZbjgIsNotNull() {
            addCriterion("ZBJG is not null");
            return (Criteria) this;
        }

        public Criteria andZbjgEqualTo(Float value) {
            addCriterion("ZBJG =", value, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgNotEqualTo(Float value) {
            addCriterion("ZBJG <>", value, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgGreaterThan(Float value) {
            addCriterion("ZBJG >", value, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgGreaterThanOrEqualTo(Float value) {
            addCriterion("ZBJG >=", value, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgLessThan(Float value) {
            addCriterion("ZBJG <", value, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgLessThanOrEqualTo(Float value) {
            addCriterion("ZBJG <=", value, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgIn(List<Float> values) {
            addCriterion("ZBJG in", values, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgNotIn(List<Float> values) {
            addCriterion("ZBJG not in", values, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgBetween(Float value1, Float value2) {
            addCriterion("ZBJG between", value1, value2, "zbjg");
            return (Criteria) this;
        }

        public Criteria andZbjgNotBetween(Float value1, Float value2) {
            addCriterion("ZBJG not between", value1, value2, "zbjg");
            return (Criteria) this;
        }

        public Criteria andJyjgIsNull() {
            addCriterion("JYJG is null");
            return (Criteria) this;
        }

        public Criteria andJyjgIsNotNull() {
            addCriterion("JYJG is not null");
            return (Criteria) this;
        }

        public Criteria andJyjgEqualTo(Float value) {
            addCriterion("JYJG =", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgNotEqualTo(Float value) {
            addCriterion("JYJG <>", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgGreaterThan(Float value) {
            addCriterion("JYJG >", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgGreaterThanOrEqualTo(Float value) {
            addCriterion("JYJG >=", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgLessThan(Float value) {
            addCriterion("JYJG <", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgLessThanOrEqualTo(Float value) {
            addCriterion("JYJG <=", value, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgIn(List<Float> values) {
            addCriterion("JYJG in", values, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgNotIn(List<Float> values) {
            addCriterion("JYJG not in", values, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgBetween(Float value1, Float value2) {
            addCriterion("JYJG between", value1, value2, "jyjg");
            return (Criteria) this;
        }

        public Criteria andJyjgNotBetween(Float value1, Float value2) {
            addCriterion("JYJG not between", value1, value2, "jyjg");
            return (Criteria) this;
        }

        public Criteria andCglIsNull() {
            addCriterion("CGL is null");
            return (Criteria) this;
        }

        public Criteria andCglIsNotNull() {
            addCriterion("CGL is not null");
            return (Criteria) this;
        }

        public Criteria andCglEqualTo(Integer value) {
            addCriterion("CGL =", value, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglNotEqualTo(Integer value) {
            addCriterion("CGL <>", value, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglGreaterThan(Integer value) {
            addCriterion("CGL >", value, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglGreaterThanOrEqualTo(Integer value) {
            addCriterion("CGL >=", value, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglLessThan(Integer value) {
            addCriterion("CGL <", value, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglLessThanOrEqualTo(Integer value) {
            addCriterion("CGL <=", value, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglIn(List<Integer> values) {
            addCriterion("CGL in", values, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglNotIn(List<Integer> values) {
            addCriterion("CGL not in", values, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglBetween(Integer value1, Integer value2) {
            addCriterion("CGL between", value1, value2, "cgl");
            return (Criteria) this;
        }

        public Criteria andCglNotBetween(Integer value1, Integer value2) {
            addCriterion("CGL not between", value1, value2, "cgl");
            return (Criteria) this;
        }

        public Criteria andCgjeIsNull() {
            addCriterion("CGJE is null");
            return (Criteria) this;
        }

        public Criteria andCgjeIsNotNull() {
            addCriterion("CGJE is not null");
            return (Criteria) this;
        }

        public Criteria andCgjeEqualTo(Float value) {
            addCriterion("CGJE =", value, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeNotEqualTo(Float value) {
            addCriterion("CGJE <>", value, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeGreaterThan(Float value) {
            addCriterion("CGJE >", value, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeGreaterThanOrEqualTo(Float value) {
            addCriterion("CGJE >=", value, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeLessThan(Float value) {
            addCriterion("CGJE <", value, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeLessThanOrEqualTo(Float value) {
            addCriterion("CGJE <=", value, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeIn(List<Float> values) {
            addCriterion("CGJE in", values, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeNotIn(List<Float> values) {
            addCriterion("CGJE not in", values, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeBetween(Float value1, Float value2) {
            addCriterion("CGJE between", value1, value2, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgjeNotBetween(Float value1, Float value2) {
            addCriterion("CGJE not between", value1, value2, "cgje");
            return (Criteria) this;
        }

        public Criteria andCgztIsNull() {
            addCriterion("CGZT is null");
            return (Criteria) this;
        }

        public Criteria andCgztIsNotNull() {
            addCriterion("CGZT is not null");
            return (Criteria) this;
        }

        public Criteria andCgztEqualTo(String value) {
            addCriterion("CGZT =", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotEqualTo(String value) {
            addCriterion("CGZT <>", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztGreaterThan(String value) {
            addCriterion("CGZT >", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztGreaterThanOrEqualTo(String value) {
            addCriterion("CGZT >=", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztLessThan(String value) {
            addCriterion("CGZT <", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztLessThanOrEqualTo(String value) {
            addCriterion("CGZT <=", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztLike(String value) {
            addCriterion("CGZT like", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotLike(String value) {
            addCriterion("CGZT not like", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztIn(List<String> values) {
            addCriterion("CGZT in", values, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotIn(List<String> values) {
            addCriterion("CGZT not in", values, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztBetween(String value1, String value2) {
            addCriterion("CGZT between", value1, value2, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotBetween(String value1, String value2) {
            addCriterion("CGZT not between", value1, value2, "cgzt");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("VCHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("VCHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("VCHAR1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("VCHAR1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("VCHAR1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("VCHAR1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("VCHAR1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("VCHAR1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("VCHAR1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("VCHAR1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("VCHAR1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("VCHAR1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("VCHAR1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("VCHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("VCHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("VCHAR2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("VCHAR2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("VCHAR2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("VCHAR2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("VCHAR2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("VCHAR2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("VCHAR2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("VCHAR2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("VCHAR2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("VCHAR2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("VCHAR2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("VCHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("VCHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("VCHAR3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("VCHAR3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("VCHAR3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("VCHAR3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("VCHAR3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("VCHAR3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("VCHAR3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("VCHAR3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("VCHAR3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("VCHAR3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("VCHAR3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNull() {
            addCriterion("VCHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNotNull() {
            addCriterion("VCHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar4EqualTo(String value) {
            addCriterion("VCHAR4 =", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotEqualTo(String value) {
            addCriterion("VCHAR4 <>", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThan(String value) {
            addCriterion("VCHAR4 >", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR4 >=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThan(String value) {
            addCriterion("VCHAR4 <", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThanOrEqualTo(String value) {
            addCriterion("VCHAR4 <=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Like(String value) {
            addCriterion("VCHAR4 like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotLike(String value) {
            addCriterion("VCHAR4 not like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4In(List<String> values) {
            addCriterion("VCHAR4 in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotIn(List<String> values) {
            addCriterion("VCHAR4 not in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Between(String value1, String value2) {
            addCriterion("VCHAR4 between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotBetween(String value1, String value2) {
            addCriterion("VCHAR4 not between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNull() {
            addCriterion("VCHAR5 is null");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNotNull() {
            addCriterion("VCHAR5 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar5EqualTo(String value) {
            addCriterion("VCHAR5 =", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotEqualTo(String value) {
            addCriterion("VCHAR5 <>", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThan(String value) {
            addCriterion("VCHAR5 >", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR5 >=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThan(String value) {
            addCriterion("VCHAR5 <", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThanOrEqualTo(String value) {
            addCriterion("VCHAR5 <=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Like(String value) {
            addCriterion("VCHAR5 like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotLike(String value) {
            addCriterion("VCHAR5 not like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5In(List<String> values) {
            addCriterion("VCHAR5 in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotIn(List<String> values) {
            addCriterion("VCHAR5 not in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Between(String value1, String value2) {
            addCriterion("VCHAR5 between", value1, value2, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotBetween(String value1, String value2) {
            addCriterion("VCHAR5 not between", value1, value2, "vchar5");
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