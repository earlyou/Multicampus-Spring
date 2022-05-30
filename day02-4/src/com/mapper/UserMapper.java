package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
	// ������ �Լ� ��Ī�� com.config.usermapper�� ������ �Լ�
	public void insert(UserVO obj);
	public void delete(String obj);
	public void update(UserVO obj);
	public UserVO select(String k);
	public List<UserVO> selectall();
}
