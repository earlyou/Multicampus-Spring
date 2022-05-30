package com.mapper;

import java.util.List;

import com.vo.ProductVO;

public interface ProductMapper {
	public void insert(ProductVO obj);
	public void delete(Integer k);
	public void update(ProductVO obj);
	public ProductVO select(Integer k);
	public List<ProductVO> selectall();
}
