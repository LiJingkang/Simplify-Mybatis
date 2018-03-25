package com.ljk;

import com.ljk.bean.User;
import com.ljk.mapper.UserMapper;
import com.ljk.sqlSession.MySqlsession;

public class TestMybatis {

    public static void main(String[] args) {
        MySqlsession sqlsession = new MySqlsession();

        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        User user = mapper.getUserById("2");
        System.out.println(user);
    }
}
