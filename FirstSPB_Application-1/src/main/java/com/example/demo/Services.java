package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Services {
	private int serviceId;
	private String servicename;
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	
public void service()
{
	System.out.println(".....from service class..");
}

}
