package com.mapper;

import java.util.List;
import java.util.Map;

import com.vo.ItemVO;

public interface ItemMapper {
	public void insert(ItemVO obj) throws Exception;
	public void delete(int k) throws Exception;
	public void update(ItemVO obj) throws Exception;
	public ItemVO select(int k) throws Exception;
	public List<ItemVO> selectall() throws Exception;
	public List<ItemVO> searchname(String name) throws Exception;
	public List<ItemVO> getbp(Map<String,Integer> map) throws Exception;	// ���� 2���� �־ ������ Map���� �ص��ȴ�.
	public List<ItemVO> getbd(String date) throws Exception;	// Date�� �ص� ������ String���� �ص� �ȴ�.
}
