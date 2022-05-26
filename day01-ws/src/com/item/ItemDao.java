package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVO;

public class ItemDao implements Dao<String, ItemVO> {

	@Override
	public void insert(ItemVO v) {
		System.out.println("Item Inserted: "+v);
	}
	@Override
	public void delete(String k) {
		System.out.println("Item Deleted: "+k);
	}

	@Override
	public void update(ItemVO v) {
		System.out.println("Item Updated: "+v);
	}

	@Override
	public ItemVO select(String k) {
		ItemVO i = new ItemVO(k, "speaker", 50000.0);
		return i;
	}

	@Override
	public List<ItemVO> select() {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		list.add(new ItemVO("item01", "watermelon", 15000.0));
		list.add(new ItemVO("item02", "water", 6300.0));
		list.add(new ItemVO("item03", "TV", 3000000.0));
		list.add(new ItemVO("item04", "car", 200000000.0));
		list.add(new ItemVO("item05", "phone", 1000000.0));
		return list;
	}

}
