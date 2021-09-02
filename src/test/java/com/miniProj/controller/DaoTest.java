package com.miniProj.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.miniProj.persistence.EtcDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(  // root-context.xml 로딩하여 현재 클래스와 같이 실행하도록 하는 코드
		// 테스트코드는 root 설정을 못 불러와서 이걸 써줘야 한다. 실제작업은 이거 안써도됨.
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DaoTest {
			
			@Inject
			private EtcDAO dao; // dao 객체 주입 
			
			@Test
			public void daoTest() {
				System.out.println(dao.current());
			}

}
