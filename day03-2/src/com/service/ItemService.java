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
	
	// Item name �˻��ϱ�
	public List<ItemVO> searchname(String id) throws Exception {
		return dao.searchname(id);
	}
	
	// Ư�� ���� ���� ���� ������ �˻��ϱ�
	public List<ItemVO> getbp(Map<String, Integer> map) throws Exception {
		return dao.getbp(map);
	}
	
	// �ش� ��¥ ���Ŀ� ��ϵ� ��ǰ �˻�
	public List<ItemVO> getbd(String date) throws Exception {
		return dao.getbd(date);
	}
}