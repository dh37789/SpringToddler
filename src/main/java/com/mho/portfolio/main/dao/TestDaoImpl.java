package com.mho.portfolio.main.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao{

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public String test() {
		
		return sqlSession.selectOne("com.example.testMapper.testSelect");
	}

}
