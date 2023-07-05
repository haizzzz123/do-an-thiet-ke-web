package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.dao.impl.ICompanyDAO;
import com.laptrinhjavaweb.mapper.companyMapper;
import com.laptrinhjavaweb.model.companyModel;

public class companyDAO extends AbstractDAO<companyModel> implements ICompanyDAO{

	@Override
	public List<companyModel> selectAll() {
		String sql = "SELECT * FROM company";
		
		return query(sql, new companyMapper());
	}
	
}
