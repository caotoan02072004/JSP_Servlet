package DAO;

import java.util.List;

import entity.Customer;

public interface CustomerDAO {
	public List<Customer> getAllCustomer();
	public void addCustomer(String name, String gender, String birthday, String address, String phone, String email);
	public void deleteCustomer(String id);
	public Customer getCustomerById(String id);
	public void updateCustomer(String name, String gender, String birthday, String address, String phone, String email, String id);
}