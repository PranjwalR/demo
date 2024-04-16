package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Custumer {
	private int cust_id;
	private String custname;
	private String custDepartment;
	@Autowired
	private Services servic;
	public Services servicesdetails()
	{
		return servic;
	}
	
	
	public Services getServic() {
		return servic;
	}


	public void setServic(Services servic) {
		this.servic = servic;
	}


	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustDepartment() {
		return custDepartment;
	}
	public void setCustDepartment(String custDepartment) {
		this.custDepartment = custDepartment;
	}
	
	public void display()
	{
		System.out.println("Custumer class object returning to main app");
		servic.service();
		
	}
	
	
	

}
