package com.ljk.sqlSession;

import java.lang.reflect.Proxy;
import java.sql.ParameterMetaData;

public class MySqlsession {

    // 执行人
    private Excutor excutor = new MyExcutor();
    // 设置
    private MyConfiguration myConfiguration = new MyConfiguration();

    public<T> T selectOne(String statement, Object parameter) {
        return excutor.query(statement, parameter);
    }

    @SuppressWarnings("unchecked")
    public <T> T getMapper(Class<T> clas) {
        // 动态代理调用
        return (T) Proxy.newProxyInstance(clas.getClassLoader(), new Class[]{clas},
                new MyMapperProxy(myConfiguration, this));
    }
}
