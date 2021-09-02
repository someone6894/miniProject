package com.miniProj.persistence.etc;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class EtcDAOImpl implements EtcDAO{

	
	@Inject
	private SqlSession ses; // sqlSessionTemplate 객체 주입
	// SqlSession 는 sqlSessionTemplate의 상위 클래스이므로 다형성이 적용된 것.

	private static final String ns = "com.miniProj.mapper.EtcMapper";

	@Override
	public String current() {
		String query = ns + ".now";
		return ses.selectOne(query); // SQL 실행 com.webshjin.mapper.MemberMapper.getCurTime 안에 쿼리문 가져와 실행.
	}

	
	
}
