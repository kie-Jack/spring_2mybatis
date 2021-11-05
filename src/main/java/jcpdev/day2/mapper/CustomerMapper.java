package jcpdev.day2.mapper;


import java.util.List;

import jcpdev.day2.dto.Customer;

public interface CustomerMapper {
	
	
	List<Customer> selectAll();
	Customer selectOne(int idx);
	int insert(Customer customer);
	int update(Customer customer);
	int delete(int idx);
}
