package com.iamning.mapper;

import com.iamning.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    //我们所有操作，原来都使用sqlSession来执行，现在都是用SqlSessionTemplate

    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession=sqlSession;
    }


    @Override
    public List<User> selectUser() {
        User user = new User(5, "小王", "1564648");

        UserMapper mapper=getSqlSession().getMapper(UserMapper.class);

        mapper.addUser(user);

        mapper.deleteUser(5);

        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
