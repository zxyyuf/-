package yycg.business.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YpxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YpxxExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andBmIsNull() {
            addCriterion("BM is null");
            return (Criteria) this;
        }

        public Criteria andBmIsNotNull() {
            addCriterion("BM is not null");
            return (Criteria) this;
        }

        public Criteria andBmEqualTo(String value) {
            addCriterion("BM =", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotEqualTo(String value) {
            addCriterion("BM <>", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThan(String value) {
            addCriterion("BM >", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThanOrEqualTo(String value) {
            addCriterion("BM >=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThan(String value) {
            addCriterion("BM <", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThanOrEqualTo(String value) {
            addCriterion("BM <=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLike(String value) {
            addCriterion("BM like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotLike(String value) {
            addCriterion("BM not like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmIn(List<String> values) {
            addCriterion("BM in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotIn(List<String> values) {
            addCriterion("BM not in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmBetween(String value1, String value2) {
            addCriterion("BM between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotBetween(String value1, String value2) {
            addCriterion("BM not between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andScqymcIsNull() {
            addCriterion("SCQYMC is null");
            return (Criteria) this;
        }

        public Criteria andScqymcIsNotNull() {
            addCriterion("SCQYMC is not null");
            return (Criteria) this;
        }

        public Criteria andScqymcEqualTo(String value) {
            addCriterion("SCQYMC =", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcNotEqualTo(String value) {
            addCriterion("SCQYMC <>", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcGreaterThan(String value) {
            addCriterion("SCQYMC >", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcGreaterThanOrEqualTo(String value) {
            addCriterion("SCQYMC >=", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcLessThan(String value) {
            addCriterion("SCQYMC <", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcLessThanOrEqualTo(String value) {
            addCriterion("SCQYMC <=", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcLike(String value) {
            addCriterion("SCQYMC like", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcNotLike(String value) {
            addCriterion("SCQYMC not like", value, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcIn(List<String> values) {
            addCriterion("SCQYMC in", values, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcNotIn(List<String> values) {
            addCriterion("SCQYMC not in", values, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcBetween(String value1, String value2) {
            addCriterion("SCQYMC between", value1, value2, "scqymc");
            return (Criteria) this;
        }

        public Criteria andScqymcNotBetween(String value1, String value2) {
            addCriterion("SCQYMC not between", value1, value2, "scqymc");
            return (Criteria) this;
        }

        public Criteria andSpmcIsNull() {
            addCriterion("SPMC is null");
            return (Criteria) this;
        }

        public Criteria andSpmcIsNotNull() {
            addCriterion("SPMC is not null");
            return (Criteria) this;
        }

        public Criteria andSpmcEqualTo(String value) {
            addCriterion("SPMC =", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcNotEqualTo(String value) {
            addCriterion("SPMC <>", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcGreaterThan(String value) {
            addCriterion("SPMC >", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcGreaterThanOrEqualTo(String value) {
            addCriterion("SPMC >=", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcLessThan(String value) {
            addCriterion("SPMC <", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcLessThanOrEqualTo(String value) {
            addCriterion("SPMC <=", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcLike(String value) {
            addCriterion("SPMC like", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcNotLike(String value) {
            addCriterion("SPMC not like", value, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcIn(List<String> values) {
            addCriterion("SPMC in", values, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcNotIn(List<String> values) {
            addCriterion("SPMC not in", values, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcBetween(String value1, String value2) {
            addCriterion("SPMC between", value1, value2, "spmc");
            return (Criteria) this;
        }

        public Criteria andSpmcNotBetween(String value1, String value2) {
            addCriterion("SPMC not between", value1, value2, "spmc");
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

        public Criteria andZpdzIsNull() {
            addCriterion("ZPDZ is null");
            return (Criteria) this;
        }

        public Criteria andZpdzIsNotNull() {
            addCriterion("ZPDZ is not null");
            return (Criteria) this;
        }

        public Criteria andZpdzEqualTo(String value) {
            addCriterion("ZPDZ =", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzNotEqualTo(String value) {
            addCriterion("ZPDZ <>", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzGreaterThan(String value) {
            addCriterion("ZPDZ >", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzGreaterThanOrEqualTo(String value) {
            addCriterion("ZPDZ >=", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzLessThan(String value) {
            addCriterion("ZPDZ <", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzLessThanOrEqualTo(String value) {
            addCriterion("ZPDZ <=", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzLike(String value) {
            addCriterion("ZPDZ like", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzNotLike(String value) {
            addCriterion("ZPDZ not like", value, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzIn(List<String> values) {
            addCriterion("ZPDZ in", values, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzNotIn(List<String> values) {
            addCriterion("ZPDZ not in", values, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzBetween(String value1, String value2) {
            addCriterion("ZPDZ between", value1, value2, "zpdz");
            return (Criteria) this;
        }

        public Criteria andZpdzNotBetween(String value1, String value2) {
            addCriterion("ZPDZ not between", value1, value2, "zpdz");
            return (Criteria) this;
        }

        public Criteria andPzwhIsNull() {
            addCriterion("PZWH is null");
            return (Criteria) this;
        }

        public Criteria andPzwhIsNotNull() {
            addCriterion("PZWH is not null");
            return (Criteria) this;
        }

        public Criteria andPzwhEqualTo(String value) {
            addCriterion("PZWH =", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotEqualTo(String value) {
            addCriterion("PZWH <>", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhGreaterThan(String value) {
            addCriterion("PZWH >", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhGreaterThanOrEqualTo(String value) {
            addCriterion("PZWH >=", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhLessThan(String value) {
            addCriterion("PZWH <", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhLessThanOrEqualTo(String value) {
            addCriterion("PZWH <=", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhLike(String value) {
            addCriterion("PZWH like", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotLike(String value) {
            addCriterion("PZWH not like", value, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhIn(List<String> values) {
            addCriterion("PZWH in", values, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotIn(List<String> values) {
            addCriterion("PZWH not in", values, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhBetween(String value1, String value2) {
            addCriterion("PZWH between", value1, value2, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhNotBetween(String value1, String value2) {
            addCriterion("PZWH not between", value1, value2, "pzwh");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqIsNull() {
            addCriterion("PZWHYXQ is null");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqIsNotNull() {
            addCriterion("PZWHYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqEqualTo(Date value) {
            addCriterionForJDBCDate("PZWHYXQ =", value, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("PZWHYXQ <>", value, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("PZWHYXQ >", value, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PZWHYXQ >=", value, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqLessThan(Date value) {
            addCriterionForJDBCDate("PZWHYXQ <", value, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PZWHYXQ <=", value, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqIn(List<Date> values) {
            addCriterionForJDBCDate("PZWHYXQ in", values, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("PZWHYXQ not in", values, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PZWHYXQ between", value1, value2, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andPzwhyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PZWHYXQ not between", value1, value2, "pzwhyxq");
            return (Criteria) this;
        }

        public Criteria andJkyIsNull() {
            addCriterion("JKY is null");
            return (Criteria) this;
        }

        public Criteria andJkyIsNotNull() {
            addCriterion("JKY is not null");
            return (Criteria) this;
        }

        public Criteria andJkyEqualTo(String value) {
            addCriterion("JKY =", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyNotEqualTo(String value) {
            addCriterion("JKY <>", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyGreaterThan(String value) {
            addCriterion("JKY >", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyGreaterThanOrEqualTo(String value) {
            addCriterion("JKY >=", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyLessThan(String value) {
            addCriterion("JKY <", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyLessThanOrEqualTo(String value) {
            addCriterion("JKY <=", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyLike(String value) {
            addCriterion("JKY like", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyNotLike(String value) {
            addCriterion("JKY not like", value, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyIn(List<String> values) {
            addCriterion("JKY in", values, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyNotIn(List<String> values) {
            addCriterion("JKY not in", values, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyBetween(String value1, String value2) {
            addCriterion("JKY between", value1, value2, "jky");
            return (Criteria) this;
        }

        public Criteria andJkyNotBetween(String value1, String value2) {
            addCriterion("JKY not between", value1, value2, "jky");
            return (Criteria) this;
        }

        public Criteria andBzczIsNull() {
            addCriterion("BZCZ is null");
            return (Criteria) this;
        }

        public Criteria andBzczIsNotNull() {
            addCriterion("BZCZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzczEqualTo(String value) {
            addCriterion("BZCZ =", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczNotEqualTo(String value) {
            addCriterion("BZCZ <>", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczGreaterThan(String value) {
            addCriterion("BZCZ >", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczGreaterThanOrEqualTo(String value) {
            addCriterion("BZCZ >=", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczLessThan(String value) {
            addCriterion("BZCZ <", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczLessThanOrEqualTo(String value) {
            addCriterion("BZCZ <=", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczLike(String value) {
            addCriterion("BZCZ like", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczNotLike(String value) {
            addCriterion("BZCZ not like", value, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczIn(List<String> values) {
            addCriterion("BZCZ in", values, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczNotIn(List<String> values) {
            addCriterion("BZCZ not in", values, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczBetween(String value1, String value2) {
            addCriterion("BZCZ between", value1, value2, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzczNotBetween(String value1, String value2) {
            addCriterion("BZCZ not between", value1, value2, "bzcz");
            return (Criteria) this;
        }

        public Criteria andBzdwIsNull() {
            addCriterion("BZDW is null");
            return (Criteria) this;
        }

        public Criteria andBzdwIsNotNull() {
            addCriterion("BZDW is not null");
            return (Criteria) this;
        }

        public Criteria andBzdwEqualTo(String value) {
            addCriterion("BZDW =", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwNotEqualTo(String value) {
            addCriterion("BZDW <>", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwGreaterThan(String value) {
            addCriterion("BZDW >", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwGreaterThanOrEqualTo(String value) {
            addCriterion("BZDW >=", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwLessThan(String value) {
            addCriterion("BZDW <", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwLessThanOrEqualTo(String value) {
            addCriterion("BZDW <=", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwLike(String value) {
            addCriterion("BZDW like", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwNotLike(String value) {
            addCriterion("BZDW not like", value, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwIn(List<String> values) {
            addCriterion("BZDW in", values, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwNotIn(List<String> values) {
            addCriterion("BZDW not in", values, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwBetween(String value1, String value2) {
            addCriterion("BZDW between", value1, value2, "bzdw");
            return (Criteria) this;
        }

        public Criteria andBzdwNotBetween(String value1, String value2) {
            addCriterion("BZDW not between", value1, value2, "bzdw");
            return (Criteria) this;
        }

        public Criteria andLsjgIsNull() {
            addCriterion("LSJG is null");
            return (Criteria) this;
        }

        public Criteria andLsjgIsNotNull() {
            addCriterion("LSJG is not null");
            return (Criteria) this;
        }

        public Criteria andLsjgEqualTo(Double value) {
            addCriterion("LSJG =", value, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgNotEqualTo(Double value) {
            addCriterion("LSJG <>", value, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgGreaterThan(Double value) {
            addCriterion("LSJG >", value, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgGreaterThanOrEqualTo(Double value) {
            addCriterion("LSJG >=", value, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgLessThan(Double value) {
            addCriterion("LSJG <", value, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgLessThanOrEqualTo(Double value) {
            addCriterion("LSJG <=", value, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgIn(List<Double> values) {
            addCriterion("LSJG in", values, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgNotIn(List<Double> values) {
            addCriterion("LSJG not in", values, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgBetween(Double value1, Double value2) {
            addCriterion("LSJG between", value1, value2, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgNotBetween(Double value1, Double value2) {
            addCriterion("LSJG not between", value1, value2, "lsjg");
            return (Criteria) this;
        }

        public Criteria andLsjgccIsNull() {
            addCriterion("LSJGCC is null");
            return (Criteria) this;
        }

        public Criteria andLsjgccIsNotNull() {
            addCriterion("LSJGCC is not null");
            return (Criteria) this;
        }

        public Criteria andLsjgccEqualTo(String value) {
            addCriterion("LSJGCC =", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccNotEqualTo(String value) {
            addCriterion("LSJGCC <>", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccGreaterThan(String value) {
            addCriterion("LSJGCC >", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccGreaterThanOrEqualTo(String value) {
            addCriterion("LSJGCC >=", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccLessThan(String value) {
            addCriterion("LSJGCC <", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccLessThanOrEqualTo(String value) {
            addCriterion("LSJGCC <=", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccLike(String value) {
            addCriterion("LSJGCC like", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccNotLike(String value) {
            addCriterion("LSJGCC not like", value, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccIn(List<String> values) {
            addCriterion("LSJGCC in", values, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccNotIn(List<String> values) {
            addCriterion("LSJGCC not in", values, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccBetween(String value1, String value2) {
            addCriterion("LSJGCC between", value1, value2, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andLsjgccNotBetween(String value1, String value2) {
            addCriterion("LSJGCC not between", value1, value2, "lsjgcc");
            return (Criteria) this;
        }

        public Criteria andZlccIsNull() {
            addCriterion("ZLCC is null");
            return (Criteria) this;
        }

        public Criteria andZlccIsNotNull() {
            addCriterion("ZLCC is not null");
            return (Criteria) this;
        }

        public Criteria andZlccEqualTo(String value) {
            addCriterion("ZLCC =", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccNotEqualTo(String value) {
            addCriterion("ZLCC <>", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccGreaterThan(String value) {
            addCriterion("ZLCC >", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccGreaterThanOrEqualTo(String value) {
            addCriterion("ZLCC >=", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccLessThan(String value) {
            addCriterion("ZLCC <", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccLessThanOrEqualTo(String value) {
            addCriterion("ZLCC <=", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccLike(String value) {
            addCriterion("ZLCC like", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccNotLike(String value) {
            addCriterion("ZLCC not like", value, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccIn(List<String> values) {
            addCriterion("ZLCC in", values, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccNotIn(List<String> values) {
            addCriterion("ZLCC not in", values, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccBetween(String value1, String value2) {
            addCriterion("ZLCC between", value1, value2, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccNotBetween(String value1, String value2) {
            addCriterion("ZLCC not between", value1, value2, "zlcc");
            return (Criteria) this;
        }

        public Criteria andZlccsmIsNull() {
            addCriterion("ZLCCSM is null");
            return (Criteria) this;
        }

        public Criteria andZlccsmIsNotNull() {
            addCriterion("ZLCCSM is not null");
            return (Criteria) this;
        }

        public Criteria andZlccsmEqualTo(String value) {
            addCriterion("ZLCCSM =", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmNotEqualTo(String value) {
            addCriterion("ZLCCSM <>", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmGreaterThan(String value) {
            addCriterion("ZLCCSM >", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmGreaterThanOrEqualTo(String value) {
            addCriterion("ZLCCSM >=", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmLessThan(String value) {
            addCriterion("ZLCCSM <", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmLessThanOrEqualTo(String value) {
            addCriterion("ZLCCSM <=", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmLike(String value) {
            addCriterion("ZLCCSM like", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmNotLike(String value) {
            addCriterion("ZLCCSM not like", value, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmIn(List<String> values) {
            addCriterion("ZLCCSM in", values, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmNotIn(List<String> values) {
            addCriterion("ZLCCSM not in", values, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmBetween(String value1, String value2) {
            addCriterion("ZLCCSM between", value1, value2, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andZlccsmNotBetween(String value1, String value2) {
            addCriterion("ZLCCSM not between", value1, value2, "zlccsm");
            return (Criteria) this;
        }

        public Criteria andYpjybgIsNull() {
            addCriterion("YPJYBG is null");
            return (Criteria) this;
        }

        public Criteria andYpjybgIsNotNull() {
            addCriterion("YPJYBG is not null");
            return (Criteria) this;
        }

        public Criteria andYpjybgEqualTo(String value) {
            addCriterion("YPJYBG =", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgNotEqualTo(String value) {
            addCriterion("YPJYBG <>", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgGreaterThan(String value) {
            addCriterion("YPJYBG >", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgGreaterThanOrEqualTo(String value) {
            addCriterion("YPJYBG >=", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgLessThan(String value) {
            addCriterion("YPJYBG <", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgLessThanOrEqualTo(String value) {
            addCriterion("YPJYBG <=", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgLike(String value) {
            addCriterion("YPJYBG like", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgNotLike(String value) {
            addCriterion("YPJYBG not like", value, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgIn(List<String> values) {
            addCriterion("YPJYBG in", values, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgNotIn(List<String> values) {
            addCriterion("YPJYBG not in", values, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgBetween(String value1, String value2) {
            addCriterion("YPJYBG between", value1, value2, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgNotBetween(String value1, String value2) {
            addCriterion("YPJYBG not between", value1, value2, "ypjybg");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmIsNull() {
            addCriterion("YPJYBGBM is null");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmIsNotNull() {
            addCriterion("YPJYBGBM is not null");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmEqualTo(String value) {
            addCriterion("YPJYBGBM =", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmNotEqualTo(String value) {
            addCriterion("YPJYBGBM <>", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmGreaterThan(String value) {
            addCriterion("YPJYBGBM >", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmGreaterThanOrEqualTo(String value) {
            addCriterion("YPJYBGBM >=", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmLessThan(String value) {
            addCriterion("YPJYBGBM <", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmLessThanOrEqualTo(String value) {
            addCriterion("YPJYBGBM <=", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmLike(String value) {
            addCriterion("YPJYBGBM like", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmNotLike(String value) {
            addCriterion("YPJYBGBM not like", value, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmIn(List<String> values) {
            addCriterion("YPJYBGBM in", values, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmNotIn(List<String> values) {
            addCriterion("YPJYBGBM not in", values, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmBetween(String value1, String value2) {
            addCriterion("YPJYBGBM between", value1, value2, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgbmNotBetween(String value1, String value2) {
            addCriterion("YPJYBGBM not between", value1, value2, "ypjybgbm");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqIsNull() {
            addCriterion("YPJYBGYXQ is null");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqIsNotNull() {
            addCriterion("YPJYBGYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqEqualTo(Date value) {
            addCriterionForJDBCDate("YPJYBGYXQ =", value, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("YPJYBGYXQ <>", value, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("YPJYBGYXQ >", value, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YPJYBGYXQ >=", value, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqLessThan(Date value) {
            addCriterionForJDBCDate("YPJYBGYXQ <", value, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YPJYBGYXQ <=", value, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqIn(List<Date> values) {
            addCriterionForJDBCDate("YPJYBGYXQ in", values, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("YPJYBGYXQ not in", values, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YPJYBGYXQ between", value1, value2, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andYpjybgyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YPJYBGYXQ not between", value1, value2, "ypjybgyxq");
            return (Criteria) this;
        }

        public Criteria andJyztIsNull() {
            addCriterion("JYZT is null");
            return (Criteria) this;
        }

        public Criteria andJyztIsNotNull() {
            addCriterion("JYZT is not null");
            return (Criteria) this;
        }

        public Criteria andJyztEqualTo(String value) {
            addCriterion("JYZT =", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztNotEqualTo(String value) {
            addCriterion("JYZT <>", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztGreaterThan(String value) {
            addCriterion("JYZT >", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztGreaterThanOrEqualTo(String value) {
            addCriterion("JYZT >=", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztLessThan(String value) {
            addCriterion("JYZT <", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztLessThanOrEqualTo(String value) {
            addCriterion("JYZT <=", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztLike(String value) {
            addCriterion("JYZT like", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztNotLike(String value) {
            addCriterion("JYZT not like", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztIn(List<String> values) {
            addCriterion("JYZT in", values, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztNotIn(List<String> values) {
            addCriterion("JYZT not in", values, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztBetween(String value1, String value2) {
            addCriterion("JYZT between", value1, value2, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztNotBetween(String value1, String value2) {
            addCriterion("JYZT not between", value1, value2, "jyzt");
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

        public Criteria andDwIsNull() {
            addCriterion("DW is null");
            return (Criteria) this;
        }

        public Criteria andDwIsNotNull() {
            addCriterion("DW is not null");
            return (Criteria) this;
        }

        public Criteria andDwEqualTo(String value) {
            addCriterion("DW =", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotEqualTo(String value) {
            addCriterion("DW <>", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThan(String value) {
            addCriterion("DW >", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThanOrEqualTo(String value) {
            addCriterion("DW >=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThan(String value) {
            addCriterion("DW <", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThanOrEqualTo(String value) {
            addCriterion("DW <=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLike(String value) {
            addCriterion("DW like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotLike(String value) {
            addCriterion("DW not like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwIn(List<String> values) {
            addCriterion("DW in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotIn(List<String> values) {
            addCriterion("DW not in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwBetween(String value1, String value2) {
            addCriterion("DW between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotBetween(String value1, String value2) {
            addCriterion("DW not between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("MC is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("MC is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("MC =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("MC <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("MC >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("MC >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("MC <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("MC <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("MC like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("MC not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("MC in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("MC not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("MC between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("MC not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andJxIsNull() {
            addCriterion("JX is null");
            return (Criteria) this;
        }

        public Criteria andJxIsNotNull() {
            addCriterion("JX is not null");
            return (Criteria) this;
        }

        public Criteria andJxEqualTo(String value) {
            addCriterion("JX =", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxNotEqualTo(String value) {
            addCriterion("JX <>", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxGreaterThan(String value) {
            addCriterion("JX >", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxGreaterThanOrEqualTo(String value) {
            addCriterion("JX >=", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxLessThan(String value) {
            addCriterion("JX <", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxLessThanOrEqualTo(String value) {
            addCriterion("JX <=", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxLike(String value) {
            addCriterion("JX like", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxNotLike(String value) {
            addCriterion("JX not like", value, "jx");
            return (Criteria) this;
        }

        public Criteria andJxIn(List<String> values) {
            addCriterion("JX in", values, "jx");
            return (Criteria) this;
        }

        public Criteria andJxNotIn(List<String> values) {
            addCriterion("JX not in", values, "jx");
            return (Criteria) this;
        }

        public Criteria andJxBetween(String value1, String value2) {
            addCriterion("JX between", value1, value2, "jx");
            return (Criteria) this;
        }

        public Criteria andJxNotBetween(String value1, String value2) {
            addCriterion("JX not between", value1, value2, "jx");
            return (Criteria) this;
        }

        public Criteria andGgIsNull() {
            addCriterion("GG is null");
            return (Criteria) this;
        }

        public Criteria andGgIsNotNull() {
            addCriterion("GG is not null");
            return (Criteria) this;
        }

        public Criteria andGgEqualTo(String value) {
            addCriterion("GG =", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotEqualTo(String value) {
            addCriterion("GG <>", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgGreaterThan(String value) {
            addCriterion("GG >", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgGreaterThanOrEqualTo(String value) {
            addCriterion("GG >=", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLessThan(String value) {
            addCriterion("GG <", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLessThanOrEqualTo(String value) {
            addCriterion("GG <=", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLike(String value) {
            addCriterion("GG like", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotLike(String value) {
            addCriterion("GG not like", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgIn(List<String> values) {
            addCriterion("GG in", values, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotIn(List<String> values) {
            addCriterion("GG not in", values, "gg");
            return (Criteria) this;
        }

        public Criteria andGgBetween(String value1, String value2) {
            addCriterion("GG between", value1, value2, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotBetween(String value1, String value2) {
            addCriterion("GG not between", value1, value2, "gg");
            return (Criteria) this;
        }

        public Criteria andZhxsIsNull() {
            addCriterion("ZHXS is null");
            return (Criteria) this;
        }

        public Criteria andZhxsIsNotNull() {
            addCriterion("ZHXS is not null");
            return (Criteria) this;
        }

        public Criteria andZhxsEqualTo(String value) {
            addCriterion("ZHXS =", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsNotEqualTo(String value) {
            addCriterion("ZHXS <>", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsGreaterThan(String value) {
            addCriterion("ZHXS >", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsGreaterThanOrEqualTo(String value) {
            addCriterion("ZHXS >=", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsLessThan(String value) {
            addCriterion("ZHXS <", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsLessThanOrEqualTo(String value) {
            addCriterion("ZHXS <=", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsLike(String value) {
            addCriterion("ZHXS like", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsNotLike(String value) {
            addCriterion("ZHXS not like", value, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsIn(List<String> values) {
            addCriterion("ZHXS in", values, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsNotIn(List<String> values) {
            addCriterion("ZHXS not in", values, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsBetween(String value1, String value2) {
            addCriterion("ZHXS between", value1, value2, "zhxs");
            return (Criteria) this;
        }

        public Criteria andZhxsNotBetween(String value1, String value2) {
            addCriterion("ZHXS not between", value1, value2, "zhxs");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("PINYIN =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("PINYIN <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("PINYIN >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("PINYIN >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("PINYIN <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("PINYIN <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("PINYIN like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("PINYIN not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("PINYIN in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("PINYIN not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("PINYIN between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("PINYIN not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andLbIsNull() {
            addCriterion("LB is null");
            return (Criteria) this;
        }

        public Criteria andLbIsNotNull() {
            addCriterion("LB is not null");
            return (Criteria) this;
        }

        public Criteria andLbEqualTo(String value) {
            addCriterion("LB =", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotEqualTo(String value) {
            addCriterion("LB <>", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThan(String value) {
            addCriterion("LB >", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThanOrEqualTo(String value) {
            addCriterion("LB >=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThan(String value) {
            addCriterion("LB <", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThanOrEqualTo(String value) {
            addCriterion("LB <=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLike(String value) {
            addCriterion("LB like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotLike(String value) {
            addCriterion("LB not like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbIn(List<String> values) {
            addCriterion("LB in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotIn(List<String> values) {
            addCriterion("LB not in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbBetween(String value1, String value2) {
            addCriterion("LB between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotBetween(String value1, String value2) {
            addCriterion("LB not between", value1, value2, "lb");
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