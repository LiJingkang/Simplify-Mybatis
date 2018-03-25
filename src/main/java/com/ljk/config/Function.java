package com.ljk.config;

public class Function {
    //sql的类型,计划在xml读取有四种情况
    private String sqltype;
    // 方法名
    private String funcName;
    //执行的sql语句
    private String sql;
    // 返回类型
    private Object resultType;
    //参数类型
    private String parameterType;
    public String getSqltype() {
        return sqltype;
    }
    public void setSqltype(String sqltype) {
        this.sqltype = sqltype;
    }
    public String getFuncName() {
        return funcName;
    }
    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }
    public String getSql() {
        return sql;
    }
    public void setSql(String sql) {
        this.sql = sql;
    }
    public Object getResultType() {
        return resultType;
    }
    public void setResultType(Object resultType) {
        this.resultType = resultType;
    }
    public String getParameterType() {
        return parameterType;
    }
    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }


}
