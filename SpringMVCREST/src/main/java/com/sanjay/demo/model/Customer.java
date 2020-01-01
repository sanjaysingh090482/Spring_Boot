package com.sanjay.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	//@GeneratedValue
	
	private int  cid;
	private String cname;
	private String caccount;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaccount() {
		return caccount;
	}
	public void setCaccount(String caccount) {
		this.caccount = caccount;
	}
		
	
}
