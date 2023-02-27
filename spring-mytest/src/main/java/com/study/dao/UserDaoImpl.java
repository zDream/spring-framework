package com.study.dao;

import com.study.entity.User;
import com.study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * @author zhutongtong
 * @date 2022/6/23 19:24
 */
@Service
public class UserDaoImpl implements UserDao{

	JdbcTemplate jdbcTemplate;
	TransactionManager transactionManager;

	@Autowired
	public UserDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public User getById(Integer id) {
		return jdbcTemplate.queryForObject("select * from user where id = ?",new Object[] { id },new UserMapper());
	}

	@Override
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
	public boolean insertUser(User user) {
		boolean result = jdbcTemplate.update("insert into user (id,name,email) value(?,?,?)",user.getId(),user.getName(),user.getEmail()) > 0;
//		int a = 4/0;
		if(true){
			throw new RuntimeException();
		}
		return result;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean insertUserException(User user) {
		boolean result = jdbcTemplate.update("insert into user (id,name,email) value(?,?,?)",user.getId(),user.getName(),user.getEmail()) > 0;
		Object a = null;
		if(a.equals("33")){
			System.out.println("333");
		}

		return result;
	}
}
