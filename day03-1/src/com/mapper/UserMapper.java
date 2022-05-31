package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
	// 각각의 함수 명칭은 com.config.usermapper에 나오는 함수
	public void insert(UserVO obj) throws Exception;
	public void delete(String obj) throws Exception;
	public void update(UserVO obj) throws Exception;
	public UserVO select(String k) throws Exception;
	public List<UserVO> selectall() throws Exception;
	public List<UserVO> searchname(String name) throws Exception;
}
