package com.neusoft.elm.po;

public class Business {
	private Integer businessId;
	private String password;
	private String businessName;
	private String businessAddress;
	private String businessExplain;
	private Double starPrice;
	private Double deliveryPrice;

	@Override
	public String toString() {
		return "\n商家编号：" + this.businessId + "\n商家名称：" + this.businessName + "\n商家地址：" + this.businessAddress
				+ "\n商家介绍：" + this.businessExplain + "\n起送费：¥" + this.starPrice + "\n配送费：¥" + this.deliveryPrice + "\n";
	}

	//set方法
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public void setBusinessExplain(String businessExplain) {
		this.businessExplain = businessExplain;
	}
	
	public void setStarPrice(Double starPrice) {
		this.starPrice = starPrice;
	}
	
	public void setDeliveryPrice(Double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	
	//get方法
	public String getBusinessName() {
		return this.businessName;
	}
	
	public String getBusinessAddress() {
		return this.businessAddress;
	}
	
	public String getBusinessExplain() {
		return this.businessExplain;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public Double getStarPrice() {
		return this.starPrice;
	}
	
	public Double getDeliveryPrice() {
		return this.deliveryPrice;
	}
	
	public Integer getBusinessId() {
		return this.businessId;
	}
}