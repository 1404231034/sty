package com.lpc.mybatis.main;

import com.lpc.mybatis.mapper.RoleMapper;
import com.lpc.mybatis.pojo.Role;
import com.lpc.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

public class Chapter3Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Chapter3Main.class);

        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();

            RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);

            Role role = new Role("3333333", "wsy", "jhh", "4");

            mapper.updateRole(role);

            List<Role> roles = mapper.list();

            logger.info(roles.get(0).getName());
        } finally {

            if (sqlSession != null) {
                sqlSession.commit();
                sqlSession.close();
            }
        }
    }

}
