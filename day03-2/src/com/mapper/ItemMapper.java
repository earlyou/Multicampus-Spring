package com.mapper;

import java.util.Date;
import java.util.List;

import com.vo.ItemVO;

public interface ItemMapper {
	public void insert(ItemVO obj) throws Exception;
	public void delete(int k) throws Exception;
	public void update(ItemVO obj) throws Exception;
	public ItemVO select(int k) throws Exception;
	public List<ItemVO> selectall() throws Exception;
	public List<ItemVO> searchname(String name) throws Exception;
	public List<ItemVO> getbp(int p1, int p2) throws Exception;
	public List<ItemVO> getbd(Date date) throws Exception;
}
