package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.CustVO;

@Repository		// Spring Container에서 CustMapper가 Autowired로 검색될 수 있도록 함
@Mapper
public interface CustMapper {	// method name = mapper.xml의 id
	public void insert(CustVO cust) throws Exception;
	public void delete(String id) throws Exception;
	public void update(CustVO cust) throws Exception;
	public CustVO select(String id) throws Exception;
	public List<CustVO> selectall() throws Exception;
}
