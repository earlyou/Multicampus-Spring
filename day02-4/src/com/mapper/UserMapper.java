package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
	// 각각의 함수 명칭은 com.config.usermapper에 나오는 함수
	public void insert(UserVO obj);
	public void delete(String obj);
	public void update(UserVO obj);
	public UserVO select(String k);
	public List<UserVO> selectall();
}
