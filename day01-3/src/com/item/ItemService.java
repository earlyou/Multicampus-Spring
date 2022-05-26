package com.item;

import java.util.List;

import com.frame.Dao;
import com.frame.Service;
import com.vo.ItemVO;

public class ItemService implements Service<String, ItemVO> {

	Dao<String, ItemVO> dao;
	
	// Getter & Setter
	public Dao<String, ItemVO> getDao() {
		return dao;
	}
	public void setDao(Dao<String, ItemVO> dao) {
		this.dao = dao;
	}

	
	@Override
	public void register(ItemVO v) {
		dao.insert(v);
	}
	@Override
	public void remove(String k) {
		dao.delete(k);
	}
	@Override
	public void modify(ItemVO v) {
		dao.update(v);
	}
	@Override
	public ItemVO get(String k) {
		return dao.select(k);
	}
	@Override
	public List<ItemVO> get() {
		return dao.select();
	}
	
}
