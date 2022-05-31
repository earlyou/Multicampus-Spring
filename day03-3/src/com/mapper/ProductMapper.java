package com.mapper;

import java.util.List;

import com.vo.ProductVO;

public interface ProductMapper {
	public void insert(ProductVO p)	throws Exception;// argument name(p)이 나중에 xml에 들어가는 이름이다
	public void delete(int id) throws Exception;
	public void update(ProductVO p) throws Exception;
	public ProductVO select(int id) throws Exception;
	public List<ProductVO> selectall() throws Exception;
}
