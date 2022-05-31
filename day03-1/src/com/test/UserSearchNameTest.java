package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;
import com.vo.UserVO;

public class UserSearchNameTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
//		Service<Integer, ProductVO> service = 
//				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		// Service interface�� searchname�� �������� �ʾұ� ������ ���� �ʴ´�.
		UserService service = 
				(UserService) factory.getBean("uservice");
		
		List<UserVO> list = null;
		try {
			list = service.searchname("����");	// "����"�� ����ִ� ȸ�� ��ȸ
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (UserVO userVO : list) {
			System.out.println(userVO);
		}
	}
}