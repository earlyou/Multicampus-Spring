package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Service;
import com.mapper.ItemMapper;
import com.vo.ItemVO;

@org.springframework.stereotype.Service("iservice")
public class ItemService implements Service<Integer, ItemVO> {
	
	@Autowired
	ItemMapper dao;

	@Override
	public void register(ItemVO v) throws Exception {
		dao.insert(v);
	}
	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}
	@Override
	public void modify(ItemVO v) throws Exception {
		dao.update(v);
	}
	@Override
	public ItemVO get(Integer k) throws Exception {
		return dao.select(k);
	}
	@Override
	public List<ItemVO> get() throws Exception {
		return dao.selectall();
	}
	
	// Item name 검색하기
	public List<ItemVO> searchname(String id) throws Exception {
		return dao.searchname(id);
	}
	
	// 특정 가격 사이 가격 아이템 검색하기
	public List<ItemVO> getbp(Map<String, Integer> map) throws Exception {
		return dao.getbp(map);
	}
	
	// 해당 날짜 이후에 등록된 제품 검색
	public List<ItemVO> getbd(String date) throws Exception {
		return dao.getbd(date);
	}
}