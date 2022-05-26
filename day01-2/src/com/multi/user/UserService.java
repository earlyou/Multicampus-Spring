package com.multi.user;

import com.multi.frame.Dao;
import com.multi.frame.Service;
import com.multi.vo.UserVO;

public class UserService implements Service<UserVO> {
	
	Dao<UserVO> dao;	// Service requires Dao
	
	
	// getter & Setter
	public Dao<UserVO> getDao() {
		return dao;
	}
	public void setDao(Dao<UserVO> dao) {
		this.dao = dao;
	}
	
	// method
	@Override
	public void register(UserVO v) {
		dao.insert(v);
	}
	
}
