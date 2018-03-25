package com.ljk;

public class introduction {

    /**
     * Mybatis
     * Configuration 配置 xml 文件注解
     * mybatisconfig.xml 全局配置文件
     * Mappe.xml 配置多个 statemement 也就是多个sql
     *
     * SqlSessionFactory 根据配置文件创建：SqlSession
     * SqlSession 回话，类似一个 request ： 操作数据库，发出sql 增删查改
     * Executor 执行器，接口（基本执行器，缓存执行器）：SqlSession 内部通过执行器修改数据库
     *
     * 入参
     * mapped statement 对数据库存数封装，包括sql 参数 输出类型
     * 输出结果
     * mysql
     *
     */

    /**
     * 1.
     * mybatis的配置文件有2类
     * mybatisconfig.xml，配置文件的名称不是固定的，配置了全局的参数的配置，全局只能有一个配置文件。
     * Mapper.xml 配置多个statemement，也就是多个sql，整个mybatis框架中可以有多个Mappe.xml配置文件。

     * 2.
     * 通过mybatis配置文件得到SqlSessionFactory
     *
     * 3.
     * 通过SqlSessionFactory得到SqlSession，用SqlSession就可以操作数据了。
     *
     * 4。
     * SqlSession通过底层的Executor（执行器），执行器有2类实现：
     * 基本实现
     * 带有缓存功能的实现
     *
     * 5.
     * MappedStatement是通过Mapper.xml中定义statement生成的对象。
     *
     * 6.
     * 参数输入执行并输出结果集，无需手动判断参数类型和参数下标位置，且自动将结果集映射为Java对象
     * HashMap，KV格式的数据类型
     * Java的基本数据类型
     * POJO，java的对象
     */

    /**
     * 1.读取xml 建立链接
     *
     * 2.创建SqlSession, 搭建Configuration 和 Executor 之间的桥梁
     *
     * 3.创建Executor 封装JDBC操作数据库
     *
     * 4.创建MapperProxy 使用动态代理生成Mapper对象
     * 我们只是希望对指定的接口生成一个对象，使得执行它的时候能运行一句sql罢了，
     * 而接口无法直接调用方法，所以这里使用动态代理生成对象，
     * 在执行时还是回到MySqlSession中调用查询，最终由MyExecutor做JDBC查询。
     * 这样设计是为了单一职责，可扩展性更强。
     */
}
