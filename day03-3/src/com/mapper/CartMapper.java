package com.mapper;

import java.util.List;

import com.vo.CartVO;

public interface CartMapper {
	public void insert(CartVO car) throws Exception;
	public void delete(int id) throws Exception;
	public void update(CartVO car) throws Exception;
	public CartVO select(int id) throws Exception;
	public List<CartVO> selectall() throws Exception;
}
