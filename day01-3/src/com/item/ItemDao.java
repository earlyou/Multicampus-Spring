package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVO;

public class ItemDao implements Dao<String, ItemVO> {

	@Override
	public void insert(ItemVO v) {
		System.out.println("Inserted: "+v);
	}

	@Override
	public void delete(String k) {
		System.out.println("Deleted: "+k);
	}

	@Override
	public void update(ItemVO v) {
		System.out.println("Updated: "+v);
	}

	@Override
	public ItemVO select(String k) {
		ItemVO item = new ItemVO(k, "phone", 700000.0);
		return item;
	}

	@Override
	public List<ItemVO> select() {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		list.add(new ItemVO("item01", "phone", 700000.0));
		list.add(new ItemVO("item02", "milk", 5000.0));
		list.add(new ItemVO("item03", "car", 30000000.0));
		list.add(new ItemVO("item04", "TV", 600000.0));
		list.add(new ItemVO("item05", "toy", 15000.0));
		return list;
	}

}
