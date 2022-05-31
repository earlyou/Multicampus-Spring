package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.CustMapper;
import com.vo.CustVO;

@org.springframework.stereotype.Service("cservice")
public class CustService implements Service<String, CustVO>{
	
	@Autowired
	CustMapper dao;
	
	@Override
	public void register(CustVO v) throws Exception {
		dao.insert(v);
	}
	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}
	@Override
	public void modify(CustVO v) throws Exception {
		dao.update(v);
	}
	@Override
	public CustVO get(String k) throws Exception {
		return dao.select(k);
	}
	@Override
	public List<CustVO> get() throws Exception {
		return dao.selectall();
	}
}
