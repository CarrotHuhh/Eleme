package com.neusoft.elm.po;

public class Food {
	private Integer foodId;
	private String foodName;
	private String foodExplain;
	private Double foodPrice;
	private Integer businessId;

	@Override
	public String toString() {
		return "\n食品编号：" + this.foodId + "\n食品名称：" + this.foodName + "\n食品介绍：" + this.foodExplain + "\n食品价格："
				+ this.foodPrice + "\n所属商家：" + this.businessId;
	}

	// set方法
	public void setFoodId(Integer foddId) {
		this.foodId = foodId;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setFoodExplain(String foodExplain) {
		this.foodExplain = foodExplain;
	}

	public void setFoodPrice(Double foodPrice) {
		this.foodPrice = foodPrice;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	// get方法
	public String getFoodName() {
		return this.foodName;
	}

	public String getFoodExplain() {
		return this.foodExplain;
	}

	public Double getFoodPrice() {
		return this.foodPrice;
	}

	public Integer getFoodId() {
		return this.foodId;
	}

	public Integer getBusinessId() {
		return this.businessId;
	}
}