package com.service;

import java.util.Date;
import java.util.List;

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
	public List<ItemVO> getbp(int p1, int p2) throws Exception {
		return dao.getbp(p1, p2);
	}
	
	// �ش� ��¥ ���Ŀ� ��ϵ� ��ǰ �˻�
	public List<ItemVO> getbd(Date date) throws Exception {
		return dao.getbd(date);
	}
}