package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
	// ������ �Լ� ��Ī�� com.config.usermapper�� ������ �Լ�
	public void insert(UserVO obj) throws Exception;
	public void delete(String obj) throws Exception;
	public void update(UserVO obj) throws Exception;
	public UserVO select(String k) throws Exception;
	public List<UserVO> selectall() throws Exception;
	public List<UserVO> searchname(String name) throws Exception;
}
