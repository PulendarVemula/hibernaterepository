package com.createiq.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="SUPERMARKET")
@NamedNativeQuery(name="get_all" ,query = "SELECT * FROM SUPERMARKET")
public class Customer {
	@Id
	@Column(name="C_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer c_id;
	@Column(name="C_Name")
	private String cname;
	@Column(name="Quantity")
	private Integer buyingqty;
	@Column(name="Amount")
	private Double amount;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer c_id, String cname, Integer buyingqty, Double amount) {
		super();
		this.c_id = c_id;
		this.cname = cname;
		this.buyingqty = buyingqty;
		this.amount = amount;
	}

	public Customer(String cname, Integer buyingqty, Double amount) {
		super();
		this.cname = cname;
		this.buyingqty = buyingqty;
		this.amount = amount;
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getBuyingqty() {
		return buyingqty;
	}

	public void setBuyingqty(Integer buyingqty) {
		this.buyingqty = buyingqty;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", cname=" + cname + ", buyingqty=" + buyingqty + ", amount=" + amount + "]";
	}
	
	
	

}
