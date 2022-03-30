package com.sap.chatbot.excel.util;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerRepository {
	List<Customer> custlist=new ArrayList<Customer>();
	public void saveAll(List<Customer> listcustomer)
	{
		custlist=listcustomer;
	}
	public List<Customer> getAll()
	{
		return custlist;
	}
}
